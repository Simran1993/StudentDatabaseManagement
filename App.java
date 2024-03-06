/*
 * Main
 */
package Lab2.main;

/**
 * Name:Harsimranjit Singh
 * Student Number:041100738
 * Assignment2
 */

import Lab2.Base.Course;
import Lab2.Base.Student;
import Lab2.Base.StudentCourse;
import static Lab2.Base.StudentCourse.mapTermToInt;

import Lab2.DAO.CourseDAO;
import Lab2.DAO.StudentCourseDAO;
import Lab2.DAO.StudentDAO;
import java.io.BufferedReader;

import java.util.Properties;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;

/**
 * App
 */
public class App {
           

    public static void main(String[] args) {
        
        //for Validaion class
        validateCheck vg =new validateCheck();
        //for Report Genrating 
        ReportGenerater rg=new ReportGenerater();
        
        
	    // Load database properties
	    Properties dbProperties = new Properties();
	    try (FileReader reader = new FileReader("data/database.properties")) {
	        dbProperties.load(reader);
	    } catch (IOException e) {
	        e.printStackTrace();
	        return;
	    }

	    // Load CSV file
	    List<String[]> data = new ArrayList<>();
	    try (BufferedReader csvReader = new BufferedReader(new FileReader("data/bulk-import.csv"))) {
	        String line;
	        while ((line = csvReader.readLine()) != null) {
	            String[] row = line.split(",");
	            data.add(row);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	        return;
	    }


     // Register MySQL JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }


        // Validate each row and insert into the database
     // Separate valid and invalid records
        List<String> successRecords = new ArrayList<>();
        List<String> errorRecords = new ArrayList<>();
        int errorCount = 0;
        for (int i = 1; i < data.size(); i++) {
            String[] row = data.get(i);
            if (vg.isValid(row)) {
                // Insert into database
                successRecords.add("Row " + (i + 1) + ": " + String.join(",", row));
                System.out.println("Adding data to success Report..");
            } else {
                // Add to error records only if error count is less than 10
                if (errorCount < 10) {
                    errorRecords.add("Row " + (i + 1) + ": " + String.join(",", row) + " - Invalid data");
                    errorCount++;
                    System.out.println("Adding data to Error Report..");
                }
            }
        }
   // Connect to the database
     try (Connection connection = DriverManager.getConnection(
                "jdbc:" + dbProperties.getProperty("db") + "://" +
                dbProperties.getProperty("host") + ":" +
                dbProperties.getProperty("port") + "/" +
                dbProperties.getProperty("name"),
                dbProperties.getProperty("user"),
                dbProperties.getProperty("pass")
        )) {
            System.out.println("Inserting the data to Database");
            
            StudentDAO studentDAO = new StudentDAO(connection);
            CourseDAO courseDAO = new CourseDAO(connection);
        //    StudentCourseDAO studentCourseDAO = new StudentCourseDAO(connection);
            
            
            
            
            // Iterate through data and insert each row
            for (int i = 1; i < data.size(); i++) {
                String[] row = data.get(i);
                if (vg.isValid(row)) {
                    
                    Student student = new Student(Integer.parseInt(row[0]), row[1], row[2]);
                    Course course =new Course(row[3],row[4]);
                    
                    studentDAO.insertStudent(student);
                    courseDAO.insertCourse(course);
                    
                    
                successRecords.add("Row " + (i + 1) + ": " + String.join(",", row));
                } else {
                    
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



        // Generate reports
        rg.generateReport("data/Success-report.md", successRecords);
        rg.generateReport("data/error-report.md", errorRecords);
    }
	
   
 }
 
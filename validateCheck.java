/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


/**
 * Name:Harsimranjit Singh
 * Student Number:041100738
 * Assignment2
 */
public class validateCheck {
    
    public validateCheck(){
        
    }
  public static boolean isValid(String[] row) {
	    // Validate number of columns
	    if (row.length != 7) {
	        return false;
	    }

	    // Validate each column individually
	    String studentId = row[0].trim(); // Trim leading and trailing whitespace
	    String courseId = row[3].trim(); // Trim leading and trailing whitespace
	    String term = row[5].trim(); // Trim leading and trailing whitespace
	    String year = row[6].trim(); // Trim leading and trailing whitespace

	    // Validate studentId format (9 digits)
	    if (studentId.length() != 9 || !studentId.matches("\\d+")) {
	        return false;
	    }

	    // Validate courseId format (3 letters followed by 4 digits)
	    if (!courseId.matches("[A-Za-z]{3}\\d{4}")) {
	        return false;
	    }

	    // Validate term (WINTER, SUMMER, FALL)
	    if (!term.equals("WINTER") && !term.equals("SUMMER") && !term.equals("FALL")) {
	        return false;
	    }

	    // Validate year (4 digits)
	    if (year.length() != 4 || !year.matches("\\d{4}")) {
	        return false;
	    }
            

	    // Additional custom validation logic can be added here

	    return true;
	}

    
   
    
}

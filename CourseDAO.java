/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.DAO;


/**
 * Name:Harsimranjit Singh
 * Student Number:041100738
 * Assignment2
 */
import Lab2.Base.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The CourseDAO class provides methods to interact with the Course database table.
 */
public class CourseDAO {

    private Connection connection; // The database connection

    /**
     * Constructs a CourseDAO object with the specified database connection.
     *
     * @param connection The database connection.
     */
    public CourseDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * Inserts a new course into the database.
     *
     * @param course The Course object to be inserted.
     * @throws SQLException if a database access error occurs.
     */
    public void insertCourse(Course course) throws SQLException {
        String sql = "INSERT INTO Course (courseId, courseName) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, course.getCourseId());
            statement.setString(2, course.getCourseName());
            statement.executeUpdate();
        }
    }
}
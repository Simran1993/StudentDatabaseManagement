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
import Lab2.Base.StudentCourse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The StudentCourseDAO class provides methods to interact with the StudentCourse database table.
 */
public class StudentCourseDAO implements StudentCourseIn {

    private Connection connection; // The database connection

    /**
     * Constructs a StudentCourseDAO object with the specified database connection.
     *
     * @param connection The database connection.
     */
    public StudentCourseDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * Inserts a new student course into the database.
     *
     * @param studentCourse The StudentCourse object to be inserted.
     * @throws SQLException if a database access error occurs.
     */
    @Override
    public void insertStudentCourse(StudentCourse studentCourse) throws SQLException {
        String sql = "INSERT INTO StudentCourse (studentId, courseId, term, year) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, studentCourse.getStudentId());
            statement.setString(2, studentCourse.getCourseId());
            statement.setInt(3, studentCourse.getTerm());
            statement.setInt(4, studentCourse.getYear());
            statement.executeUpdate();
        }
    }
}
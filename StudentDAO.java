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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Lab2.Base.Student;

/**
 * The StudentDAO class provides methods to interact with the Student database table.
 */
public class StudentDAO implements StudentIn {

    private Connection connection; // The database connection

    /**
     * Constructs a StudentDAO object with the specified database connection.
     *
     * @param connection The database connection.
     */
    public StudentDAO(Connection connection) {
        this.connection = connection;
    }

    /**
     * Inserts a new student into the database.
     *
     * @param student The Student object to be inserted.
     * @throws SQLException if a database access error occurs.
     */
    @Override
    public void insertStudent(Student student) throws SQLException {
        String sql = "INSERT INTO Student (studentId, firstName, lastName) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, student.getStudentId());
            statement.setString(2, student.getFirstName());
            statement.setString(3, student.getLastName());
            statement.executeUpdate();
        }
    }
}
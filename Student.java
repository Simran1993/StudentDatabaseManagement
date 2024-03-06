/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.Base;


/**
 * Name:Harsimranjit Singh
 * Student Number:041100738
 * Assignment2
 */

public class Student {
    
    private int studentId; 
    
    private String firstName; 
    private String lastName; 

    /**
     * Constructs a Student object with the specified studentId, firstName, and lastName.
     *
     * @param studentId The unique identifier of the student.
     * @param firstName The first name of the student.
     * @param lastName The last name of the student.
     */
    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Returns the unique identifier of the student.
     *
     * @return The studentId.
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Sets the unique identifier of the student.
     *
     * @param studentId The new studentId.
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * Returns the first name of the student.
     *
     * @return The firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the student.
     *
     * @param firstName The new firstName.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the student.
     *
     * @return The lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the student.
     *
     * @param lastName The new lastName.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns a string representation of the Student object.
     *
     * @return A string representation including the studentId, firstName, and lastName.
     */
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

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


public class StudentCourse {
    
    private int studentId; 
    private String courseId; 
    private int term; 
    private int year; 

    /**
     * Constructs a StudentCourse object with the specified studentId, courseId, term, and year.
     *
     * @param studentId The unique identifier of the student.
     * @param courseId The unique identifier of the course.
     * @param term The term in which the course is taken.
     * @param year The year in which the course is taken.
     */
    public StudentCourse(int studentId, String courseId, int term, int year) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.term = term;
        this.year = year;
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
     * Returns the unique identifier of the course.
     *
     * @return The courseId.
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * Sets the unique identifier of the course.
     *
     * @param courseId The new courseId.
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * Returns the term in which the course is taken.
     *
     * @return The term.
     */
    public int getTerm() {
        return term;
    }

    /**
     * Sets the term in which the course is taken.
     *
     * @param term The new term.
     */
    public void setTerm(int term) {
        this.term = term;
    }

    /**
     * Returns the year in which the course is taken.
     *
     * @return The year.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year in which the course is taken.
     *
     * @param year The new year.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns a string representation of the StudentCourse object.
     *
     * @return A string representation including the studentId, courseId, term, and year.
     */
    @Override
    public String toString() {
        return "StudentCourse{" +
                "studentId=" + studentId +
                ", courseId='" + courseId + '\'' +
                ", term=" + term +
                ", year=" + year +
                '}';
    }
    
    /**
     * Maps a string representation of a term to its corresponding integer value.
     *
     * @param term The term as a string (e.g., "Winter", "Summer", "Fall").
     * @return The integer representation of the term (1 for Winter, 2 for Summer, 3 for Fall).
     * @throws IllegalArgumentException if the term string is not recognized.
     */
    public static int mapTermToInt(String term) {
        switch (term.trim().toUpperCase()) {
            case "WINTER":
                return 1;
            case "SUMMER":
                return 2;
            case "FALL":
                return 3;
            default:
                throw new IllegalArgumentException("Invalid term: " + term);
        }
    }
}


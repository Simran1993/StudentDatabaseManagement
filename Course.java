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


public class Course {
    private String courseId;
    private String courseName;

   /**
     * Constructs a Course object with the specified courseId and courseName.
     *
     * @param courseId The unique identifier of the course.
     * @param courseName The name of the course.
     */
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
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
     * Returns the name of the course.
     *
     * @return The courseName.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the name of the course.
     *
     * @param courseName The new courseName.
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Returns a string representation of the Course object.
     *
     * @return A string representation including the courseId and courseName.
     */
    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}

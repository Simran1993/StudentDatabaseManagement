/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lab2.DAO;

import Lab2.Base.Course;
import java.sql.SQLException;

/**
 *
 * @author OWNER
 */
public interface CourseIn {
    void insertCourse(Course course) throws SQLException;
}

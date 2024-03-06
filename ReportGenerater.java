/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2.main;


/**
 * Name:Harsimranjit Singh
 * Student Number:041100738
 * Assignment2
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ReportGenerater {
    public static void generateReport(String filename, List<String> records) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Date and Time: " + java.time.LocalDateTime.now());
            writer.println("Number of records: " + records.size());
            for (String record : records) {
                writer.println(record);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
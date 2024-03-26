package edu.fit.ntudp.polizhak;

import java.sql.*;

public class Run {



        static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";
        static final String USER = "sa";
        static final String PASS = "";

        public static void main(String[] args) {
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 Statement stmt = conn.createStatement()) {


                printStudentsBornInMonth(stmt, "06");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        static void printStudentsBornInMonth(Statement stmt, String month) throws SQLException {
            String sql = "SELECT * FROM students WHERE MONTH(birth_date) = '" + month + "'";
            try (ResultSet rs = stmt.executeQuery(sql)) {
                System.out.println("Students born in month " + month + ":");
                while (rs.next()) {
                    String studentname = rs.getString("student_name");

                    String birthDate = rs.getString("birth_date");
                    String studentId = rs.getString("student_id");
                    System.out.println(studentname + " " + ", Birth Date: " + birthDate + ", Student ID: " + studentId);
                }
            }
        }


}

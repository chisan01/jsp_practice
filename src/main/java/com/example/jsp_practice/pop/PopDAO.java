package com.example.jsp_practice.pop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PopDAO {
    private Connection conn;
    private ResultSet rs;

    public PopDAO() {
        try {
            String dbURL = "jdbc:mysql://localhost:3307/web_programming?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
            String dbID = "root";
            String dbPassword = "1234";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Pop getPOP(String Location) {

        String SQL = "SELECT * FROM koreapop WHERE region = ?";

        try {
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, Location);

            rs = pstmt.executeQuery();
            if (rs.next()) {
                Pop pop = new Pop();
                pop.setLocation(rs.getString("region"));
                pop.setTotalPop(rs.getInt("total_pop"));
                pop.setMalePop(rs.getInt("male_pop"));
                pop.setFemalePop(rs.getInt("female_pop"));
                System.out.println(pop);
                return pop;
            }
        } catch (Exception e) {
            System.out.println("1");
            e.printStackTrace();
        }
        return null;
    }
}
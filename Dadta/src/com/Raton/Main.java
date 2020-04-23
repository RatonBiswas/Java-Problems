package com.Raton;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            //Class.forName("org.sql.jdbc");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Raton Biswas\\IdeaProjects\\Dadta\\school.db");

            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS studentInfo(name TEXT, phone INTEGER, address TEXT)");
//            statement.execute("INSERT INTO studentInfo(name, phone, address) VALUES ('Raton', 554545, 'Chandpur')");
//            statement.execute("INSERT INTO studentInfo(name, phone, address) VALUES ('Rakhi', 12121, 'Chandpur')");

//            statement.execute("update studentInfo set phone = 52852 where name = 'Raton'");

//            statement.execute("delete from studentInfo where name = 'Rakhi'");

            statement.execute("select * from studentInfo");
            ResultSet results = statement.getResultSet();

            while(results.next()) {
                System.out.println(results.getString("name") + " " +
                                   results.getInt("phone") + " " +
                                   results.getString("address"));
            }


            results.close();
            statement.close();
            connection.close();

        } catch (SQLException sq) {
            System.out.println("Wrong : "+sq.getMessage());
        }
    }
}

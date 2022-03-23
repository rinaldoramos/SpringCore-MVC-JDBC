package com.seleniumexpress.foodcart.DAO;

import com.seleniumexpress.foodcart.entity.Food;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil {

    public static List<Food> getFoodList() throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/foodboxdb?useSSL=false";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String pass = "admin";

        ArrayList<Food> foods = new ArrayList<>();

        //load the mysql driver
        Class.forName(driver);

        //get the connection
        Connection connection = DriverManager.getConnection(url, user, pass);

        //create the statement
        Statement statement = connection.createStatement();

        //execute the statement and loop over the result set
        ResultSet resultSet = statement.executeQuery("SELECT * FROM foodcart");

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String item = resultSet.getString(2);
            double price = resultSet.getDouble(3);

            Food tempFood = new Food(id, item, price);
            foods.add(tempFood);
        }
        return foods;
    }
}

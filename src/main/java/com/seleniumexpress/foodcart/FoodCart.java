package com.seleniumexpress.foodcart;

import com.seleniumexpress.foodcart.DAO.FoodCartDbUtil;
import com.seleniumexpress.foodcart.entity.Food;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "FoodCart", value = "/FoodCart")
public class FoodCart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //get data from the database (model)
        String message = "Rinaldo";
        try {
            List<Food> foodItems = FoodCartDbUtil.getFoodList();

            request.setAttribute("message", message);
            request.setAttribute("foodItems", foodItems);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        //redirect to a different page (view)
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-food.jsp");
        requestDispatcher.forward(request, response);
    }
}

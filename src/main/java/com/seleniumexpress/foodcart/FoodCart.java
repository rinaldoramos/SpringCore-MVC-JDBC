package com.seleniumexpress.foodcart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FoodCart", value = "/FoodCart")
public class FoodCart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //get data from the database (model)

        //redirect to a different page (view)

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-food.jsp");
        requestDispatcher.forward(request, response);
    }
}

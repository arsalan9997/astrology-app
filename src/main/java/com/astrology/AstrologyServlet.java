package com.astrology;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/predict")
public class AstrologyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String dobString = request.getParameter("dob");
        String birthPlace = request.getParameter("birthPlace");

        try {
            LocalDate dob = LocalDate.parse(dobString);
            String zodiac = PredictionService.getZodiacSign(dob);
            String prediction = PredictionService.getPrediction(zodiac);

            request.setAttribute("name", name);
            request.setAttribute("dob", dobString);
            request.setAttribute("birthPlace", birthPlace);
            request.setAttribute("zodiac", zodiac);
            request.setAttribute("prediction", prediction);

            request.getRequestDispatcher("/result.jsp").forward(request, response);
        } catch (Exception e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid date of birth");
        }
    }
}

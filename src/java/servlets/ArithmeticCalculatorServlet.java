package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ethan
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstValString = request.getParameter("firstVal");
        String secondValString = request.getParameter("secondVal");
        int firstValInt = 0;
        int secondValInt = 0;
        int result;

        request.setAttribute("firstVal", firstValString);
        request.setAttribute("secondVal", secondValString);

        try {
            firstValInt = Integer.parseInt(firstValString);
            secondValInt = Integer.parseInt(secondValString);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("message", "invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        }

        if (request.getParameter("addition") != null) {
            result = firstValInt + secondValInt;
            request.setAttribute("message", result);
        } else if (request.getParameter("subtract") != null) {
            result = firstValInt - secondValInt;
            request.setAttribute("message", result);
        } else if (request.getParameter("multiply") != null) {
            result = firstValInt * secondValInt;
            request.setAttribute("message", result);
        } else if (request.getParameter("modulus") != null) {
            result = firstValInt % secondValInt;
            request.setAttribute("message", result);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
}

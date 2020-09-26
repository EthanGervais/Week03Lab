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
public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculatorForm.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String currentAge = request.getParameter("currentAge");
        
        if (currentAge == null || currentAge.equals("")) {
            request.setAttribute("message", "You must give your current age.");
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculatorForm.jsp")
                .forward(request, response);
            return;
        }
        
        try {
        Integer ageNextYear = Integer.parseInt(currentAge) + 1;
        request.setAttribute("message", "You age next birthday will be " + ageNextYear);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            request.setAttribute("message", "You must enter a number.");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculatorForm.jsp")
                .forward(request, response);
    }
}

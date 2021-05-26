package servlets;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DWEI
 * Date: May 26 / 2021
 */
public class arithmeticcalculatorServlet extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //setting result when page first loads
        request.setAttribute("message", "---");
        
        //this will display the requested jsp as a view
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
       
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //capture the first number entered
        String first = request.getParameter("first_number");
        String second = request.getParameter("second_number");
        
        //set variables
        request.setAttribute("firstNumber", first);
        request.setAttribute("secondNumber", second);
        
        //pattern for checking digits only
        Pattern pattern = Pattern.compile("\\d+");
        //pattern for spaces only
        Pattern patternSpace = Pattern.compile(" +");
        
        //if else statements for error checking
        if(first == null || first.equals("") || patternSpace.matcher(first).matches() || 
             second == null || second.equals("") || patternSpace.matcher(second).matches() || 
                !pattern.matcher(first).matches() || !pattern.matcher(second).matches()){
            //error message to help guide the users
            request.setAttribute("message", "Invalid");
            
            //display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            
            return;
        }
        
        //get the value for the button clicked
        String[] check = request.getParameterValues("calculate");
        char calculate = check[0].charAt(0);
        
        //parse string number into integers
        int firstNumber = Integer.parseInt(first);
        int secondNumber = Integer.parseInt(second);
        
        //variable to hold answer
        double answer = 0;
        
        //switch statement for calculation
        switch(calculate){
            
            case'+':
                answer = firstNumber + secondNumber;
                break;
            case'-':
                answer = firstNumber - secondNumber;
                break;
            case'*':
                answer = firstNumber * secondNumber;
                break;
            case'%':
                answer = firstNumber % secondNumber;
                break;
             
        }
        //displaying age for users
        request.setAttribute("message", answer);
        
        //display age calculator JSP
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    

}

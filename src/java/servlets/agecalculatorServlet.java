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
public class agecalculatorServlet extends HttpServlet {

 

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //this will display the requested jsp as a view
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //capture the age parameter entered
        String age = request.getParameter("age");
        
        
        //pattern for checking digits only
        Pattern pattern = Pattern.compile("\\d+");
        //pattern for spaces only
        Pattern patternSpace = Pattern.compile(" +");
        
        //if else statements for error checking
        if(age == null || age.equals("") || patternSpace.matcher(age).matches()){
            //error message to help guide the users
            request.setAttribute("message", "You must give your current age");
            
            //display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            
            return;
        }else if(!pattern.matcher(age).matches()){
            
            //error message to help guide the users
            request.setAttribute("message", "You must enter a number");
            
            //display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            
            return;
        }
        
        //set attributes
        request.setAttribute("age", age);
        
        //calculating age on next birthday
        int ageNumber = Integer.parseInt(age);
        int displayAge = ageNumber + 1;
        
        //displaying age for users
        request.setAttribute("message", "Your age next birthday will be " + displayAge);
        
        //display age calculator JSP
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }


}

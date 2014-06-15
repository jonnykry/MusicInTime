package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jonnykry
 */
@WebServlet(name = "MusicInTime", urlPatterns = {"/MusicInTime"})
public class MusicInTime extends HttpServlet {

    private static void run() {
       UserData.getData();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {           
            run();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello, " + UserData.username + ".  Your playcount is " + UserData.playcount + ".</h1>");
            out.println("<h1>That means you've spent (roughly) " + UserData.totalSeconds + " seconds of your life listening to music!</h1>");
            out.println("<h1>or " + UserData.totalMinutes + " minutes</h1>");
            out.println("<h1>or " + UserData.totalHours + " hours</h1>");
            out.println("<h1>or " + UserData.totalDays + " days</h1>");
            out.println("<h1>or " + UserData.totalYears + " years</h1>");
            out.println("<title>Servlet MusicInTime</title>");            
            out.println("</head>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}

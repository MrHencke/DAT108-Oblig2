package no.hvl.dat108;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Time;

/**
 * Servlet implementation class Inputhandler
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				String fornavn = request.getParameter("fname");	//Fornavnet som brukeren tastet inn.
				String etternavn = request.getParameter("lname");  //Etternavnet som brukeren tastet inn.
				String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
				String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

				response.setContentType("text/html; charset=ISO-8859-1");
				PrintWriter out = response.getWriter();
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<meta charset=\"ISO-8859-1\">");
				out.println("<link rel=\"stylesheet\" href=\"style.css\">");
				out.println("<title>Kvittering</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<div class=\"result\">");
				out.println("<p>Hei, " + fornavn + " " + etternavn +"</p>");
				out.println("<p>Din registrering ble mottatt klokken " + time + " den " + date + "</p>");
				out.println("</div>");
				out.println("</body>");
				out.println("</html>");
				
				out.close();
				
		doGet(request, response);
	}

}

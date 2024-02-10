package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlete")
public class RegisterServlete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String username  =request.getParameter("fname");
		String email  =request.getParameter("femail");
		String password =request.getParameter("fpass");
		String dob =request.getParameter("fdate");
		String address =request.getParameter("faddress");
		
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/myedatabase?user=root&password=Rewa@123");
	PreparedStatement pre = con.prepareStatement("insert into usertable values(?,?,?,?,?)");
	pre.setString(1, username);
	pre.setString(2, email);
	pre.setString(3, password);
	pre.setString(4, dob);
	pre.setString(5, address);
	int rs = pre.executeUpdate();
	if(rs>0) {
		pw.print("<h1> successfuly Enter</h1>");
		
	}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}

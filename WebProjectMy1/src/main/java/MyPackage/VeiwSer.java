package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/VeiwSer")
public class VeiwSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/myedatabase?user=root&password=Rewa@123");
			PreparedStatement pre = con.prepareStatement("select* from usertable");
			ResultSet rs = pre.executeQuery();
			pw.print("<table width=auto border=1>");
			ResultSetMetaData rsd = rs.getMetaData();
			int CountCol = rsd.getColumnCount();
			pw.print("<tr>");
			for(int i=1;i<=CountCol;i++) {
				pw.print("<th>"+ rsd.getColumnName(i)+"</th>");
			}
			while(rs.next()) {
				pw.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr>");
			}
			pw.print("</tr>");
	
		}
		catch(Exception e) {
			
		}
		pw.print("</table>");
		
	}

}

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("user1");
		String b=request.getParameter("pass");
		PrintWriter out = response.getWriter();
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_program?useSSL=false","root","");
		PreparedStatement ps=con.prepareStatement("select sname,suserid,email from student where suserid='"+a+"' && spass='"+b+"'");
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			out.print("<h1> User Logged In Successfully!...</h1>");;
//			response.sendRedirect("LoginSuccess.jsp?Success");
			}
		else {
			out.print("<h1> Please Provide Correct Username or Password!..Retry Again!..</h1>");
//			response.sendRedirect("LoginFailure.jsp?Failure");
			}
		}catch(Exception e2){
			e2.printStackTrace();
			out.print(e2 + "");
		}
	}
}
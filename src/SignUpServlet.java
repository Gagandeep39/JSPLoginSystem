

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public SignUpServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("uidd");
		String x = request.getParameter("unn");
		String b = request.getParameter("passs");
		String c = request.getParameter("mobb");
		String d = request.getParameter("eidd");
		java.util.Date now = new java.util.Date();
		String DATE_FORMAT = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		String strDateNew = sdf.format(now) ;

		PrintWriter out = response.getWriter();
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_program?useSSL=false","root","");
		PreparedStatement ps=con.prepareStatement("insert into student(sname,suserid,spass,mobile,email,date) values(?,?,?,?,?,'"+strDateNew+"')");
		ps.setString(1,x);
		ps.setString(2,a);
		ps.setString(3,b);
		ps.setString(4,c);
		ps.setString(5,d);
		ps.executeUpdate();
		if(ps != null) {
			out.print("<h1>Registered successfully</h1>");
//			response.sendRedirect("index.jsp?success");
		}
		}
		catch(Exception e1)
		{
		out.print(e1.getMessage());
		}
	}

}

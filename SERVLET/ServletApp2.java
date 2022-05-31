// Display.java
package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/dis")

public class Display implements Servlet{
	public void init(ServletConfig sc)throws javax.servlet.ServletException {
		//NO code
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String pC = req.getParameter("pcdoe");
		String pN = req.getParameter("pname");
		float pP = Float.parseFloat(req.getParameter("pprice"));
		int pQ = Integer.parseInt(req.getParameter("pqty"));
		
		pw.println("===Product Detauls===");
		pw.println("<br>PCode:"+pC);
		pw.println("<br>PName:"+pN);
		pw.println("<br>PPrice:"+pP);
		pw.println("<br>PQty:"+pQ);
	}
	public void destroy() {
		//no code
	}
	public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}
	public String getServletInfo() {
		return "DisplayServlet";
	}
}



// input.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="dis" method="post">
	ProductCode:<input type="text" name="pcode"><br>
	ProductName:<input type="text" name="pname"><br>
	ProductPrice:<input type="text" name="pprice"><br>
	ProductQty:<input type="text" name="pqty"><br>
	<input type="submit" value="Display">
	</form>
</body>
</html>


// web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app>
	<welcome-file-list>
	<welcome-file>
	input.html
	</welcome-file>
	</welcome-file-list>
</web-app>

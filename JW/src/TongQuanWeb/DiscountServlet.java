package TongQuanWeb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String des=request.getParameter("des");
        Float price=Float.parseFloat(request.getParameter("price"));
        Float discount=Float.parseFloat(request.getParameter("discount"));
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: "+des+"</h1>");
        writer.println("<h1>List Price: $"+price+"</h1>");
        writer.println("<h1>Discount Percent: "+discount+"%</h1>");
        writer.println("<h1>Discount Amount: $"+price*discount*0.001+"</h1>");
        writer.println("<h1>Discount Price: $"+(price-price*discount*0.001)+"</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

package JSP;

import JSP.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/resultcustomer.jsp")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList=new ArrayList<>();
        customerList.add(new Customer("A","21-11-1997","Đà Nẵng","../JSP/image/0.jpg"));
        customerList.add(new Customer("B","21-11-1997","Đà Nẵng","../JSP/image/a.jpg"));
        request.setAttribute("danhSachkhachhang", customerList);
        request.getRequestDispatcher("JSP/resultcustomer.jsp").forward(request, response);
    }
}

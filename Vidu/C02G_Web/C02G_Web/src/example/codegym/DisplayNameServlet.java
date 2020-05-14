package example.codegym;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayNameServlet", urlPatterns = "/displayName")
public class DisplayNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("tenHocVien");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("Tên người dùng là:");
        out.println("<h1>" + name + " post </h1>");
        out.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name = request.getParameter("tenHocVien");

//        PrintWriter out = response.getWriter();
//        out.println("<html>");
//        out.println("Tên người dùng là:");
//        out.println("<h1>" + name + " get </h1>");
//        out.println("</html>");

        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}

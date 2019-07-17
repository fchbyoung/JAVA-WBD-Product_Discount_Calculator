import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("txtDescription");
        double price = Double.parseDouble(request.getParameter("txtPrice"));
        double listPrice = Double.parseDouble(request.getParameter("txtPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("txtDiscountPercent"));


        double amount = listPrice * discountPercent * 0.1;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("Product Description: " + description);
        writer.println("List Price: " + price);
        writer.println("Discount Percent: " + discountPercent);
        writer.println("Discount Amount: " + amount);

        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

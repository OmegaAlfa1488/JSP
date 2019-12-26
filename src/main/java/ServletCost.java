import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletCost extends HelloServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String kmStr = request.getParameter("km");
String kgStr = request.getParameter("kg");

int km = Integer.parseInt(kmStr);
double kg = Integer.parseInt(kgStr);
Chair chair = new Chair(kg);
CostForShipping costForShipping = new CostForShipping(500, 20);
double cost = costForShipping.calcCost(chair ,km);
        PrintWriter printWriter = response.getWriter();
        printWriter.write("cost" + cost);
    }
}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/allData")
public class AccountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user=(User)req.getSession().getAttribute("user");
        resp.getWriter().println("id: "+user.getID());
        resp.getWriter().println("name: "+user.getName());
        resp.getWriter().println("login: "+user.getLogin());
        resp.getWriter().println("password: "+user.getPassword());


    }
}

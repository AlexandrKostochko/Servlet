import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/authorization")
public class AuthorizationServlet extends HttpServlet {
    InMemoryUserStorage storage = new InMemoryUserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if(password.equals(storage.getByLogin(login).getPassword())){
            req.getSession().setAttribute("user",storage.getByLogin(login));
        }




        //chek

    }
}

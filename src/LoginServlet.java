import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String emailSession = (String) request.getSession().getAttribute("emailSession");
        if(emailSession == null || emailSession.isEmpty() ){
            this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);

        } else {
            this.getServletContext().getRequestDispatcher("/home").forward(request, response);

        }

    }
}

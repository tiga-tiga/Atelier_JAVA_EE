package fr.wildcodeschool.wildmail;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HomeServlet", urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //on recupere l'email en POST depuis le formulaire
        String email = request.getParameter("email");

        // on attribut la valeur email a la session
        request.getSession().setAttribute( "emailSession", email );




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = (String )request.getSession().getAttribute( "emailSession" );
        MailBean mailBean = new MailBean();
        mailBean.setFrom(email);
        mailBean.setTo("Georges");
        mailBean.setContent("salut salut");
        request.setAttribute("mailbean", mailBean);

        this.getServletContext().getRequestDispatcher("/maillist.jsp").forward(request, response);

    }
}

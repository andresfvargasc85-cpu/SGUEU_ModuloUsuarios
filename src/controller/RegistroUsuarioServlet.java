package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UsuarioSGUEU;

@WebServlet("/RegistroUsuarioServlet")
public class RegistroUsuarioServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("registroUsuario.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String nombreCompleto = request.getParameter("nombreCompleto");
        String correo = request.getParameter("correo");
        String username = request.getParameter("username");
        String rol = request.getParameter("rol");

        UsuarioSGUEU usuario = new UsuarioSGUEU(nombreCompleto, correo, username, rol);
        request.setAttribute("usuarioRegistrado", usuario);

        RequestDispatcher dispatcher = request.getRequestDispatcher("resultadoRegistro.jsp");
        dispatcher.forward(request, response);
    }
}

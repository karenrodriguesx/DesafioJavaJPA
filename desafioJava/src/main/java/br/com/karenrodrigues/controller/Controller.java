package br.com.karenrodrigues.controller;

import br.com.karenrodrigues.model.DAO;
import br.com.karenrodrigues.model.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/controller", "/insert", "/listaUsuarios", "/delete", "/select", "/update"})
public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();

    Usuario usuario = new Usuario();

    public Controller() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();
        System.out.print(action);
        if (action.equals("/listaUsuarios")) {
            usuarios(request, response);
        } else if (action.equals("/insert")) {
            novoUsuario(request, response);
        } else if (action.equals("/delete")) {
            excluirUsuario(request, response);
        } else if (action.equals("/select")) {
            selecionarUsuario(request, response);
        } else if (action.equals("/update")) {
            atualizarUsuario(request, response);
        }
    }

    //Listar usuarios cadatrados
    protected void usuarios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Usuario> listaUsuarios = dao.listaUsuarios();

        request.setAttribute("usuarios", listaUsuarios);
        RequestDispatcher rd = request.getRequestDispatcher("listaUsuarios.jsp");
        rd.forward(request, response);
    }

    protected void novoUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        usuario.setNome(request.getParameter("nome"));
        usuario.setProfissao(request.getParameter("profissao"));
        usuario.setIdade(Integer.parseInt(request.getParameter("idade")));

        dao.insert(usuario);

        response.sendRedirect("listaUsuarios");
    }

    protected void selecionarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        usuario.setId(id);

        dao.select(usuario);

        request.setAttribute("nome", usuario.getNome());
        request.setAttribute("profissao", usuario.getProfissao());
        request.setAttribute("idade", usuario.getIdade());

        RequestDispatcher rd = request.getRequestDispatcher("editarUsuario.jsp");
        rd.forward(request, response);
    }

    protected void atualizarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        usuario.setNome(request.getParameter("nome"));
        usuario.setProfissao(request.getParameter("profissao"));
        usuario.setIdade(Integer.parseInt(request.getParameter("idade")));

        dao.update(usuario);

        response.sendRedirect("listaUsuarios");
    }

    protected void excluirUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        usuario.setId(id);

        dao.delete(usuario);

        response.sendRedirect("listaUsuarios");
    }

}


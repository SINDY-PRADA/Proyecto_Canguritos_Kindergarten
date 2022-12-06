package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Operaciones;

public class loginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Operaciones op = new Operaciones();
    
        if(req.getParameter("btnIngresar")!=null){
        String nombre=req.getParameter("txtUsuario");
        String contra=req.getParameter("txtContra");
  
        HttpSession sesion = req.getSession();
  
        switch(op.loguear(nombre, contra)){
          case 1:
            sesion.setAttribute("username", nombre);
            sesion.setAttribute("nivel", "1");
            resp.sendRedirect("dashboard.jsp");
          break;
  
          case 2:
            sesion.setAttribute("username", nombre);
            sesion.setAttribute("nivel", "2");
            resp.sendRedirect("dashboardestudiante.jsp");
          break;
  
          default: 
          resp.sendRedirect("login.jsp");
            break;
          
        }
    }
  }
}

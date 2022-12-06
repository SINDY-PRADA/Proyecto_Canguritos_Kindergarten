package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.usuarioDao;
import model.usuarioVo;


    public class usuarioController extends HttpServlet {
    usuarioVo r = new usuarioVo();
    usuarioDao rd = new usuarioDao();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String accion=req.getParameter("accion");

        switch(accion){
            case "index":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            case "añadirUsuario":
                formulario(req,resp);
            break;
            case "consultarUsuario":
                listar(req,resp);
            break;       
            case "editarUsuario":
                actualizar(req,resp);
            break;
            case "eliminarUsuario":
                eliminar(req,resp);
            break;
            
            case "estado":
                estado(req,resp);
        break;
        }
         
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String accion=req.getParameter("accion");

        switch(accion){
            case "add":
                add(req,resp);
            break;
            
            case "actualizar":
            edit(req, resp);
        break;
    }
}


       private void formulario(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("views/Usuario/addUsuario.jsp").forward(req, resp);
            System.out.println("Formulario abierto exitosamente");
        }catch(Exception e){
            System.out.println("El formulario no ha sido abierto con éxito"+e.getMessage().toString());
        }
    }

//AGREGAR USUARIO
    private void add(HttpServletRequest req, HttpServletResponse resp) {

        if(req.getParameter("nombreUsuario")!=null){
            r.setUsername(req.getParameter("nombreUsuario"));
        }

        if (req.getParameter("contrasenaUsuario")!=null) {
            r.setPass(req.getParameter("contrasenaUsuario"));  
        } 

        if(req.getParameter("estadoUsuario")!=null){
            r.setEstadoUsuario(true);
        }

        if(req.getParameter("rol")!=null){
            r.setNivel(req.getParameter("rol"));
        }
        try {
            rd.add(r);
            System.out.println("El Registro fue insertado correctamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error en la inserción del registro "+e.getMessage().toString());
        }
    }

//LISTAR USUARIO
        private void listar (HttpServletRequest req, HttpServletResponse resp) {
            try {
                List usuarioList=rd.listar();
                req.setAttribute("listar", usuarioList);
                req.getRequestDispatcher("views/Usuario/listUsuario.jsp").forward(req, resp);
                System.out.println("Datos listados para la edición");
            } catch (Exception e) {
                System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
            } 
        }  

//MODIFICAR USUARIO
    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idUsuario")!=null){
            r.setIdUsuario(Integer.parseInt(req.getParameter("idUsuario")));
        }
        try {
            List usuarioLists=rd.listarUsuarios(r.getIdUsuario());
            req.setAttribute("usuarioLists", usuarioLists);
            req.getRequestDispatcher("views/Usuario/editUsuario.jsp").forward(req, resp);
            System.out.println("Datos listados exitosamente en la edición");

        } catch (Exception e) {
            System.out.println("Ocurrió problemas al listar los datos "+e.getMessage().toString());
        }
    }

    private void edit(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idUsuario")!=null){
            r.setIdUsuario(Integer.parseInt(req.getParameter("idUsuario")));
        }
        if(req.getParameter("nombreUsuario")!=null){
            r.setUsername(req.getParameter("nombreUsuario"));
        }
        if(req.getParameter("contrasenaUsuario")!=null){
            r.setPass(req.getParameter("contrasenaUsuario"));
        }
        if(req.getParameter("estadoUsuario")!=null){
            r.setEstadoUsuario(Boolean.parseBoolean(req.getParameter("estadoUsuario")));
        }
        if(req.getParameter("rol")!=null){
            r.setNivel(req.getParameter("rol"));
        }
        try {
            rd.actualizar(r);
            System.out.println("Editar el registro del usuario");
            listar(req, resp);

        } catch (Exception e) {
            System.out.println("Ocurrió un Error al editar "+e.getMessage().toString());
        }
    }


    //ELIMINAR USUARIO
    private void eliminar(HttpServletRequest req, HttpServletResponse resp){
        if(req.getParameter("idUsuario")!=null){
            r.setIdUsuario(Integer.parseInt(req.getParameter("idUsuario")));//Cambiar de string a int
        }
        try {
            rd.eliminar(r.getIdUsuario());;
            System.out.println("Usuario eliminado exitosamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error al eliminar"+e.getMessage().toString());
        }
    }

    //ESTADO USUARIO
    private void estado(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idUsuario")!=null){
            r.setIdUsuario(Integer.parseInt(req.getParameter("idUsuario")));
        }
        if(req.getParameter("estadoUsuario")!=null){
            r.setEstadoUsuario(Boolean.parseBoolean(req.getParameter("estadoUsuario")));
        }
        try {
            rd.estado(r.getIdUsuario(), r.getEstadoUsuario());
            System.out.println("Estado cambiado exitosamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error en el cambio de estado "+e.getMessage().toString());
        }
    }

}


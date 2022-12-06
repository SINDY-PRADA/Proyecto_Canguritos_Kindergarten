package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.acudienteDao;
import model.acudienteVo;

    public class acudienteController extends HttpServlet {
    acudienteVo r = new acudienteVo();
    acudienteDao rd = new acudienteDao();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String accion=req.getParameter("accion");

        switch(accion){
            case "index":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            case "añadirAcudiente":
                formulario(req,resp);
            break;
            case "consultarAcudiente":
                listar(req,resp);
            break;       
            case "editarAcudiente":
                actualizar(req,resp);
            break;
            case "eliminarAcudiente":
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
            req.getRequestDispatcher("views/Acudiente/addAcudiente.jsp").forward(req, resp);
            System.out.println("Formulario abierto exitosamente");
        }catch(Exception e){
            System.out.println("El formulario no ha sido abierto con éxito"+e.getMessage().toString());
        }
    }

//AGREGAR ACUDIENTE
    private void add(HttpServletRequest req, HttpServletResponse resp) {

        if(req.getParameter("parentescoAcudiente")!=null){
            r.setParentescoAcudiente(req.getParameter("parentescoAcudiente"));
        }

        if (req.getParameter("nombreAcudiente")!=null) {
            r.setNombreAcudiente(req.getParameter("nombreAcudiente"));  
        } 
      
        if (req.getParameter("apellidoAcudiente")!=null) {
            r.setApellidoAcudiente(req.getParameter("apellidoAcudiente"));   
        }

        if (req.getParameter("tipoDocumento")!=null) {
            r.setTipoDocumento(req.getParameter("tipoDocumento"));   
        }
        
        if (req.getParameter("documentoAcudiente")!=null) {
            r.setDocumentoAcudiente(req.getParameter("documentoAcudiente"));   
        }

        if (req.getParameter("profesionAcudiente")!=null) {
            r.setProfesionAcudiente(req.getParameter("profesionAcudiente"));   
        }

        if (req.getParameter("telefonoAcudiente")!=null) {
            r.setTelefonoAcudiente(req.getParameter("telefonoAcudiente"));   
        }
        
        if (req.getParameter("direccionAcudiente")!=null) {
            r.setDireccionAcudiente(req.getParameter("direccionAcudiente"));   
        }
        
        if (req.getParameter("correoAcudiente")!=null) {
            r.setCorreoAcudiente(req.getParameter("correoAcudiente"));
        }   

        if(req.getParameter("estadoAcudiente")!=null){
            r.setEstadoAcudiente(true);
        }
        try {
            rd.add(r);
            System.out.println("El Registro fue insertado correctamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error en la inserción del registro "+e.getMessage().toString());
        }
    }

//LISTAR ACUDIENTE
        private void listar (HttpServletRequest req, HttpServletResponse resp) {
            try {
                List acudienteList=rd.listar();
                req.setAttribute("listar", acudienteList);
                req.getRequestDispatcher("views/Acudiente/listAcudiente.jsp").forward(req, resp);
                System.out.println("Datos listados para la edición");
            } catch (Exception e) {
                System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
            } 
        }  

//MODIFICAR ACUDIENTE
    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idAcudiente")!=null){
            r.setIdAcudiente(Integer.parseInt(req.getParameter("idAcudiente")));
        }
        try {
            List acudienteLists=rd.listarAcudientes(r.getIdAcudiente());
            req.setAttribute("acudienteLists", acudienteLists);
            req.getRequestDispatcher("views/Acudiente/editAcudiente.jsp").forward(req, resp);
            System.out.println("Datos listados exitosamente en la edición");

        } catch (Exception e) {
            System.out.println("Ocurrió problemas al listar los datos "+e.getMessage().toString());
        }
    }

    private void edit(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idAcudiente")!=null){
            r.setIdAcudiente(Integer.parseInt(req.getParameter("idAcudiente")));
        }
        if(req.getParameter("parentescoAcudiente")!=null){
            r.setParentescoAcudiente(req.getParameter("parentescoAcudiente"));
        }
        if(req.getParameter("nombreAcudiente")!=null){
            r.setNombreAcudiente(req.getParameter("nombreAcudiente"));
        }
        if(req.getParameter("apellidoAcudiente")!=null){
            r.setApellidoAcudiente(req.getParameter("apellidoAcudiente"));
        }
        if(req.getParameter("tipoDocumento")!=null){
            r.setTipoDocumento(req.getParameter("tipoDocumento"));
        }
        if(req.getParameter("documentoAcudiente")!=null){
            r.setDocumentoAcudiente(req.getParameter("documentoAcudiente"));
        }
        if(req.getParameter("profesionAcudiente")!=null){
            r.setProfesionAcudiente(req.getParameter("profesionAcudiente"));
        }
        if(req.getParameter("telefonoAcudiente")!=null){
            r.setTelefonoAcudiente(req.getParameter("telefonoAcudiente"));
        }
        if(req.getParameter("direccionAcudiente")!=null){
            r.setDireccionAcudiente(req.getParameter("direccionAcudiente"));
        }
        if(req.getParameter("correoAcudiente")!=null){
            r.setCorreoAcudiente(req.getParameter("correoAcudiente"));
        }
        if(req.getParameter("estadoAcudiente")!=null){
            r.setEstadoAcudiente(Boolean.parseBoolean(req.getParameter("estadoAcudiente")));
        }
        try {
            rd.actualizar(r);
            System.out.println("Editar el registro del acudiente");
            listar(req, resp);

        } catch (Exception e) {
            System.out.println("Ocurrió un Error al editar "+e.getMessage().toString());
        }
    }


    //ELIMINAR ACUDIENTE
    private void eliminar(HttpServletRequest req, HttpServletResponse resp){
        if(req.getParameter("idAcudiente")!=null){
            r.setIdAcudiente(Integer.parseInt(req.getParameter("idAcudiente")));//Cambiar de string a int
        }
        try {
            rd.eliminar(r.getIdAcudiente());;
            System.out.println("Acudiente eliminado exitosamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error al eliminar"+e.getMessage().toString());
        }
    }

    //ESTADO ACUDIENTE
    private void estado(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idAcudiente")!=null){
            r.setIdAcudiente(Integer.parseInt(req.getParameter("idAcudiente")));
        }
        if(req.getParameter("estadoAcudiente")!=null){
            r.setEstadoAcudiente(Boolean.parseBoolean(req.getParameter("estadoAcudiente")));
        }
        try {
            rd.estado(r.getIdAcudiente(), r.getEstadoAcudiente());
            System.out.println("Estado cambiado exitosamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error en el cambio de estado "+e.getMessage().toString());
        }
    }

}


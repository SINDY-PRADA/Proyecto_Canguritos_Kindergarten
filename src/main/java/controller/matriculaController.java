package controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.matriculaDao;
import model.matriculaVo;


    public class matriculaController extends HttpServlet {
    matriculaVo r = new matriculaVo();
    matriculaDao rd = new matriculaDao();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String accion=req.getParameter("accion");

        switch(accion){
            case "index":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            case "añadirMatricula":
                formulario(req,resp);
            break;
            case "consultarMatricula":
                listar(req,resp);
            break;
            case "consultarMatriculaEst":
                listarMatricula(req,resp);
            break;              
            case "editarMatricula":
                actualizar(req,resp);
            break;
            case "editarMatriculaEts":
                actualizarMatricula(req,resp);
            break;
            case "eliminarMatricula":
                eliminar(req,resp);
            break;
            // case "estado":
            //     estado(req,resp);
            // break;
            // case "estadoMatriculaEst":
            //     estadoMatricula(req,resp);
            // break;
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

            case "actualizarMatriculaEst":
            editMatricula(req, resp);
            break;
    }
}


       private void formulario(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("views/Matricula/addMatricula.jsp").forward(req, resp);
            System.out.println("Formulario abierto exitosamente");
        }catch(Exception e){
            System.out.println("El formulario no ha sido abierto con éxito"+e.getMessage().toString());
        }
    }

//AGREGAR MATRICULA VISTA ESTUDIANTE
    private void add(HttpServletRequest req, HttpServletResponse resp) {


        if(req.getParameter("nombreEstu")!=null){
            r.setNombreEstu(req.getParameter("nombreEstu"));
        }

        if(req.getParameter("apellidoEstu")!=null){
            r.setApellidoEstu(req.getParameter("apellidoEstu"));
        }

        if(req.getParameter("Archivo")!=null){
            r.setArchivo(req.getParameter("Archivo"));
        }

        if(req.getParameter("observacionEstudiante")!=null){
            r.setObservacionEstu(req.getParameter("observacionEstudiante"));
        }

        if(req.getParameter("observacionRectora")!=null){
            r.setObservacionRectora(req.getParameter("observacionRectora"));
        }
    
        if(req.getParameter("estadoMatricula")!=null){
             r.setEstadoMatricula(req.getParameter("estadoMatricula"));
         }

        if (req.getParameter("anolectivo")!=null) {
            r.setIdAnolectivo(Integer.parseInt(req.getParameter("anolectivo")));
        }

        if (req.getParameter("estu")!=null) {
            r.setIdEstudiante(Integer.parseInt(req.getParameter("estu")));
        }
        try {
            rd.add(r);
            System.out.println("El Registro fue insertado correctamente");
            listarMatricula(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error en la inserción del registro "+e.getMessage().toString());
        }
    }

//LISTAR MATRICULA VISTA ESTUDIANTE
        private void listarMatricula (HttpServletRequest req, HttpServletResponse resp) {
            try {
                 List matriculaList=rd.listar();
                req.setAttribute("listar", matriculaList);
                req.getRequestDispatcher("views/Matricula/listMatriculacopy.jsp").forward(req, resp);
                System.out.println("Datos listados para la edición");
            } catch (Exception e) {
                System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
            } 
        }  

//LISTAR MATRICULA VISTA RECTORA
private void listar (HttpServletRequest req, HttpServletResponse resp) {
    try {
        List matriculaList=rd.listar();
        req.setAttribute("listar", matriculaList);
        req.getRequestDispatcher("views/Matricula/listMatricula.jsp").forward(req, resp);
        System.out.println("Datos listados para la edición");
    } catch (Exception e) {
        System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
    } 
}  

//MODIFICAR MATRICULA VISTA RECTORA
    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idMatricula")!=null){
            r.setIdMatricula(Integer.parseInt(req.getParameter("idMatricula")));
        }
        try {
            List matriculaLists=rd.listarMatriculas(r.getIdMatricula());
            req.setAttribute("matriculaLists", matriculaLists);
            req.getRequestDispatcher("views/Matricula/editMatricula.jsp").forward(req, resp);
            System.out.println("Datos listados exitosamente en la edición");

        } catch (Exception e) {
            System.out.println("Ocurrió problemas al listar los datos "+e.getMessage().toString());
        }
    }

    private void edit(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idMatricula")!=null){
            r.setIdMatricula(Integer.parseInt(req.getParameter("idMatricula")));
        }
        
        if(req.getParameter("fechaMatricula")!=null){
            r.setFechaMatricula(req.getParameter("fechaMatricula"));
        }

        if(req.getParameter("nombreEstu")!=null){
            r.setNombreEstu(req.getParameter("nombreEstu"));
        }

        if(req.getParameter("apellidoEstu")!=null){
            r.setApellidoEstu(req.getParameter("apellidoEstu"));
        }

        if(req.getParameter("Archivo")!=null){
             r.setArchivo(req.getParameter("Archivo"));
         }

        if(req.getParameter("observacionEstudiante")!=null){
            r.setObservacionEstu(req.getParameter("observacionEstudiante"));
        }

        if(req.getParameter("observacionRectora")!=null){
            r.setObservacionRectora(req.getParameter("observacionRectora"));
        }
    
        if(req.getParameter("estadoMatricula")!=null){
            r.setEstadoMatricula(req.getParameter("estadoMatricula"));
        }

        if (req.getParameter("anolectivo")!=null) {
            r.setIdAnolectivo(Integer.parseInt(req.getParameter("anolectivo")));
        }

        if (req.getParameter("estu")!=null) {
            r.setIdEstudiante(Integer.parseInt(req.getParameter("estu")));
        }
        try {
            rd.actualizar(r);
            System.out.println("Editar el registro de la Matricula");
            listar(req, resp);

        } catch (Exception e) {
            System.out.println("Ocurrió un Error al editar "+e.getMessage().toString());
        }
    }

    //MODIFICAR MATRICULA VISTA ESTUDIANTE
    private void actualizarMatricula(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idMatricula")!=null){
            r.setIdMatricula(Integer.parseInt(req.getParameter("idMatricula")));
        }
        try {
            List matriculaLists=rd.listarMatricula(r.getIdMatricula());
            req.setAttribute("matriculaLists", matriculaLists);
            req.getRequestDispatcher("views/Matricula/editMatriculacopy.jsp").forward(req, resp);
            System.out.println("Datos listados exitosamente en la edición");

        } catch (Exception e) {
            System.out.println("Ocurrió problemas al listar los datos "+e.getMessage().toString());
        }
    }

    private void editMatricula(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idMatricula")!=null){
            r.setIdMatricula(Integer.parseInt(req.getParameter("idMatricula")));
        }
        
        if(req.getParameter("fechaMatricula")!=null){
            r.setFechaMatricula(req.getParameter("fechaMatricula"));
        }

        if(req.getParameter("nombreEstu")!=null){
            r.setNombreEstu(req.getParameter("nombreEstu"));
        }

        if(req.getParameter("apellidoEstu")!=null){
            r.setApellidoEstu(req.getParameter("apellidoEstu"));
        }

        if(req.getParameter("Archivo")!=null){
            r.setArchivo(req.getParameter("Archivo"));
        }

        if(req.getParameter("observacionEstudiante")!=null){
            r.setObservacionEstu(req.getParameter("observacionEstudiante"));
        }

        if(req.getParameter("observacionRectora")!=null){
            r.setObservacionRectora(req.getParameter("observacionRectora"));
        }
    
        if(req.getParameter("estadoMatricula")!=null){
            r.setEstadoMatricula(req.getParameter("estadoMatricula"));
        }

        if (req.getParameter("anolectivo")!=null) {
            r.setIdAnolectivo(Integer.parseInt(req.getParameter("anolectivo")));
        }

        if (req.getParameter("estu")!=null) {
            r.setIdEstudiante(Integer.parseInt(req.getParameter("estu")));
        }
        try {
            rd.actualizar(r);
            System.out.println("Editar el registro de la Matricula");
            listarMatricula(req, resp);

        } catch (Exception e) {
            System.out.println("Ocurrió un Error al editar "+e.getMessage().toString());
        }
    }


    //ELIMINAR MATRICULA
    private void eliminar(HttpServletRequest req, HttpServletResponse resp){
        if(req.getParameter("idMatricula")!=null){
            r.setIdMatricula(Integer.parseInt(req.getParameter("idMatricula")));//Cambiar de string a int
        }
        try {
            rd.eliminar(r.getIdMatricula());;
            System.out.println("Matricula eliminado exitosamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error al eliminar"+e.getMessage().toString());
        }
    }

    // //ESTADO MATRICULA VISTA RECTORA
    // private void estado(HttpServletRequest req, HttpServletResponse resp) {
    //     if(req.getParameter("idMatricula")!=null){
    //         r.setIdMatricula(Integer.parseInt(req.getParameter("idMatricula")));
    //     }
    //     if(req.getParameter("estadoMatricula")!=null){
    //         r.setEstadoMatricula(Boolean.parseBoolean(req.getParameter("estadoMatricula")));
    //     }
    //     try {
    //         rd.estado(r.getIdMatricula(), r.getEstadoMatricula());
    //         System.out.println("Estado cambiado exitosamente");
    //         listar(req, resp);
    //     } catch (Exception e) {
    //         System.out.println("Ocurrió un Error en el cambio de estado "+e.getMessage().toString());
    //     }
    // }

    // //ESTADO MATRICULA VISTA ESTUDIANTE
    // private void estadoMatricula(HttpServletRequest req, HttpServletResponse resp) {
    //     if(req.getParameter("idMatricula")!=null){
    //         r.setIdMatricula(Integer.parseInt(req.getParameter("idMatricula")));
    //     }
    //     if(req.getParameter("estadoMatricula")!=null){
    //         r.setEstadoMatricula(Boolean.parseBoolean(req.getParameter("estadoMatricula")));
    //     }
    //     try {
    //         rd.estado(r.getIdMatricula(), r.getEstadoMatricula());
    //         System.out.println("Estado cambiado exitosamente");
    //         listarMatricula(req, resp);
    //     } catch (Exception e) {
    //         System.out.println("Ocurrió un Error en el cambio de estado "+e.getMessage().toString());
    //     }
    // }

}


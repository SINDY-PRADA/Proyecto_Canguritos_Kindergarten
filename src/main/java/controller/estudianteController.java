package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.estudianteDao;
import model.estudianteVo;


    public class estudianteController extends HttpServlet {
    estudianteVo r = new estudianteVo();
    estudianteDao rd = new estudianteDao();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String accion=req.getParameter("accion");

        switch(accion){
            case "index":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            case "añadirEstudiante":
                formulario(req,resp);
            break;
            case "consultarEstudiante":
                listar(req,resp);
            break;  
            case "consultarEst":
                listarEstudiante(req,resp);
            break;       
            case "editarEstudiante":
                actualizar(req,resp);
            break;
            case "editarEst":
                actualizarEstudiante(req,resp);
            break;
            case "eliminarEstudiante":
                eliminar(req,resp);
            break;
            case "descargarConstancia":
                descargar(req,resp);
            break;
            case "estado":
                estado(req,resp);
            break;
            case "estadoEst":
                estadoEstudiante(req, resp);
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
            case "actualizarEst":
                editEst(req, resp);
            break;
    }
}

       private void formulario(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("views/Estudiante/addEstudiante.jsp").forward(req, resp);
            System.out.println("Formulario abierto exitosamente");
        }catch(Exception e){
            System.out.println("El formulario no ha sido abierto con éxito"+e.getMessage().toString());
        }
    }

//AGREGAR ESTUDIANTE
    private void add(HttpServletRequest req, HttpServletResponse resp) {

        if(req.getParameter("nombreEstudiante")!=null){
            r.setNombreEstudiante(req.getParameter("nombreEstudiante"));
        }

        if (req.getParameter("apellidoEstudiante")!=null) {
            r.setApellidoEstudiante(req.getParameter("apellidoEstudiante"));  
        } 
      
        if (req.getParameter("tipoDocumento")!=null) {
            r.setTipoDocumento(req.getParameter("tipoDocumento"));   
        }

        if (req.getParameter("documentoEstudiante")!=null) {
            r.setDocumentoEstudiante(req.getParameter("documentoEstudiante"));   
        }
        
        if (req.getParameter("fechaNacimiento")!=null) {
            r.setFechaNacimiento(req.getParameter("fechaNacimiento"));   
        }

        if (req.getParameter("rhEstudiante")!=null) {
            r.setRhEstudiante(req.getParameter("rhEstudiante"));   
        }

        if (req.getParameter("ciudadNacimiento")!=null) {
            r.setCiudadNacimiento(req.getParameter("ciudadNacimiento"));   
        }
        
        if (req.getParameter("direccionEstudiante")!=null) {
            r.setDireccionEstudiante(req.getParameter("direccionEstudiante"));   
        }
        
        if (req.getParameter("sexoEstudiante")!=null) {
            r.setSexoEstudiante(req.getParameter("sexoEstudiante"));
        }   

        if(req.getParameter("estadoEstudiante")!=null){
            r.setEstadoEstudiante(true);
        }

        if (req.getParameter("padre")!=null) {
            r.setIdAcudiente(Integer.parseInt(req.getParameter("padre")));
        }

        try {
            rd.add(r);
            System.out.println("El Registro fue insertado correctamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error en la inserción del registro "+e.getMessage().toString());
        }
    }

//LISTAR ESTUDIANTE
        private void listar (HttpServletRequest req, HttpServletResponse resp) {
            try {
                List estudianteList=rd.listar();
                req.setAttribute("listar", estudianteList);
                req.getRequestDispatcher("views/Estudiante/listEstudiante.jsp").forward(req, resp);
                System.out.println("Datos listados para la edición");
            } catch (Exception e) {
                System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
            } 
        }  

//LISTAR ESTUDIANTE
private void listarEstudiante (HttpServletRequest req, HttpServletResponse resp) {
    try {
        List estudianteList=rd.listarEst(r.getIdEstudiante());
        req.setAttribute("listar", estudianteList);
        req.getRequestDispatcher("views/Estudiante/listEstudiantecopy.jsp").forward(req, resp);
        System.out.println("Datos listados para la edición");
    } catch (Exception e) {
        System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
    } 
}          

// DESCARGAR CONSTANCIA
private void descargar(HttpServletRequest req, HttpServletResponse resp) {
    if(req.getParameter("idEstudiante")!=null){
        r.setIdEstudiante(Integer.parseInt(req.getParameter("idEstudiante")));
    }
    try {
        List estudianteList=rd.listarEstudiante(r.getIdEstudiante());
        req.setAttribute("estudianteList", estudianteList);
        req.getRequestDispatcher("views/Constancia/constancia.jsp").forward(req, resp);
        System.out.println("Datos listados exitosamente para la descarga");

    } catch (Exception e) {
        System.out.println("Ocurrió problemas al listar los datos para la descarga "+e.getMessage().toString());
    }
}

//MODIFICAR ESTUDIANTE
    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idEstudiante")!=null){
            r.setIdEstudiante(Integer.parseInt(req.getParameter("idEstudiante")));
        }
        try {
            List estudianteLists=rd.listarEstudiantes(r.getIdEstudiante());
            req.setAttribute("estudianteLists", estudianteLists);
            req.getRequestDispatcher("views/Estudiante/editEstudiante.jsp").forward(req, resp);
            System.out.println("Datos listados exitosamente en la edición");

        } catch (Exception e) {
            System.out.println("Ocurrió problemas al listar los datos "+e.getMessage().toString());
        }
    }        

    
    private void edit(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idEstudiante")!=null){
            r.setIdEstudiante(Integer.parseInt(req.getParameter("idEstudiante")));
        }
        if(req.getParameter("nombreEstudiante")!=null){
            r.setNombreEstudiante(req.getParameter("nombreEstudiante"));
        }
        if(req.getParameter("apellidoEstudiante")!=null){
            r.setApellidoEstudiante(req.getParameter("apellidoEstudiante"));
        }
        if(req.getParameter("tipoDocumento")!=null){
            r.setTipoDocumento(req.getParameter("tipoDocumento"));
        }
        if(req.getParameter("documentoEstudiante")!=null){
            r.setDocumentoEstudiante(req.getParameter("documentoEstudiante"));
        }
        if(req.getParameter("fechaNacimiento")!=null){
            r.setFechaNacimiento(req.getParameter("fechaNacimiento"));
        }
        if(req.getParameter("rhEstudiante")!=null){
            r.setRhEstudiante(req.getParameter("rhEstudiante"));
        }
        if(req.getParameter("ciudadNacimiento")!=null){
            r.setCiudadNacimiento(req.getParameter("ciudadNacimiento"));
        }
        if(req.getParameter("direccionEstudiante")!=null){
            r.setDireccionEstudiante(req.getParameter("direccionEstudiante"));
        }
        if(req.getParameter("sexoEstudiante")!=null){
            r.setSexoEstudiante(req.getParameter("sexoEstudiante"));
        }
        if(req.getParameter("estadoEstudiante")!=null){
            r.setEstadoEstudiante(Boolean.parseBoolean(req.getParameter("estadoEstudiante")));
        }
        if (req.getParameter("padre")!=null) {
            r.setIdAcudiente(Integer.parseInt(req.getParameter("padre")));
        }
        try {
            rd.actualizar(r);
            System.out.println("Editar el registro del estudiante");
            listar(req, resp);

        } catch (Exception e) {
            System.out.println("Ocurrió un Error al editar "+e.getMessage().toString());
        }
    }

//MODIFICAR ESTUDIANTE
private void actualizarEstudiante(HttpServletRequest req, HttpServletResponse resp) {
    if(req.getParameter("idEstudiante")!=null){
        r.setIdEstudiante(Integer.parseInt(req.getParameter("idEstudiante")));
    }
    try {
        List estudianteLists=rd.listarEstudiantes(r.getIdEstudiante());
        req.setAttribute("estudianteLists", estudianteLists);
        req.getRequestDispatcher("views/Estudiante/editEstudiantecopy.jsp").forward(req, resp);
        System.out.println("Datos listados exitosamente en la edición");

    } catch (Exception e) {
        System.out.println("Ocurrió problemas al listar los datos "+e.getMessage().toString());
    }
}

    private void editEst(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idEstudiante")!=null){
            r.setIdEstudiante(Integer.parseInt(req.getParameter("idEstudiante")));
        }
        if(req.getParameter("nombreEstudiante")!=null){
            r.setNombreEstudiante(req.getParameter("nombreEstudiante"));
        }
        if(req.getParameter("apellidoEstudiante")!=null){
            r.setApellidoEstudiante(req.getParameter("apellidoEstudiante"));
        }
        if(req.getParameter("tipoDocumento")!=null){
            r.setTipoDocumento(req.getParameter("tipoDocumento"));
        }
        if(req.getParameter("documentoEstudiante")!=null){
            r.setDocumentoEstudiante(req.getParameter("documentoEstudiante"));
        }
        if(req.getParameter("fechaNacimiento")!=null){
            r.setFechaNacimiento(req.getParameter("fechaNacimiento"));
        }
        if(req.getParameter("rhEstudiante")!=null){
            r.setRhEstudiante(req.getParameter("rhEstudiante"));
        }
        if(req.getParameter("ciudadNacimiento")!=null){
            r.setCiudadNacimiento(req.getParameter("ciudadNacimiento"));
        }
        if(req.getParameter("direccionEstudiante")!=null){
            r.setDireccionEstudiante(req.getParameter("direccionEstudiante"));
        }
        if(req.getParameter("sexoEstudiante")!=null){
            r.setSexoEstudiante(req.getParameter("sexoEstudiante"));
        }
        if(req.getParameter("estadoEstudiante")!=null){
            r.setEstadoEstudiante(Boolean.parseBoolean(req.getParameter("estadoEstudiante")));
        }
        if (req.getParameter("padre")!=null) {
            r.setIdAcudiente(Integer.parseInt(req.getParameter("padre")));
        }
        try {
            rd.actualizarEst(r);
            System.out.println("Editar el registro del estudiante");
            listarEstudiante(req, resp);

        } catch (Exception e) {
            System.out.println("Ocurrió un Error al editar "+e.getMessage().toString());
        }
    }


    //ELIMINAR ESTUDIANTE
    private void eliminar(HttpServletRequest req, HttpServletResponse resp){
        if(req.getParameter("idEstudiante")!=null){
            r.setIdEstudiante(Integer.parseInt(req.getParameter("idEstudiante")));//Cambiar de string a int
        }
        try {
            rd.eliminar(r.getIdEstudiante());;
            System.out.println("Estudiante eliminado exitosamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error al eliminar"+e.getMessage().toString());
        }
    }

    //ESTADO ESTUDIANTE
    private void estado(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idEstudiante")!=null){
            r.setIdEstudiante(Integer.parseInt(req.getParameter("idEstudiante")));
        }
        if(req.getParameter("estadoEstudiante")!=null){
            r.setEstadoEstudiante(Boolean.parseBoolean(req.getParameter("estadoEstudiante")));
        }
        try {
            rd.estado(r.getIdEstudiante(), r.getEstadoEstudiante());
            System.out.println("Estado cambiado exitosamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error en el cambio de estado "+e.getMessage().toString());
        }
    }

    //ESTADO ESTUDIANTE
    private void estadoEstudiante(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idEstudiante")!=null){
            r.setIdEstudiante(Integer.parseInt(req.getParameter("idEstudiante")));
        }
        if(req.getParameter("estadoEstudiante")!=null){
            r.setEstadoEstudiante(Boolean.parseBoolean(req.getParameter("estadoEstudiante")));
        }
        try {
            rd.estado(r.getIdEstudiante(), r.getEstadoEstudiante());
            System.out.println("Estado cambiado exitosamente");
            listarEstudiante(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error en el cambio de estado "+e.getMessage().toString());
        }
    }

}


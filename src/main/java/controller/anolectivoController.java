package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.anolectivoDao;
import model.anolectivoVo;


    public class anolectivoController extends HttpServlet {
    anolectivoVo r = new anolectivoVo();
    anolectivoDao rd = new anolectivoDao();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
        String accion=req.getParameter("accion");

        switch(accion){
            case "index":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            case "añadirAnolectivo":
                formulario(req,resp);
            break;
            case "consultarAnolectivo":
                listar(req,resp);
            break;       
            case "editarAnolectivo":
                actualizar(req,resp);
            break;
            case "eliminarAnolectivo":
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
            req.getRequestDispatcher("views/Anolectivo/addAnolectivo.jsp").forward(req, resp);
            System.out.println("Formulario abierto exitosamente");
        }catch(Exception e){
            System.out.println("El formulario no ha sido abierto con éxito"+e.getMessage().toString());
        }
    }

//AGREGAR AÑO LECTIVO
    private void add(HttpServletRequest req, HttpServletResponse resp) {

        if(req.getParameter("anoInicio")!=null){
            r.setAnoInicio(req.getParameter("anoInicio"));
        }

        if (req.getParameter("anoFin")!=null) {
            r.setAnoFin(req.getParameter("anoFin"));  
        } 
      
        if (req.getParameter("valorMatricula")!=null) {
            r.setValorMatricula(req.getParameter("valorMatricula"));   
        }

        if (req.getParameter("valorPension")!=null) {
            r.setValorPension(req.getParameter("valorPension"));   
        }

        if(req.getParameter("estadoAnolectivo")!=null){
            r.setEstadoAnolectivo(true);
        }
        try {
            rd.add(r);
            System.out.println("El Registro fue insertado correctamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error en la inserción del registro "+e.getMessage().toString());
        }
    }

//LISTAR AÑO LECTIVO
        private void listar (HttpServletRequest req, HttpServletResponse resp) {
            try {
                List anolectivoList=rd.listar();
                req.setAttribute("listar", anolectivoList);
                req.getRequestDispatcher("views/Anolectivo/listAnolectivo.jsp").forward(req, resp);
                System.out.println("Datos listados para la edición");
            } catch (Exception e) {
                System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
            } 
        }  

//MODIFICAR AÑO LECTIVO
    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idAnolectivo")!=null){
            r.setIdAnolectivo(Integer.parseInt(req.getParameter("idAnolectivo")));
        }
        try {
            List anolectivoLists=rd.listarAnolectivos(r.getIdAnolectivo());
            req.setAttribute("anolectivoLists", anolectivoLists);
            req.getRequestDispatcher("views/Anolectivo/editAnolectivo.jsp").forward(req, resp);
            System.out.println("Datos listados exitosamente en la edición");

        } catch (Exception e) {
            System.out.println("Ocurrió problemas al listar los datos "+e.getMessage().toString());
        }
    }

    private void edit(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idAnolectivo")!=null){
            r.setIdAnolectivo(Integer.parseInt(req.getParameter("idAnolectivo")));
        }
        if(req.getParameter("anoInicio")!=null){
            r.setAnoInicio(req.getParameter("anoInicio"));
        }
        if(req.getParameter("anoFin")!=null){
            r.setAnoFin(req.getParameter("anoFin"));
        }
        if(req.getParameter("valorMatricula")!=null){
            r.setValorMatricula(req.getParameter("valorMatricula"));
        }
        if(req.getParameter("valorPension")!=null){
            r.setValorPension(req.getParameter("valorPension"));
        }
        if(req.getParameter("estadoAnolectivo")!=null){
            r.setEstadoAnolectivo(Boolean.parseBoolean(req.getParameter("estadoAnolectivo")));
        }
        try {
            rd.actualizar(r);
            System.out.println("Editar el registro del Año lectivo");
            listar(req, resp);

        } catch (Exception e) {
            System.out.println("Ocurrió un Error al editar "+e.getMessage().toString());
        }
    }


    //ELIMINAR AÑO LECTIVO
    private void eliminar(HttpServletRequest req, HttpServletResponse resp){
        if(req.getParameter("idAnolectivo")!=null){
            r.setIdAnolectivo(Integer.parseInt(req.getParameter("idAnolectivo")));//Cambiar de string a int
        }
        try {
            rd.eliminar(r.getIdAnolectivo());;
            System.out.println("Año lectivo eliminado exitosamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error al eliminar"+e.getMessage().toString());
        }
    }

    //ESTADO AÑO LECTIVO
    private void estado(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("idAnolectivo")!=null){
            r.setIdAnolectivo(Integer.parseInt(req.getParameter("idAnolectivo")));
        }
        if(req.getParameter("estadoAnolectivo")!=null){
            r.setEstadoAnolectivo(Boolean.parseBoolean(req.getParameter("estadoAnolectivo")));
        }
        try {
            rd.estado(r.getIdAnolectivo(), r.getEstadoAnolectivo());
            System.out.println("Estado cambiado exitosamente");
            listar(req, resp);
        } catch (Exception e) {
            System.out.println("Ocurrió un Error en el cambio de estado "+e.getMessage().toString());
        }
    }

}


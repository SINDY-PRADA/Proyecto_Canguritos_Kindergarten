package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class matriculaDao {
    //Metodos
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    int filas;


//AGREGAR
    public int add(matriculaVo matricula) throws SQLException{
        sql="INSERT INTO matricula(Nombre_Estudiante, Apellido_Estudiante, Archivo_pdf, Observacion_Estudiante, Observacion_Rectora, estadoMatricula, idAnolectivo, idEstudiante  ) VALUES (?,?,?,?,?,?,?,?)";
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            ps.setString(1, matricula.getNombreEstu());
            ps.setString(2, matricula.getApellidoEstu());
            ps.setString(3, matricula.getArchivo());
            ps.setString(4, matricula.getObservacionEstu());
            ps.setString(5, matricula.getObservacionRectora());
            ps.setString(6, matricula.getEstadoMatricula());
            ps.setInt(7, matricula.getIdAnolectivo());
            ps.setInt(8, matricula.getIdEstudiante());
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se registró la matricula correctamente");
        }catch(Exception e){
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return filas;
    }


//LISTAR
    public List<matriculaVo> listar() throws SQLException{
        List<matriculaVo> matricula = new ArrayList<>();
        sql = "SELECT * FROM matricula";
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            System.out.println(ps);
            rs = ps.executeQuery(sql);
                
                while (rs.next()) {
                    matriculaVo filas = new matriculaVo();
                    filas.setIdMatricula(rs.getInt("idMatricula"));
                    filas.setFechaMatricula(rs.getString("fechaMatricula"));
                    filas.setNombreEstu(rs.getString("Nombre_Estudiante"));
                    filas.setApellidoEstu(rs.getString("Apellido_Estudiante"));
                    filas.setArchivo(rs.getString("Archivo_pdf"));
                    filas.setObservacionEstu(rs.getString("Observacion_Estudiante"));
                    filas.setObservacionRectora(rs.getString("Observacion_Rectora"));
                    filas.setEstadoMatricula(rs.getString("estadoMatricula"));
                    filas.setIdAnolectivo(rs.getInt("idAnolectivo"));
                    filas.setIdEstudiante(rs.getInt("idEstudiante"));
                    matricula.add(filas);
                }
                ps.close();
                System.out.println("consulta exitosa");
            } catch (Exception e) {
                System.out.println("La consulta no se pudo ejecutar "+e.getMessage().toString());
            }
            finally{
                con.close();
            }
    
            return matricula;
        }

//MODIFICAR

public List <matriculaVo> listarMatriculas(int idMatricula) throws SQLException{
    List<matriculaVo> matricula=new ArrayList<>();
    sql="SELECT * FROM matricula WHERE idMatricula = " + idMatricula;//variable para la BD
    try {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
        while(rs.next()){
            matriculaVo filas=new matriculaVo();
            //Escribir  en el setter cada valor encontrado
            filas.setIdMatricula(rs.getInt("idMatricula"));
            filas.setFechaMatricula(rs.getString("fechaMatricula"));
            filas.setNombreEstu(rs.getString("Nombre_Estudiante"));
            filas.setApellidoEstu(rs.getString("Apellido_Estudiante"));
            filas.setArchivo(rs.getString("Archivo_pdf"));
            filas.setObservacionEstu(rs.getString("Observacion_Estudiante"));
            filas.setObservacionRectora(rs.getString("Observacion_Rectora"));
            filas.setEstadoMatricula(rs.getString("estadoMatricula"));
            filas.setIdAnolectivo(rs.getInt("idAnolectivo"));
            filas.setIdEstudiante(rs.getInt("idEstudiante"));
            matricula.add(filas);
        }
        ps.close();
        System.out.println("consulta exitosa a matricula por id especificos SELECT * FROM matricula WHERE idMatricula=18");
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());//Error
    }
    finally{
        con.close();
    }

    return matricula;//retorna array con los datos de la tabla
}



//MODIFICAR

public List <matriculaVo> listarMatricula(int idMatricula) throws SQLException{
    List<matriculaVo> matricula=new ArrayList<>();
    sql="SELECT * FROM matricula WHERE idMatricula = 21";//variable para la BD
    try {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
        while(rs.next()){
            matriculaVo filas=new matriculaVo();
            //Escribir  en el setter cada valor encontrado
            filas.setIdMatricula(rs.getInt("idMatricula"));
            filas.setFechaMatricula(rs.getString("fechaMatricula"));
            filas.setNombreEstu(rs.getString("Nombre_Estudiante"));
            filas.setApellidoEstu(rs.getString("Apellido_Estudiante"));
            filas.setArchivo(rs.getString("Archivo_pdf"));
            filas.setObservacionEstu(rs.getString("Observacion_Estudiante"));
            filas.setObservacionRectora(rs.getString("Observacion_Rectora"));
            filas.setEstadoMatricula(rs.getString("estadoMatricula"));
            filas.setIdAnolectivo(rs.getInt("idAnolectivo"));
            filas.setIdEstudiante(rs.getInt("idEstudiante"));
            matricula.add(filas);
        }
        ps.close();
        System.out.println("consulta exitosa a matricula por id especificos SELECT * FROM matricula WHERE idMatricula=21");
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());//Error
    }
    finally{
        con.close();
    }

    return matricula;//retorna array con los datos de la tabla
}
public int actualizar(matriculaVo matricula) throws SQLException{
    sql="UPDATE matricula SET Nombre_Estudiante=?, Apellido_Estudiante=?, Archivo_pdf=?, Observacion_Estudiante=? ,Observacion_Rectora=?, estadoMatricula=?, idAnolectivo=?, idEstudiante=? WHERE idMatricula=?";

    try{
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        System.out.println(ps);
            ps.setString(1, matricula.getNombreEstu());
            ps.setString(2, matricula.getApellidoEstu());
            ps.setString(3, matricula.getArchivo());
            ps.setString(4, matricula.getObservacionEstu());
            ps.setString(5, matricula.getObservacionRectora());
            ps.setString(6, matricula.getEstadoMatricula());
            ps.setInt(7, matricula.getIdAnolectivo());
            ps.setInt(8, matricula.getIdEstudiante());
            ps.setInt(9, matricula.getIdMatricula());

        System.out.println(ps);
        ps.executeUpdate();
        ps.close();
        System.out.println("Se edito la matricula lectivo correctamente");

        
    }catch(Exception e){
        System.out.println("Error al editar "+e.getMessage().toString());
    }

    finally{
        con.close();
    }
    return filas;
    }


    //ELIMINAR
    public void eliminar(int idMatricula) throws SQLException{
        sql="DELETE FROM matricula WHERE idMatricula="+idMatricula;//variable para el sql
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se elimino correctamente");
            
        }catch(Exception e){
            System.out.println("Error en la eliminación "+e.getMessage().toString());
        }

        finally{
            con.close();//cerrando conexión
        }
    }

    //ESTADO
    public void estado(int idMatricula, Boolean estadoMatricula) throws SQLException{
        sql="UPDATE Matricula SET estadoMatricula="+estadoMatricula+" WHERE idMatricula="+idMatricula;//variable para el sql
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se cambio el estado a "+estadoMatricula+" correctamente");
            
        }catch(Exception e){
            System.out.println("Error en el cambio de estado "+e.getMessage().toString());
        }

        finally{
            con.close();//cerrando conexión
        }
    }
}

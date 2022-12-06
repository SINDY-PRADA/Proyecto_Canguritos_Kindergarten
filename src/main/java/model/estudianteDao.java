package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class estudianteDao {
    //Metodos
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    int filas;


//AGREGAR
    public int add(estudianteVo estudiante) throws SQLException{
        sql="INSERT INTO estudiante(nombreEstudiante, apellidoEstudiante, tipoDocumento, documentoEstudiante, fechaNacimiento, rhEstudiante, ciudadNacimiento, direccionEstudiante, sexoEstudiante, estadoEstudiante, idAcudiente) values(?,?,?,?,?,?,?,?,?,?,?)";
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            ps.setString(1, estudiante.getNombreEstudiante());
            ps.setString(2, estudiante.getApellidoEstudiante());
            ps.setString(3, estudiante.getTipoDocumento());
            ps.setString(4, estudiante.getDocumentoEstudiante());
            ps.setString(5, estudiante.getFechaNacimiento());
            ps.setString(6, estudiante.getRhEstudiante());
            ps.setString(7, estudiante.getCiudadNacimiento());
            ps.setString(8, estudiante.getDireccionEstudiante());
            ps.setString(9, estudiante.getSexoEstudiante());
            ps.setBoolean(10, estudiante.getEstadoEstudiante());
            ps.setInt(11, estudiante.getIdAcudiente());
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se registró el estudiante correctamente");
        }catch(Exception e){
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return filas;
    }


//LISTAR
    public List<estudianteVo> listar() throws SQLException{
        List<estudianteVo> estudiante = new ArrayList<>();
        sql = "SELECT * FROM estudiante";
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            System.out.println(ps);
            rs = ps.executeQuery(sql);
                
                while (rs.next()) {
                    estudianteVo filas = new estudianteVo();
                    filas.setIdEstudiante(rs.getInt("idEstudiante"));
                    filas.setNombreEstudiante(rs.getString("nombreEstudiante"));
                    filas.setApellidoEstudiante(rs.getString("apellidoEstudiante"));
                    filas.setTipoDocumento(rs.getString("tipoDocumento"));
                    filas.setDocumentoEstudiante(rs.getString("documentoEstudiante"));
                    filas.setFechaNacimiento(rs.getString("fechaNacimiento"));
                    filas.setRhEstudiante(rs.getString("rhEstudiante"));
                    filas.setCiudadNacimiento(rs.getString("ciudadNacimiento"));
                    filas.setDireccionEstudiante(rs.getString("direccionEstudiante"));
                    filas.setSexoEstudiante(rs.getString("sexoEstudiante"));
                    filas.setEstadoEstudiante(rs.getBoolean("estadoEstudiante"));
                    filas.setIdAcudiente(rs.getInt("idAcudiente"));
                    estudiante.add(filas);
                }
                ps.close();
                System.out.println("consulta exitosa");
            } catch (Exception e) {
                System.out.println("La consulta no se pudo ejecutar "+e.getMessage().toString());
            }
            finally{
                con.close();
            }
    
            return estudiante;
        }

public List <estudianteVo> listarEstudiante(int idEstudiante) throws SQLException{
        List<estudianteVo> estudiante=new ArrayList<>();
            sql="SELECT idEstudiante, nombreEstudiante, apellidoEstudiante, documentoEstudiante FROM estudiante WHERE idEstudiante="+idEstudiante;//variable para la BD
            try {
                con=Conexion.conectar();
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery(sql);
                while(rs.next()){
                    estudianteVo filas=new estudianteVo();
                    //Escribir  en el setter cada valor encontrado
                    filas.setIdEstudiante(rs.getInt("idEstudiante"));//peticion de id
                    filas.setNombreEstudiante(rs.getString("nombreEstudiante"));//peticion de nombre
                    filas.setApellidoEstudiante(rs.getString("apellidoEstudiante"));//peticion de apellido
                    filas.setDocumentoEstudiante(rs.getString("documentoEstudiante"));//peticion de documento
                    filas.setIdEstudiante(rs.getInt("idEstudiante"));//peticion de id
                    estudiante.add(filas);
                    System.out.println(filas.getNombreEstudiante());
                }
                ps.close();
                System.out.println("consulta exitosa a estudiante por id especifico "+idEstudiante);
            } catch (Exception e) {
                System.out.println("La consulta no pudo ser ejecutada "+e.getMessage().toString());//Error
            }
            finally{
                con.close();
            }
            return estudiante;//retorna array con los datos de la tabla
}

//LISTAR ESTUDIANTE
public List<estudianteVo> listarEst(int idEstudiante) throws SQLException{
    List<estudianteVo> estudiante = new ArrayList<>();
    sql = "SELECT * FROM estudiante WHERE idEstudiante = 28";//variable para la BD
    try {
        con = Conexion.conectar();
        ps = con.prepareStatement(sql);
        System.out.println(ps);
        rs = ps.executeQuery(sql);
            
            while (rs.next()) {
                estudianteVo filas = new estudianteVo();
                filas.setIdEstudiante(rs.getInt("idEstudiante"));
                filas.setNombreEstudiante(rs.getString("nombreEstudiante"));
                filas.setApellidoEstudiante(rs.getString("apellidoEstudiante"));
                filas.setTipoDocumento(rs.getString("tipoDocumento"));
                filas.setDocumentoEstudiante(rs.getString("documentoEstudiante"));
                filas.setFechaNacimiento(rs.getString("fechaNacimiento"));
                filas.setRhEstudiante(rs.getString("rhEstudiante"));
                filas.setCiudadNacimiento(rs.getString("ciudadNacimiento"));
                filas.setDireccionEstudiante(rs.getString("direccionEstudiante"));
                filas.setSexoEstudiante(rs.getString("sexoEstudiante"));
                filas.setEstadoEstudiante(rs.getBoolean("estadoEstudiante"));
                filas.setIdAcudiente(rs.getInt("idAcudiente"));
                estudiante.add(filas);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no se pudo ejecutar "+e.getMessage().toString());
        }
        finally{
            con.close();
        }

        return estudiante;
    }

//MODIFICAR

public List <estudianteVo> listarEstudiantes(int idEstudiante) throws SQLException{
    List<estudianteVo> estudiante=new ArrayList<>();
    sql="SELECT * FROM estudiante WHERE idEstudiante="+idEstudiante;//variable para la BD
    try {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
        while(rs.next()){
            estudianteVo filas=new estudianteVo();
            //Escribir  en el setter cada valor encontrado
            filas.setIdEstudiante(rs.getInt("idEstudiante"));//peticion de id
            filas.setNombreEstudiante(rs.getString("nombreEstudiante"));//peticion de nombre
            filas.setApellidoEstudiante(rs.getString("apellidoEstudiante"));//peticion de apellido
            filas.setTipoDocumento(rs.getString("tipoDocumento"));//peticion de tipo Documento
            filas.setDocumentoEstudiante(rs.getString("documentoEstudiante"));//peticion de documento
            filas.setFechaNacimiento(rs.getString("fechaNacimiento"));//peticion de la fecha Nacimiento
            filas.setRhEstudiante(rs.getString("rhEstudiante"));//peticion de Rh 
            filas.setCiudadNacimiento(rs.getString("ciudadNacimiento"));//peticion de ciudad Nacimiento
            filas.setDireccionEstudiante(rs.getString("direccionEstudiante"));//peticion de direccion
            filas.setSexoEstudiante(rs.getString("sexoEstudiante"));//peticion de sexo
            filas.setEstadoEstudiante(rs.getBoolean("estadoEstudiante"));//peticion de estado
            filas.setIdAcudiente(rs.getInt("idAcudiente"));//peticion de la llave foranea
            estudiante.add(filas);
        }
        ps.close();
        System.out.println("consulta exitosa a estudiante por id especificos SELECT * FROM estudiante WHERE idEstudiante="+idEstudiante);
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());//Error
    }
    finally{
        con.close();
    }

    return estudiante;//retorna array con los datos de la tabla
}


public int actualizar(estudianteVo estudiante) throws SQLException{
    sql="UPDATE estudiante SET nombreEstudiante=?,apellidoEstudiante=?, tipoDocumento=?,documentoEstudiante=?,fechaNacimiento=?,rhEstudiante=?,ciudadNacimiento=?,direccionEstudiante=?,sexoEstudiante=?,estadoEstudiante=?, idAcudiente=? WHERE idEstudiante=?";

    try{
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        System.out.println(ps);
        ps.setString(1, estudiante.getNombreEstudiante());
        ps.setString(2, estudiante.getApellidoEstudiante());
        ps.setString(3, estudiante.getTipoDocumento());
        ps.setString(4, estudiante.getDocumentoEstudiante());
        ps.setString(5, estudiante.getFechaNacimiento());
        ps.setString(6, estudiante.getRhEstudiante());
        ps.setString(7, estudiante.getCiudadNacimiento());
        ps.setString(8, estudiante.getDireccionEstudiante());
        ps.setString(9, estudiante.getSexoEstudiante());
        ps.setBoolean(10, estudiante.getEstadoEstudiante());
        ps.setInt(11, estudiante.getIdAcudiente());
        ps.setInt(12, estudiante.getIdEstudiante());

        System.out.println(ps);
        ps.executeUpdate();
        ps.close();
        System.out.println("Se edito el estudiante correctamente");

        
    }catch(Exception e){
        System.out.println("Error al editar "+e.getMessage().toString());
    }

    finally{
        con.close();
    }
    return filas;
    }




    public int actualizarEst(estudianteVo estudiante) throws SQLException{
        sql="UPDATE estudiante SET nombreEstudiante=?,apellidoEstudiante=?, tipoDocumento=?,documentoEstudiante=?,fechaNacimiento=?,rhEstudiante=?,ciudadNacimiento=?,direccionEstudiante=?,sexoEstudiante=?,estadoEstudiante=?, idAcudiente=? WHERE idEstudiante=28";
    
        try{
            con=Conexion.conectar();
            ps=con.prepareStatement(sql);
            System.out.println(ps);
            ps.setString(1, estudiante.getNombreEstudiante());
            ps.setString(2, estudiante.getApellidoEstudiante());
            ps.setString(3, estudiante.getTipoDocumento());
            ps.setString(4, estudiante.getDocumentoEstudiante());
            ps.setString(5, estudiante.getFechaNacimiento());
            ps.setString(6, estudiante.getRhEstudiante());
            ps.setString(7, estudiante.getCiudadNacimiento());
            ps.setString(8, estudiante.getDireccionEstudiante());
            ps.setString(9, estudiante.getSexoEstudiante());
            ps.setBoolean(10, estudiante.getEstadoEstudiante());
            ps.setInt(11, estudiante.getIdAcudiente());
    
            System.out.println(ps);
            ps.executeUpdate();
            ps.close();
            System.out.println("Se edito el estudiante correctamente");
    
            
        }catch(Exception e){
            System.out.println("Error al editar "+e.getMessage().toString());
        }
    
        finally{
            con.close();
        }
        return filas;
        }
    

    //ELIMINAR
    public void eliminar(int idEstudiante) throws SQLException{
        sql="DELETE FROM estudiante WHERE idEstudiante="+idEstudiante;//variable para el sql
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
    public void estado(int idEstudiante, Boolean estadoEstudiante) throws SQLException{
        sql="UPDATE estudiante SET estadoEstudiante="+estadoEstudiante+" WHERE idEstudiante="+idEstudiante;//variable para el sql
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se cambio el estado a "+estadoEstudiante+" correctamente");
            
        }catch(Exception e){
            System.out.println("Error en el cambio de estado "+e.getMessage().toString());
        }

        finally{
            con.close();//cerrando conexión
        }
    }
}

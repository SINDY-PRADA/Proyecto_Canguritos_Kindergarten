package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class acudienteDao {
    //Metodos
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    int filas;


//AGREGAR
    public int add(acudienteVo acudiente) throws SQLException{
        sql="INSERT INTO acudiente(parentescoAcudiente, nombreAcudiente, apellidoAcudiente, tipoDocumento, documentoAcudiente, profesionAcudiente, telefonoAcudiente, direccionAcudiente, correoAcudiente, estadoAcudiente) values(?,?,?,?,?,?,?,?,?,?)";
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            ps.setString(1, acudiente.getParentescoAcudiente());
            ps.setString(2, acudiente.getNombreAcudiente());
            ps.setString(3, acudiente.getApellidoAcudiente());
            ps.setString(4, acudiente.getTipoDocumento());
            ps.setString(5, acudiente.getDocumentoAcudiente());
            ps.setString(6, acudiente.getProfesionAcudiente());
            ps.setString(7, acudiente.getTelefonoAcudiente());
            ps.setString(8, acudiente.getDireccionAcudiente());
            ps.setString(9, acudiente.getCorreoAcudiente());
            ps.setBoolean(10, acudiente.getEstadoAcudiente());
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se registró el acudiente correctamente");
        }catch(Exception e){
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return filas;
    }


//LISTAR
    public List<acudienteVo> listar() throws SQLException{
        List<acudienteVo> acudiente = new ArrayList<>();
        sql = "SELECT * FROM acudiente";
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            System.out.println(ps);
            rs = ps.executeQuery(sql);
                
                while (rs.next()) {
                    acudienteVo filas = new acudienteVo();
                    filas.setIdAcudiente(rs.getInt("idAcudiente"));
                    filas.setParentescoAcudiente(rs.getString("parentescoAcudiente"));
                    filas.setNombreAcudiente(rs.getString("nombreAcudiente"));
                    filas.setApellidoAcudiente(rs.getString("apellidoAcudiente"));
                    filas.setTipoDocumento(rs.getString("tipoDocumento"));
                    filas.setDocumentoAcudiente(rs.getString("documentoAcudiente"));
                    filas.setProfesionAcudiente(rs.getString("profesionAcudiente"));
                    filas.setTelefonoAcudiente(rs.getString("telefonoAcudiente"));
                    filas.setDireccionAcudiente(rs.getString("direccionAcudiente"));
                    filas.setCorreoAcudiente(rs.getString("correoAcudiente"));

                    filas.setEstadoAcudiente(rs.getBoolean("estadoAcudiente"));
                    acudiente.add(filas);
                }
                ps.close();
                System.out.println("consulta exitosa");
            } catch (Exception e) {
                System.out.println("La consulta no se pudo ejecutar "+e.getMessage().toString());
            }
            finally{
                con.close();
            }
    
            return acudiente;
        }

//MODIFICAR

public List <acudienteVo> listarAcudientes(int idAcudiente) throws SQLException{
    List<acudienteVo> acudiente=new ArrayList<>();
    sql="SELECT * FROM acudiente WHERE idAcudiente="+idAcudiente;//variable para la BD
    try {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
        while(rs.next()){
            acudienteVo filas=new acudienteVo();
            //Escribir  en el setter cada valor encontrado
            filas.setIdAcudiente(rs.getInt("idAcudiente"));//peticion de id
            filas.setParentescoAcudiente(rs.getString("parentescoAcudiente"));//peticion de parentesco
            filas.setNombreAcudiente(rs.getString("nombreAcudiente"));//peticion de nombre
            filas.setApellidoAcudiente(rs.getString("apellidoAcudiente"));//peticion de apellido
            filas.setTipoDocumento(rs.getString("tipoDocumento"));//peticion de tipo documento
            filas.setDocumentoAcudiente(rs.getString("documentoAcudiente"));//peticion de documento
            filas.setProfesionAcudiente(rs.getString("profesionAcudiente"));//peticion de profesion
            filas.setTelefonoAcudiente(rs.getString("telefonoAcudiente"));//peticion de telefono
            filas.setDireccionAcudiente(rs.getString("direccionAcudiente"));//peticion de direccion
            filas.setCorreoAcudiente(rs.getString("correoAcudiente"));//peticion de correo
            filas.setEstadoAcudiente(rs.getBoolean("estadoAcudiente"));//peticion de estado
            acudiente.add(filas);
        }
        ps.close();
        System.out.println("consulta exitosa a acudiente por id especificos SELECT * FROM acudiente WHERE idAcudiente="+idAcudiente);
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());//Error
    }
    finally{
        con.close();
    }

    return acudiente;//retorna array con los datos de la tabla
}


public int actualizar(acudienteVo acudiente) throws SQLException{
    sql="UPDATE acudiente SET parentescoAcudiente=?,nombreAcudiente=?, apellidoAcudiente=?,tipoDocumento=?,documentoAcudiente=?,profesionAcudiente=?,telefonoAcudiente=?,direccionAcudiente=?,correoAcudiente=?,estadoAcudiente=? WHERE idAcudiente=?";

    try{
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        System.out.println(ps);
        ps.setString(1, acudiente.getParentescoAcudiente());
        ps.setString(2, acudiente.getNombreAcudiente());
        ps.setString(3, acudiente.getApellidoAcudiente());
        ps.setString(4, acudiente.getTipoDocumento());
        ps.setString(5, acudiente.getDocumentoAcudiente());
        ps.setString(6, acudiente.getProfesionAcudiente());
        ps.setString(7, acudiente.getTelefonoAcudiente());
        ps.setString(8, acudiente.getDireccionAcudiente());
        ps.setString(9, acudiente.getCorreoAcudiente());
        ps.setBoolean(10, acudiente.getEstadoAcudiente());
        ps.setInt(11, acudiente.getIdAcudiente());

        System.out.println(ps);
        ps.executeUpdate();
        ps.close();
        System.out.println("Se edito el acudiente correctamente");

        
    }catch(Exception e){
        System.out.println("Error al editar "+e.getMessage().toString());
    }

    finally{
        con.close();
    }
    return filas;
    }


    //ELIMINAR
    public void eliminar(int idAcudiente) throws SQLException{
        sql="DELETE FROM acudiente WHERE idAcudiente="+idAcudiente;//variable para el sql
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
    public void estado(int idAcudiente, Boolean estadoAcudiente) throws SQLException{
        sql="UPDATE acudiente SET estadoAcudiente="+estadoAcudiente+" WHERE idAcudiente="+idAcudiente;//variable para el sql
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se cambio el estado a "+estadoAcudiente+" correctamente");
            
        }catch(Exception e){
            System.out.println("Error en el cambio de estado "+e.getMessage().toString());
        }

        finally{
            con.close();//cerrando conexión
        }
    }
}

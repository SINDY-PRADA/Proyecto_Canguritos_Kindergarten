package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class usuarioDao {
    //Metodos
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    int filas;


//AGREGAR
    public int add(usuarioVo usuario) throws SQLException{
        sql="INSERT INTO users(username, pass, estadoUsuario, nivel) values(?,?,?,?)";
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            ps.setString(1, usuario.getUsername());
            ps.setString(2, usuario.getPass());
            ps.setBoolean(3, usuario.getEstadoUsuario());
            ps.setString(4, usuario.getNivel());
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se registró el usuario correctamente");
        }catch(Exception e){
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return filas;
    }


//LISTAR
    public List<usuarioVo> listar() throws SQLException{
        List<usuarioVo> usuario = new ArrayList<>();
        sql = "SELECT * FROM users";
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            System.out.println(ps);
            rs = ps.executeQuery(sql);
                
                while (rs.next()) {
                    usuarioVo filas = new usuarioVo();
                    filas.setIdUsuario(rs.getInt("idUsuario"));
                    filas.setUsername(rs.getString("username"));
                    filas.setPass(rs.getString("pass"));
                    filas.setEstadoUsuario(rs.getBoolean("estadoUsuario"));
                    filas.setNivel(rs.getString("nivel"));
                    usuario.add(filas);
                }
                ps.close();
                System.out.println("consulta exitosa");
            } catch (Exception e) {
                System.out.println("La consulta no se pudo ejecutar "+e.getMessage().toString());
            }
            finally{
                con.close();
            }
    
            return usuario;
        }

//MODIFICAR

public List <usuarioVo> listarUsuarios(int idUsuario) throws SQLException{
    List<usuarioVo> usuario=new ArrayList<>();
    sql="SELECT * FROM users WHERE idUsuario="+idUsuario;//variable para la BD
    try {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
        while(rs.next()){
            usuarioVo filas=new usuarioVo();
            //Escribir  en el setter cada valor encontrado
            filas.setIdUsuario(rs.getInt("idUsuario"));//peticion de id
            filas.setUsername(rs.getString("username"));//peticion de nombre
            filas.setPass(rs.getString("pass"));//peticion de contraseña
            filas.setEstadoUsuario(rs.getBoolean("estadoUsuario"));//peticion de estado
            filas.setNivel(rs.getString("nivel"));//Peticion de Rol
            usuario.add(filas);
        }
        ps.close();
        System.out.println("consulta exitosa a usuario por id especificos SELECT * FROM users WHERE idUsuario="+idUsuario);
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());//Error
    }
    finally{
        con.close();
    }

    return usuario;//retorna array con los datos de la tabla
}


public int actualizar(usuarioVo usuario) throws SQLException{
    sql="UPDATE users SET username=?,pass=?,estadoUsuario=?,nivel=? WHERE idUsuario=?";

    try{
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        System.out.println(ps);
        ps.setString(1, usuario.getUsername());
        ps.setString(2, usuario.getPass());
        ps.setBoolean(3, usuario.getEstadoUsuario());
        ps.setString(4, usuario.getNivel());
        ps.setInt(5, usuario.getIdUsuario());

        System.out.println(ps);
        ps.executeUpdate();
        ps.close();
        System.out.println("Se edito usuario lectivo correctamente");

        
    }catch(Exception e){
        System.out.println("Error al editar "+e.getMessage().toString());
    }

    finally{
        con.close();
    }
    return filas;
    }


    //ELIMINAR
    public void eliminar(int idUsuario) throws SQLException{
        sql="DELETE FROM users WHERE idUsuario="+idUsuario;//variable para el sql
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
    public void estado(int idUsuario, Boolean estadoUsuario) throws SQLException{
        sql="UPDATE users SET estadoUsuario="+estadoUsuario+" WHERE idUsuario="+idUsuario;//variable para el sql
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se cambio el estado a "+estadoUsuario+" correctamente");
            
        }catch(Exception e){
            System.out.println("Error en el cambio de estado "+e.getMessage().toString());
        }

        finally{
            con.close();//cerrando conexión
        }
    }
}

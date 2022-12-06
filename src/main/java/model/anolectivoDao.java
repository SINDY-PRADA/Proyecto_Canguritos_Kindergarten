package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class anolectivoDao {
    //Metodos
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    int filas;


//AGREGAR
    public int add(anolectivoVo anolectivo) throws SQLException{
        sql="INSERT INTO anolectivo(anoInicio, anoFin, valorMatricula, valorPension, estadoAnolectivo) values(?,?,?,?,?)";
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            ps.setString(1, anolectivo.getAnoInicio());
            ps.setString(2, anolectivo.getAnoFin());
            ps.setString(3, anolectivo.getValorMatricula());
            ps.setString(4, anolectivo.getValorPension());
            ps.setBoolean(5, anolectivo.getEstadoAnolectivo());
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se registró el año lectivo correctamente");
        }catch(Exception e){
            System.out.println("Error en el regisro "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexión
        }
        return filas;
    }


//LISTAR
    public List<anolectivoVo> listar() throws SQLException{
        List<anolectivoVo> anolectivo = new ArrayList<>();
        sql = "SELECT * FROM anolectivo";
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            System.out.println(ps);
            rs = ps.executeQuery(sql);
                
                while (rs.next()) {
                    anolectivoVo filas = new anolectivoVo();
                    filas.setIdAnolectivo(rs.getInt("idAnolectivo"));
                    filas.setAnoInicio(rs.getString("anoInicio"));
                    filas.setAnoFin(rs.getString("anoFin"));
                    filas.setValorMatricula(rs.getString("valorMatricula"));
                    filas.setValorPension(rs.getString("valorPension"));

                    filas.setEstadoAnolectivo(rs.getBoolean("estadoAnolectivo"));
                    anolectivo.add(filas);
                }
                ps.close();
                System.out.println("consulta exitosa");
            } catch (Exception e) {
                System.out.println("La consulta no se pudo ejecutar "+e.getMessage().toString());
            }
            finally{
                con.close();
            }
    
            return anolectivo;
        }

//MODIFICAR

public List <anolectivoVo> listarAnolectivos(int idAnolectivo) throws SQLException{
    List<anolectivoVo> anolectivo=new ArrayList<>();
    sql="SELECT * FROM anolectivo WHERE idAnolectivo="+idAnolectivo;//variable para la BD
    try {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
        while(rs.next()){
            anolectivoVo filas=new anolectivoVo();
            //Escribir  en el setter cada valor encontrado
            filas.setIdAnolectivo(rs.getInt("idAnolectivo"));//peticion de id
            filas.setAnoInicio(rs.getString("anoInicio"));//peticion de año inicio
            filas.setAnoFin(rs.getString("anoFin"));//peticion de año fin 
            filas.setValorMatricula(rs.getString("valorMatricula"));//peticion de valor matricula
            filas.setValorPension(rs.getString("valorPension"));//peticion de valor pension
           
            filas.setEstadoAnolectivo(rs.getBoolean("estadoAnolectivo"));//peticion de estado
            anolectivo.add(filas);
        }
        ps.close();
        System.out.println("consulta exitosa a año lectivo por id especificos SELECT * FROM anolectivo WHERE idAnolectivo="+idAnolectivo);
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());//Error
    }
    finally{
        con.close();
    }

    return anolectivo;//retorna array con los datos de la tabla
}


public int actualizar(anolectivoVo anolectivo) throws SQLException{
    sql="UPDATE anolectivo SET anoInicio=?,anoFin=?, valorMatricula=?,valorPension=?,estadoAnolectivo=? WHERE idAnolectivo=?";

    try{
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        System.out.println(ps);
        ps.setString(1, anolectivo.getAnoInicio());
        ps.setString(2, anolectivo.getAnoFin());
        ps.setString(3, anolectivo.getValorMatricula());
        ps.setString(4, anolectivo.getValorPension());
        ps.setBoolean(5, anolectivo.getEstadoAnolectivo());
        ps.setInt(6, anolectivo.getIdAnolectivo());

        System.out.println(ps);
        ps.executeUpdate();
        ps.close();
        System.out.println("Se edito el año lectivo correctamente");

        
    }catch(Exception e){
        System.out.println("Error al editar "+e.getMessage().toString());
    }

    finally{
        con.close();
    }
    return filas;
    }


    //ELIMINAR
    public void eliminar(int idAnolectivo) throws SQLException{
        sql="DELETE FROM anolectivo WHERE idAnolectivo="+idAnolectivo;//variable para el sql
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
    public void estado(int idAnolectivo, Boolean estadoAnolectivo) throws SQLException{
        sql="UPDATE anolectivo SET estadoAnolectivo="+estadoAnolectivo+" WHERE idAnolectivo="+idAnolectivo;//variable para el sql
        try{
            con=Conexion.conectar(); //abrir conexión
            ps=con.prepareStatement(sql); //preparar sentencia
            System.out.println(ps);
            ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se cambio el estado a "+estadoAnolectivo+" correctamente");
            
        }catch(Exception e){
            System.out.println("Error en el cambio de estado "+e.getMessage().toString());
        }

        finally{
            con.close();//cerrando conexión
        }
    }
}

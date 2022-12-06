package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Operaciones {
     String driver;
     String url;
     String uss;
     String contra;

     public Operaciones(){
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/bdcanguritoskindergarten";
        uss = "root";
        contra = "";
     }

     public int loguear(String us, String pass){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        int nivel = 0; 
        String sql= "select nivel from users where username='"+us+"' and pass='"+pass+"'";
        try{
            Class.forName(this.driver);
            conn = DriverManager.getConnection(
                this.url, 
                this.uss, 
                this.contra
                );
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                nivel = rs.getInt(1);
            }
            conn.close();
        }catch(ClassNotFoundException | SQLException e){

        }
        return nivel;
     }
    
}

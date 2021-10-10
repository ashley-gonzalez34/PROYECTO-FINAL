/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ashli
 */
public class ConexionRegistroLogin {
    private final String base = "Usuarios";//nombre de la base de datos 
    private final String user = "root";//usuario de la base datos
    private final String password = "123456";//contraseña
    private final String url = "jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC"+base ;
    private Connection con = null;//url para poder conctar a mysql
    
    
public Connection getConexion() throws SQLException{//metodo para la conexion a mysql
        try {
            Class.forName("com.mysql.jdbc.Driver");//aca se debe de colocar el drive conector
            con= DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionRegistroLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;//se retorna 
        
}




        
    
}

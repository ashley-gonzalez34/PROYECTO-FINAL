/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ashli
 */
public class MysqlUsuarios extends ConexionRegistroLogin {//
    
    
    public boolean registrar(usuarios usr)//metodo que recibe los usuarios 
    { 
        PreparedStatement ps = null;
        Connection con = getConexion();//esto viene de la clase de conexion
        
        
        //consulta del insert en la base de datos  junto con su conexion
        String sql = "INSERT INTO  usuarios ( usuario, password, nombre ,correo, id_tipo)VALUES(?,?,?,?,?)";
      //los signos de interrogacion son para los datos
        try{//aca se esta haciendo una conexion del modelo a la base de datos
                ps = con.prepareStatement(sql);
                ps.setString(1,usr.getUsuario());
                ps.setString(2,usr.getpassword());
                ps.setString(3,usr.getNombre());  
                ps.setString(4,usr.getCorreo());
                ps.setInt(5,usr.getId_tipo());
                ps.execute();//aca se ejecuta la insercion
                return true;
                //se retorna que se hizo correctamente 
        }catch (SQLException ex ){
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE,null,ex);
            return false;
            
        }        
                
        
    }
    
    public int existeUsuario(String usuario){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT count(id) FROM usuarios WHERE usuario = ?";
        
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1,usuario);
            
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1);
            }
            
            return 1;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return 1;
        } finally {
            try {
                //Cerramos la conexión!
                con.close();
            } catch (SQLException e){
                e.printStackTrace(System.out);
            }
        }
        
    }
    
    
    public boolean esMailValido(String mail){
        //Regex validar mail
        String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(mail);
        
        
        return matcher.find();
    }
    
    
    public boolean login(usuarios usr){//
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        //consulta de select 
        String sql = "SELECT id,usuario, password, nombre, id_tipo FROM usuarios WHERE usuario = ?";
        
        try {//ya que el usuario exita se compara las contraseñas 
            ps = con.prepareStatement(sql);//se prepara la conslta
            
            ps.setString(1,usr.getUsuario());//se enviael dato
            
            rs = ps.executeQuery();
            
            if (rs.next()) {//conparacion de que la contraseña sa la misma de la base de datps
                if (usr.getPassword().equals(rs.getString(3))) {
                    //la siguiente consulta de actualizar los datos 
                    String sqlUpdateDate = "UPDATE usuarios SET last_session = ? WHERE id =?";
                    
                    ps = con.prepareStatement(sqlUpdateDate);
                    ps.setString(1, usr.getlast_session());
                    ps.setInt(2, rs.getInt(1));
                    
                    ps.execute();
                    
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setId_tipo(5);
                    return true;//seretorna 
                } else {
                    return false;
                }
            }
            return false;
            
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            return false;
        } finally {
            try {
                //Cerramos la conexión!
                con.close();
            } catch (SQLException e){
                e.printStackTrace(System.out);
            }
        }
    }
    
}



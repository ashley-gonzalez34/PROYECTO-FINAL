/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ashli
 */
public class usuarios {
    private int id ;//aca estan las propiedades 
    private String usuario;
    private String password;
    private String nombre;
    private String correo;
    private String last_session;
    private int id_tipo;

    public void setId(int id) {//se iserto los metodos de get y set para poder interactuar a la base de datos
        this.id = id;
    }

    public void setUsuario(String usurio) {
        this.usuario = usurio;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setLast_session(String last_session) {
        this.last_session = last_session;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }
    
    
    
    
}

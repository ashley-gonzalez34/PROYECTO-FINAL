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
public class Favoritos {
    private int id_favoritos;
    private String usuario;
    private String pokemon_id;

    /**
     * @return the id_favoritos
     */
    public int getId_favoritos() {
        return id_favoritos;
    }

    /**
     * @param id_favoritos the id_favoritos to set
     */
    public void setId_favoritos(Integer id_favoritos) {
        this.id_favoritos = id_favoritos;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the pokemon_id
     */
    public String getPokemon_id() {
        return pokemon_id;
    }

    /**
     * @param pokemon_id the pokemon_id to set
     */
    public void setPokemon_id(String pokemon_id) {
        this.pokemon_id = pokemon_id;
    }
}

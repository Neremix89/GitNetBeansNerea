/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Votacion;

/**
 *
 * @author Nerea Garcia Fraile
 */
public class Votacion {
    
    private String nombre;
    private Integer votos;

    public Votacion() {
    }

    public Votacion(String nombre, Integer votos) {
        super();
        this.nombre = nombre;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Votacion{" + "nombre=" + nombre + ", votos=" + votos + '}';
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasgit;

/**
 *
 * @author garfrane
 */
public class Alumno {
    
    private int numMtr;
    private String nombre;
    private String apellidos;

    public Alumno(int numMtr, String nombre, String apellidos) {
        this.numMtr = numMtr;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getNumMtr() {
        return numMtr;
    }

    public void setNumMtr(int numMtr) {
        this.numMtr = numMtr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    
}

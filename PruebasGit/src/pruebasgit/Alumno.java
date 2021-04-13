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
    private String ciclo;
    private String curso;

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


    @Override
    public String toString() {
        return "Alumno{" + "numMtr=" + numMtr + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
}

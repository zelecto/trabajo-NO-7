/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author <zelecto>
 */
public class Empleado {
    private String nomre;

    public Empleado() {
    }

    public Empleado(String nomre) {
        this.nomre = nomre;
    }

    public String getNomre() {
        return nomre;
    }

    public void setNomre(String nomre) {
        this.nomre = nomre;
    }

    @Override
    public String toString() {
        return "Empleado " + " nomre= " + nomre ;
    }
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author <zelecto>
 */
public class Operario extends Empleado{

    public Operario(String nomre) {
        super(nomre);
    }
    
    @Override
    public String toString() {
        return super.toString()+ " -> Operario"; 
        
    }
    
    
    
    
}

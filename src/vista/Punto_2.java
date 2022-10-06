/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.*;

/**
 *
 * @author <zelecto>
 */
public class Punto_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado E1= new Empleado("Rafa");
        Directivo D1= new Directivo("Mario");
        Operario op1= new Operario("Alfonso");
        oficial OF1=new oficial("Luis ");
        Tecnico T1= new Tecnico("Pablo");
        
        
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(op1);
        System.out.println(OF1);
        System.out.println(T1);
        
    }
    
}

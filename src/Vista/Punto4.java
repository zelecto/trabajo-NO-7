/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Modelo.*;

/**
 *
 * @author USUARIO
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado C = new Cuadrado(4);
        Rectangulo R = new Rectangulo(5, 9);
        Trapecio T = new Trapecio(10, 4, 6);
        C.Carea();
        R.Carea();
        T.Carea();
        
        
        System.out.println(C.toString());
        System.out.println(R.toString());
        System.out.println(T.toString());
        
    }
    
}

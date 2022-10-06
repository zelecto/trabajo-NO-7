/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Trapecio extends Cuadrilatero{

    public Trapecio() {
    }

    public Trapecio(double x, double x1, double y) {
        super(x, x1, y);
    }
    
    public void Carea(){
        super.setResultado(((getX()+getX1())/2)*getY());
    }
    
    
    @Override
    public String toString() {
        return "EL AREA DEL TRAPECIO ES = " + super.toString()+" M^2"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
}

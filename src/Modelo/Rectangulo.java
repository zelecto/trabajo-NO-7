/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Rectangulo extends Cuadrilatero{

    public Rectangulo() {
    }

    public Rectangulo(double x, double y) {
        super(x, y);
    }
    
    public void Carea(){
        super.setResultado(getX()*getY());
    }
    
    
    
    @Override
    public String toString() {
        return "EL AREA DEL RECTANGULO ES = "+super.getResultado()+" M^2";
    }
    
    
}

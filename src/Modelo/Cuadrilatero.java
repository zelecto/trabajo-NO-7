/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Cuadrilatero {
    private double x;
    private double x1;
    private double y;
    private double resultado;

    public Cuadrilatero() {
    }
    
    
    public Cuadrilatero(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Cuadrilatero(double x, double x1, double y) {
        this.x = x;
        this.x1 = x1;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return  " "+resultado ;
    }
    
    
    
    
}

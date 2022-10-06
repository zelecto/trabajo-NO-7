
package Modelo;


public class Cuadrado extends Cuadrilatero{

    public Cuadrado() {
    }

    public Cuadrado(double x) {
        super(x, x);
    }
    
    public void Carea(){
        super.setResultado(getX()*getX());
        
    }

    @Override
    public String toString() {
        return "EL AREA DEL CUADRADO ES = "+super.toString()+" M^2"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}

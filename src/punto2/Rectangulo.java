/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

/**
 *
 * @author FrancoMaximiliano
 */
public class Rectangulo {
    private int x;
    private int y;
    
    public Rectangulo(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Rectangulo(){
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calcularPerimetro(double b, double h){
        double resultado;
        resultado = 2*b+2*h;
    return resultado; 
    }
    
    public double calcularSuperficie(double b, double h){
        double resultado = b * h;
    return resultado;
    }

    public void calcularSegundoPunto(double b, double h, Rectangulo puntos){
        System.out.println("Segundo punto: P2(" + (puntos.getX()+b) + " , " + h + ")" );
    }

    public void calcularTercerPunto(double b, double h, Rectangulo puntos){
        System.out.println("Tercer punto: P2(" + b + " , " + (h+puntos.getY()) + ")" );
    }

    public void calcularCuartoPunto(double b, double h, Rectangulo puntos){
        System.out.println("Cuarto punto: P2(" + (b+puntos.getX()) + " , " + (h+puntos.getY()) + ")" );
    }
}


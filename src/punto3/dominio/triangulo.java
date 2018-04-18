/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.dominio;

/**
 *
 * @author FrancoMaximiliano
 */
public class triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public triangulo(){
        
    }

    public triangulo (int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public void verificarTriangulo(triangulo a){
        int p;
        if (a.getLado1() <= 0 || a.getLado2() <= 0 || a.getLado3() <= 0)
            System.out.println("No se puede formar el triangulo.");
        else{
            p = a.getLado1() + a.getLado2() + a.getLado3();
            System.out.println("El perimetro del triangulo es: " +p);
            }
    }
}

package punto2.dominio;

/**/

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

    //Metodo para calcular el perimetro de un rectangulo
    public double calcularPerimetro(double b, double h){
        double resultado;
        resultado = 2*b+2*h;
    return resultado; 
    }
    
    //Metodo para calcular la superficie de un triangulo
    public double calcularSuperficie(double b, double h){
        double resultado = b * h;
    return resultado;
    }
    
    //Metodo para calcular el segundo punto de un triangulo
    public void calcularSegundoPunto(double b, double h, Rectangulo puntos){
        System.out.println("Segundo punto: P2(" + (puntos.getX()+b) + " , " + h + ")" );
    }
    
    //Metodo para calcular el tercer punto de un triangulo
    public void calcularTercerPunto(double b, double h, Rectangulo puntos){
        System.out.println("Tercer punto: P2(" + b + " , " + (h+puntos.getY()) + ")" );
    }
    
    //Metodo para calcular el cuarto punto de un triangulo
    public void calcularCuartoPunto(double b, double h, Rectangulo puntos){
        System.out.println("Cuarto punto: P2(" + (b+puntos.getX()) + " , " + (h+puntos.getY()) + ")" );
    }
}


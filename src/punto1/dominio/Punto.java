package punto1.dominio;

/**/

public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
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
    
    //Metodo para caluclar la distancia entre dos puntos
    public double calcularDistanciaEntrePuntos(Punto otroPunto){
    
     return Math.sqrt(Math.pow(otroPunto.getX()-x, 2) + Math.pow(otroPunto.getY()-y, 2));
    }
}

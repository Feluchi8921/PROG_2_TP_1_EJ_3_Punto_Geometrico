package PuntoGeometrico;

public class PuntoGeometrico {
    //Atributos
    Coordenada x = new Coordenada();
    Coordenada y = new Coordenada();

    //Constantes
    public static final int DESPLAZAMIENTO=5;

    //Contructor
    public PuntoGeometrico(){
        this.x=x;
        this.y=y;
    }

    //Metodos
    public void getPunto(){
        System.out.println("El punto geometrico es: ("+x.getCoordenada()+"; "+y.getCoordenada()+")");
    }
    public void DesplazarPunto(){
        System.out.println("El punto desplazado es: ("+x.getCoordenada()+DESPLAZAMIENTO+"; "+y.getCoordenada()+DESPLAZAMIENTO+")");
    }
}

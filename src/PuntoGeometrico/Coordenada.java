package PuntoGeometrico;

public class Coordenada {
    //Atributo
    private int coordenada;
    public static final int INICIALIZACION=0;

    //Constructor
    public Coordenada(){
        this.coordenada=INICIALIZACION;
    }
    
    public int getCoordenada(){
        return this.coordenada;
    }
    //Si lo pasan con valor
    public int getCoordenada(int INICIALIZACION){
        return this.coordenada=INICIALIZACION;
    }
}

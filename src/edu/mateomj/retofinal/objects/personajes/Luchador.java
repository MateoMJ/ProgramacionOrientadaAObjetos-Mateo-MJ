package edu.mateomj.retofinal.objects.personajes;

/**
 * Clase que es la heredacion de las cosas de objeto clases para mago, heroe y luchador
 */
public abstract class Luchador implements Comparable<Luchador>{

    public static int vidaMaxima;
    public static int vidaActual;
    public static int defensaMaxima;
    public static int defensaActual;

    /**
     * El tostring hace cosas de tostring
     * @return
     */
    @Override
    public String toString() {
        return "Luchador{" +
                "vidaMaxima=" + vidaMaxima +
                ", vidaActual=" + vidaActual +
                ", defensaMaxima=" + defensaMaxima +
                ", defensaActual=" + defensaActual +
                '}';
    }

    /**
     * constructor default de luchador
     */
    public Luchador(){

    }
    /**
     * todas los metodos estos de ataque se encargan de los ataques del luchador que no ataca porque hereda
     * @return
     */
    public abstract int ataque1A();
    public abstract int ataque1B();
    public abstract int ataque2A();
    public abstract int ataque2B();
    public abstract int ataque3A();
    public abstract int ataque3B();
    public abstract int ataque4A();
    public abstract int ataque4B();

    @Override
    public int compareTo(Luchador o) {
        return 0;
    }
}

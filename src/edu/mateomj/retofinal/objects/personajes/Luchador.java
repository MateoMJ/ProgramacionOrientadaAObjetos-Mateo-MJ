package edu.mateomj.retofinal.objects.personajes;

public abstract class Luchador implements Comparable<Luchador>{

    public static int vidaMaxima;
    public static int vidaActual;
    public static int defensaMaxima;
    public static int defensaActual;

    @Override
    public String toString() {
        return "Luchador{" +
                "vidaMaxima=" + vidaMaxima +
                ", vidaActual=" + vidaActual +
                ", defensaMaxima=" + defensaMaxima +
                ", defensaActual=" + defensaActual +
                '}';
    }

    public Luchador(){

    }
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

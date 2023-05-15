package edu.mateomj.retofinal.objects.personajes;
import java.util.Random;

/**
 * la clase que se encarga de la logica de pelea del jugador y otras cosas
 */

public class Heroe extends Luchador{
    Random randomSelect = new Random();
    public static int potion;

    /**
     * constructor default de heore objeto
     */

    public Heroe() {
        super();
    }
    /**
     * todas los metodos estos de ataque se encargan de los ataques del mago
     * @return
     */
    @Override
    public int ataque1A(){
        int A1D1 = randomSelect.nextInt(1-4);
        return A1D1;
    }
    public int ataque1B(){
        int A1D2 = randomSelect.nextInt(2-3);
        return A1D2;
    }
    @Override
    public int ataque2A(){
        int A2D1 = randomSelect.nextInt(2-3);
        return A2D1;
    }
    @Override
    public int ataque2B(){
        int A2D2 = randomSelect.nextInt(1-4);
        return A2D2;
    }
    @Override
    public int ataque3A(){
        int A3D1 = randomSelect.nextInt(6);
        return A3D1;
    }
    @Override
    public int ataque3B(){
        int A3D2 = randomSelect.nextInt(6);
        return A3D2;
    }
    @Override
    public int ataque4A(){
        int A4D1 = randomSelect.nextInt(4-8);
        return A4D1;
    }
    @Override
    public int ataque4B(){
        int A4D2 = randomSelect.nextInt(1-2);
        return A4D2;
    }
}

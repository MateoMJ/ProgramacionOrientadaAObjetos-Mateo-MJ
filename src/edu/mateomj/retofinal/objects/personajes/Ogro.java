package edu.mateomj.retofinal.objects.personajes;
import java.util.Random;

public class Ogro extends Luchador {
    Random randomSelect = new Random();

    public Ogro() {
        super();
    }
    @Override
    public int ataque1A(){
        int A1D1 = randomSelect.nextInt(1-3);
        return A1D1;
    }
    @Override
    public int ataque1B(){
        int A1D2 = randomSelect.nextInt(1-3);
        return A1D2;
    }
    @Override
    public int ataque2A(){
        int A2D1 = randomSelect.nextInt(2-3);
        return A2D1;
    }
    @Override
    public int ataque2B(){
        int A2D2 = randomSelect.nextInt(2-3);
        return A2D2;
    }
    @Override
    public int ataque3A(){
        int A3D1 = randomSelect.nextInt(1-4);
        return A3D1;
    }
    @Override
    public int ataque3B(){
        int A4D2 = randomSelect.nextInt(1-4);
        return A4D2;
    }
    @Override
    public int ataque4A(){
        int A4D1 = randomSelect.nextInt(3-7);
        return A4D1;
    }
    @Override
    public int ataque4B(){
        int A4D2 = randomSelect.nextInt(1);
        return A4D2;
    }

}

package edu.mateomj.reto9.process;
import java.util.Random;
import java.util.List;

/**
 * Esta clase crea el objeto tipo ayudante para el reto
 */
public class Ayudante {
    Random randomSelect = new Random();
    int randomizerIndex = randomSelect.nextInt(2);
    int ojos;
    String piel;
    String altura;
    int nivelCreacion;
    int nivelDestructivo;
    public static String[] pielRandom = {"Morado", "Amarillo"};
    public static String[] altiuraRandom = {"Mediano", "Alto"};


    /**
     * Constructor de ayudantes
     * @param ojos puede tener de uno a dos
     * @param piel el color de piel del ayudante
     * @param altura que tan alto es
     * @param nivelCreacion que tan bueno para crear cosas es del 1 al 5
     * @param nivelDestructivo que tan bueno es destruyendo cosas del 1 al 5
     */
    public Ayudante(int ojos, String piel, String altura, int nivelCreacion, int nivelDestructivo){
        Random randomSelect = new Random();
        this.randomizerIndex = randomizerIndex;
        this.ojos = ojos;
        this.piel = piel;
        this.altura = altura;
        this.nivelCreacion = nivelCreacion;
        this.nivelDestructivo = nivelDestructivo;
    }

    /**
     * Genera un valor de ojos al azar
     * @return
     */
    public int getojos(){
        Random randomSelect = new Random();
        return ojos = randomSelect.nextInt(2)+1;
    }

    /**
     * Genera un color de piel para el ayudante al azar
     * @return
     */
    public String getpiel(){
        return piel = (pielRandom[randomizerIndex]);
    }

    /**
     * genera una altura al azar para el ayudante
     * @return
     */
    public String getaltura(){
        return altura = (altiuraRandom[randomizerIndex]);
    }

    /**
     * Genera que tan bueno construyendo cosas es del 1 al 5
     * @return
     */
    public int getnivelCreacion(){
        Random randomSelect = new Random();
        return randomSelect.nextInt(5)+1;
    }
    /**
     * genera un nivel del 1 al 5 de destruccion para el ayudante
     * @return
     */
    public int getnivelDestructivo(){
        Random randomSelect = new Random();
        return nivelDestructivo = randomSelect.nextInt(5)+1;
    }

    /**
     * Constructor default del ayudante
     */
    public Ayudante(){

    }

}

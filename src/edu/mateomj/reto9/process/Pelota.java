package edu.mateomj.reto9.process;

/**
 * La clase pelota se encarga de contener los datos de la pelota y crear el obejto pelota
 */
public class Pelota {

    String colorPelota ="Amarillo";
    int rapidez =8;
    int poder = 5;

    /**
     * Constructor de objeto Pelota
     * @param colorPelota el color de la pelota
     * @param rapidez que tan rapido va
     * @param poder el poder explosivo de la pelota
     */
    public Pelota(String colorPelota, int rapidez, int poder){
        this.colorPelota = colorPelota;
        this.rapidez = rapidez;
        this.poder = poder;

    }

    /**
     * El metodo brinda el color actual de la pelota
     * @return regresa el dato
     */
    public String getcolorPelota(){
        return colorPelota;
    }

    /**
     *  el metodo brinda la rapidez actual de la pelota
     * @return regresa el dato
     */
    public int getrapidez(){
        return rapidez;
    }

    /**
     * brinda el poder de la pelota
     * @return regresa el dato
     */
    public int getpoder(){
        return poder;
    }

    /**
     * Aumenta el poder de la pelota por uno como pide el reto
     */
    public void aumentarpoder(){
        int suma = 1;
        this.poder = poder+suma;
    }

    /**
     * Este metodo disminuye la velocidad de la pelota por uno como pide el reto
     */
    public void disminuirrapidez(){
        int disminucion = 1;
        this.rapidez = rapidez-disminucion;
    }

    /**
     * Constructor Default de la pelota
     */
    public Pelota(){

    }
}

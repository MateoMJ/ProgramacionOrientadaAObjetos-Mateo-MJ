package edu.mateomj.reto5.ui;
import edu.mateomj.reto5.process.JuegoLetra;
import java.util.Random;
import java.util.Scanner;

public class CLI {

    /**
     * Los siguientes strings contienen las palabras que utilizara el programa que se tienen que adivinar
     * (modofacil,modomedio,mododificil)
     */
    public static String[] modofacil = {"hola", "palo", "tela", "mono","pelo", "lago", "como", "seis"};

    public static String[] modomedio = {"telefono", "estuchera", "ballesta", "auricular","cilantro", "pantalon", "sacapuntas", "almoahada"};

    public static String[] mododificil= {"aflojamiento", "capitalistas", "astrofisicos", "dodecasilaba","combatientes", "calculatorio", "circulatorio", "checoslovaco"};

    /**
     * MenuDificultad:Se encarga de manejar el menu que le permite al usuario seleccionar la dificultad del juego
     * palabraindex: esta variable trabaja commo un index y se encarga de seleccionar y guardar un numero alazar que permite la seleccion de la palabra
     * para que el usuario juege de los strings estaticos
     * palabraselect: esta variable almacena la palabra que adivinara el usuario
     */
    public static void MenuDificultad()
    {
        //String selectdificultad = " ";
        int palabraindex = 99;
        String palabraselect = " ";

        System.out.println("Bienvendio a adivina palabras! Presione la tecla 0 si desea salir");
        System.out.println("Favor de seleccionar la dificulatad");
        System.out.println("a. Facil (4 letras)");
        System.out.println("b. Medio (8 letras)");
        System.out.println("c. Dificil (12 letras)");

        Scanner leerdificultad = new Scanner(System.in);
        String selectdificultad = leerdificultad.nextLine();

        Random letrarandom = new Random();
        switch (selectdificultad) {
            case "a": //facil
                palabraindex= letrarandom.nextInt(modofacil.length);
                palabraselect =(modofacil[palabraindex]);
                JuegoLetra.AdivinaLetra(palabraselect );
                break;
            case "b": //medio
                palabraindex= letrarandom.nextInt(modomedio.length);
                palabraselect =(modomedio[palabraindex]);
                JuegoLetra.AdivinaLetra(palabraselect );
                break;
            case "c": //dificil
                palabraindex= letrarandom.nextInt(mododificil.length);
                palabraselect =(mododificil[palabraindex]);
                JuegoLetra.AdivinaLetra(palabraselect );
                break;
            case "0":
                System.exit(0);
                break;
            default:
                System.out.println("Favor de introducir una opcion valida");
                edu.mateomj.reto5.ui.CLI.MenuDificultad();
        }

    }

}

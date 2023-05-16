package edu.mateomj.retoExtra.ui;
import java.util.*;

/**
 * Esta clase se encarga de lo que es el input del usuario, tiene un metodo scanner y uno de input invalido
 * por si eligen una opcion inexistente y el menu para seleccionar de donde tomas el archivo
 */
public class CLI {
    /**
     * Este metodo toma el input de lo que escribe en consola el usuario
     * @param inputPrograma Es el string donde se guarda lo que escriba el usuario para que lo utilice el programa
     * @return regresa lo que escribio el usuario
     */
    public static String getuserinput(String inputPrograma) {
        String inputParaReturn;
        Scanner leerinput = new Scanner(System.in);
        inputParaReturn = leerinput.nextLine();
        return inputParaReturn;
    }

    /**
     * Siu el usuario escribe una opcion que no existe entonces se manda a esta funcion y se le hace saber al usuario
     */
    public static void inputInvalido(){
        System.out.println("Favor de introducir una opcion valida");
        return;

    }

    /**
     * Este metodo se llama al iniciar el programa y le pide al usuario que escoga de donde quuiere obtener el archivo que va a correr
     */

    public static void menuPrograma(){

        System.out.println("Escoge el destino de su archivo a correr");
        System.out.println("a: Default");
        System.out.println("b: Personalizado");

    }
}

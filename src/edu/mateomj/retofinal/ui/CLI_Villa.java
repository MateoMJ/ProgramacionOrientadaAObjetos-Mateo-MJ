package edu.mateomj.retofinal.ui;
import edu.mateomj.retofinal.objects.Villa;
import edu.mateomj.retofinal.process.GameProcess;

/**
 * Clase CLI_Villa se encarga de los print line de texto que tienen que ver con la villa en la que te quedas
 */
public class CLI_Villa {

    /**
     * printDecidirAccion se encraga de los print referentes a decidir que va a hacer el jugador
     */
    public static void printDecidirAccion(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Te encuentras en la villa otra vez y quedan "+Villa.tiempoRestante+" dias...");
        System.out.println("¿Que deseas hacer?");
        System.out.println("a: Pelear con un súbdito del mago");
        System.out.println("b: Explorar la Mazmorra");
        System.out.println("c: Descansar y recuperar fuerzas");
        System.out.println("d: Pelear contra el Mago");
        return;
    }

    /**
     * printDescansos se encarga de los pirnt line de texto referentes a la accion de descansar
     */
    public static void printDescanso(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Te vas a tu casa y descansas por el resto del dia");
        System.out.println("Tu defensa y tu vida se recuperan al Maximo!");
        return;

    }
}

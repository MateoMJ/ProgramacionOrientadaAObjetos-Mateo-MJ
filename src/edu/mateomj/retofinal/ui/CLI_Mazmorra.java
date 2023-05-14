package edu.mateomj.retofinal.ui;
import java.util.concurrent.TimeUnit;

/**
 * Esta clase imprime texto referente a la accion de explorar la mazmorra
 */

public class CLI_Mazmorra {
    /**
     * metodo que imprime texto de cuando sales de la mazmorra
     */
    public static void printSalirMazmorra(){
        System.out.println("Sales de la mazmorra del mago y regresas a la villa");
        return;
    }

    /**
     * metodo que imprime el texto de cuando entras a la mazmorra
     */
    public static void printEntrarMazmorra(){
        System.out.println("Entras a la mazmorra del mago con la cabeza alta listo para enfrentar lo que venga");
        System.out.println("Te pones a explorar los corredores oscuros");
        for(int i=0; i<=3; i++){
            System.out.print(". ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------------------------");
        return;
    }

    /**
     * Metodo de texto que sale cuando rescatas 10 hadas en una jaula
     */
    public static void printRescatarHadas(){
        System.out.println("Encuentras una jaula llena de hadas");
        System.out.println("parece que los Ogros no las han transportado con el mago aun...");
        System.out.println("Liveras las hadas y estas regresan a la villa, las 10 hadas como agradecimiento incrementan tu poder");
        System.out.println("-------------------------------------------------------------------------------------------");
        return;
    }

    /**
     * metodo que imprime texto de cuando encuentras una pocion con la cual te puedes curar
     */
    public static void printEncontrarPocion(){
        System.out.println("Buscando entre los almacenes encuentras una caja sin candado");
        System.out.println("Esta tiene una pocion de curacion que cura 10 puntos de vida");
        System.out.println("La guardas en tu mochila");
        System.out.println("-------------------------------------------------------------------------------------------");
        return;
    }

    /**
     * metodo que imprime texto cuando te pierdes en la mazmorra y sales despues de un dia
     */
    public static void printperderUnDia(){
        System.out.println("Te pierdes dentro de la mazmorra del mago....");
        System.out.println("Despues de un buen rato logras escapar y regresar a la villa pero te tardaste un dia en hacerlo...");
        System.out.println("-------------------------------------------------------------------------------------------");
        return;
    }

    /**
     * metodo que imprimir el texto de cuando dse resta vida a lazar porque te encuentras una trampa o algo
     */
    public static void printPerderVida(){

    }

    /**
     * metodo que imprime texto cuando te encuentras un ogro en la mazmorra
     */
    public static void encontrarOgro(){
        System.out.println("Te pierdes dentro de la mazmorra del mago y buscando como salir te encuentras con un ogro");
        System.out.println("-El ogro lleva una jaula de hadas con el, se la esta llevando al mago");
        System.out.println("Antes de que puedas decidir que hacer el ogro te ve y se dispone a lidiar con los intrusos");
        System.out.println("El ogro se prepara para la pelea!");
        System.out.println("-------------------------------------------------------------------------------------------");
    }


}

package edu.mateomj.retofinal.ui;
import java.util.concurrent.TimeUnit;

public class CLI_Mazmorra {
    public static void printSalirMazmorra(){
        System.out.println("Sales de la mazmorra del mago y regresas a la villa");
        return;
    }

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
    public static void printRescatarHadas(){
        System.out.println("Encuentras una jaula llena de hadas");
        System.out.println("parece que los Ogros no las han transportado con el mago aun...");
        System.out.println("Liveras las hadas y estas regresan a la villa, las 10 hadas como agradecimiento incrementan tu poder");
        System.out.println("-------------------------------------------------------------------------------------------");
        return;
    }
    public static void printEncontrarPocion(){
        System.out.println("Buscando entre los almacenes encuentras una caja sin candado");
        System.out.println("Esta tiene una pocion de curacion que cura 10 puntos de vida");
        System.out.println("La guardas en tu mochila");
        System.out.println("-------------------------------------------------------------------------------------------");
        return;
    }
    public static void printperderUnDia(){
        System.out.println("Te pierdes dentro de la mazmorra del mago....");
        System.out.println("Despues de un buen rato logras escapar y regresar a la villa pero te tardaste un dia en hacerlo...");
        System.out.println("-------------------------------------------------------------------------------------------");
        return;
    }
    public static void printPerderVida(){

    }
    public static void encontrarOgro(){
        System.out.println("Te pierdes dentro de la mazmorra del mago y buscando como salir te encuentras con un ogro");
        System.out.println("-El ogro lleva una jaula de hadas con el, se la esta llevando al mago");
        System.out.println("Antes de que puedas decidir que hacer el ogro te ve y se dispone a lidiar con los intrusos");
        System.out.println("El ogro se prepara para la pelea!");
        System.out.println("-------------------------------------------------------------------------------------------");
    }


}

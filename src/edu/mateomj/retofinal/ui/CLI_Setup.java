package edu.mateomj.retofinal.ui;
import java.util.*;

public class CLI_Setup {

    public static void menuInicio(){

        System.out.println("Bienvenido a La Aventura del Heroe");
        System.out.println("Por favor escoge lo que quieres hacer");
        System.out.println("a: Iniciar Juego");
        System.out.println("b: Leer Tutorial");
        System.out.println("c: Cerrar Juego");

        Scanner leeropcion = new Scanner(System.in);
        String seleccionmenu = leeropcion.nextLine();

        switch (seleccionmenu) {
            case "a":
                historiaInicial();
                break;
            case "b":
                CLI_Tutorial.tutorial();
                break;
            case "c":
                System.exit(0);
                break;
            default:
                System.out.println("Favor de introducir una opcion valida");
                menuInicio();
        }
    }

    public static void historiaInicial(){
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Una villa cercana ha sido maldecida por un mago malvado que secuestro y robo el poder de muchas hadas");
        System.out.println("En 30 dias todos los habitantes se convertiran en piedra y no hay cura...");
        System.out.println("Como gran heroe que eres decides embarcar en una mision para rescatar las hadas y matar al mago");
        System.out.println("Matar al mago es la unica solucion para detener el embrujo");
        System.out.println("¿Podras salvar a la villa antes de que se agote el tiempo?");
        System.out.println("Tocara averiguarlo");

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Llegas a la aldea y todos se ven miserables, consigues lugar donde hospedarte y te preparas");
        System.out.println("Al enterarse de lo que planeas hacer 10 Hadas salen de su escondite y te buscan");
        System.out.println("Lograron escapar de las garras del Mago y deciden darte poder para ayudarte en tu mision.");
        System.out.println("Por cada 10 Hadas que rescates estas te brindaran mas poder para ayudarte!");
        System.out.println("¿Podras salvar a la villa antes de que se agote el tiempo?");
        System.out.println("Toca averiguarlo");

        edu.mateomj.retofinal.process.GameProcess.playerHub();

    }
}

package edu.mateomj.reto2.ui;
import java.util.*;
import edu.mateomj.reto2.process.Boletos;
import edu.mateomj.reto2.process.Piramide;

/**
 * la clase CLI se encarga de la interaccion con el usuario con inputs y imprimiendo indicaciones
 */
public class CLI {
    /**
     * El metodo menuPrograma te permite escoger cual seccion del proyecto quieres presenciar, si la de boletos o la de piramide
     */
    public static void menuPrograma(){

        System.out.println("Seleccione el apartado del reto a visualisar");
        System.out.println("a. Programa de Boletos");
        System.out.println("b. Programa de Piramide");
        System.out.println("c. Cerrar Programa");

        Scanner leeropcion = new Scanner(System.in);
        String seleccionmenu = leeropcion.nextLine();

        switch (seleccionmenu) {
            case "a":
                cliBoletos();
                break;
            case "b":
                cliPiramide();
                break;
            case "c":
                System.exit(0);
                break;
            default:
                System.out.println("Favor de introducir una opcion valida");
                edu.mateomj.reto2.ui.CLI.menuPrograma();

        }
    }

    /**
     * los ints estaticos de precioTotal y asteriscosPiramide existen en la instancia de la clase CLI y permiten el movimiento
     * de los valores de la instancia de la clase al objeto referente cuál requiere del dato
     */
    public static int precioTotal;
    public static int asteriscosPiramide;

    /**
     * el metodo cliPirmide se encarga de recibir cuantos asteriscos quiere que contenga la piramide el usuario y de preguntar
     * si quiere hacer otra piramide
     */
    public static void cliPiramide(){
        Piramide Piramide1 = new Piramide();
        System.out.println("Inserte la cantidad de niveles que desea que contenga su piramide");

        Scanner leerinput = new Scanner(System.in);
        int input1 = Integer.parseInt(leerinput.nextLine());
        asteriscosPiramide = input1;

        Piramide1.crearPiramide(asteriscosPiramide);

        System.out.println("Desea hacer otra piramide?");
        System.out.println("Y/N");
        String input2 = leerinput.nextLine();

        switch (input2) {
            case "Y":
                cliPiramide();
                break;
            case "N":
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida, Regresando a Menu principal");
                edu.mateomj.reto2.ui.CLI.menuPrograma();
        }

    }

    /**
     * el Metodo cliBoletos se encarga de solicitar los boletos que quiere comprar el usuario y de mandar la informacion
     * al int estatico que contiene el total en la instancia de la clase
     */
    public static void cliBoletos(){
        Boletos Boleto1 = new Boletos();
        System.out.println("Buenos dias que tipo de boleto desea comprar");
        System.out.println("Clave A: Boleto Standard = 100.00 Mex");
        System.out.println("Clave N: Boleto de Niño = 70.00 Mex");
        System.out.println("Clave B: Boleto de Adulto Mayor = 70.00 Mex");
        System.out.println("Clave I: Boleto de Adulto Mayor con credencial INAPAM = 50.00 Mex");

        Scanner leerInput = new Scanner(System.in);
        String input = leerInput.nextLine();

        switch (input) {
            case "A":
                Boleto1.getboletoA(precioTotal);
                break;
            case "N":
                Boleto1.getboletoN(precioTotal);
                break;
            case "I":
                Boleto1.getboletoI(precioTotal);
                break;
            case "B":
                Boleto1.getboletoB(precioTotal);
                break;
            default:
                System.out.println("Opcion no valida, Regresando a Menu principal");
                edu.mateomj.reto2.ui.CLI.cliBoletos();
        }

        System.out.println("Desea comprar otro boleto?");
        System.out.println("Y/N");

        input = leerInput.nextLine();

        switch (input) {
            case "Y":
                cliBoletos();
                break;
            case "N":
                System.out.println("Este es su total:"+precioTotal);
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida, Regresando a Menu principal");
                edu.mateomj.reto2.ui.CLI.menuPrograma();
        }


    }
}

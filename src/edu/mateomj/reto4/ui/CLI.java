package edu.mateomj.reto4.ui;
import java.util.Scanner;
import java.util.ArrayList;
import edu.mateomj.reto4.process.Estadistica;

/**
 * CLI se encarga de lo que es el desplegar resultados al usuario y
 * seleccion de opciones a realizar para el usuario
 */
public class CLI {

    public static double[][] tablacafe = {  //Cada columna de valor es un trimestre
            {111, 483, 471, 427}, //chocolate
            {192, 500, 355, 158}, //vainilla
            {289, 470, 474, 160}, //Fresa
            {415, 114, 161, 308} // Oreo
    };

    static String[] trimestrestabla = {"Enero a Marzo", "Abril a Junio", "Julio a Septiembre", "Octubre a Diciembre"};

    static String[] saborcafe = {"Chocolate", "Vainilla", "Fresa", "Oreo" };

    /**
     * Menu_Ventas se encarga de desplegar las opciones de operaciones al usuario para utilizar
     */
    public static void Menu_Ventas() {

        System.out.println("Hola buen dia, Seleccione la estadistica que desea obtener");
        System.out.println("a. Trimestre que mas vende por sabor en existencia");
        System.out.println("b. Trimestre que mas producto vendio");
        System.out.println("c. Salir ");

        Scanner leeropcion = new Scanner(System.in);
        String seleccionmenu = leeropcion.nextLine();

        switch (seleccionmenu) {
            case "a":
                CLI.TrimestreMayorVentaSabor();
                break;
            case "b":
                CLI.MejorVentaTrimestre();
                break;
            case "c":
                System.exit(0);
                break;
            default:
                System.out.println("Favor de introducir una opcion valida");
                CLI.Menu_Ventas();
        }


    }

    /**
     * ReiniciarOperacion se encarga de brindarle la opcion al usuario de continuar
     * usando el programa sin tener que salir de el y volverlo a abrir
     */
    public static void ReiniciarOperacion()
    {
        System.out.println("¿Desea obtener otra estadistica?");
        System.out.println("a. Si");
        System.out.println("b. No (Salir Programa) ");

        Scanner leeropcion2 = new Scanner(System.in);
        String seleccionmenu = leeropcion2.nextLine();


        switch (seleccionmenu) {
            case "a":
                CLI.Menu_Ventas();
                break;
            case "b":
                System.exit(0);
                break;
            default:
                System.out.println("Favor de introducir una opcion valida");
                CLI.ReiniciarOperacion();
        }
    }

    /**
     * TrimestreMayorVentaSabor se encarga de convertir los valores obtenidos de SaborMayorVenta
     * a informacion que pueda utilizar el usuario
     */
    public static void TrimestreMayorVentaSabor()
    {

        for (int i = 0; i <saborcafe.length; i++)
        {
            ArrayList<Integer> trimestres = Estadistica.SaborMayorVenta(tablacafe);
            System.out.println("El trimestre que mejor vendió para el sabor " + saborcafe[i] + " fue de " +trimestrestabla[trimestres.get(i)]);
        }
        CLI.ReiniciarOperacion();

    }

    /**
     * MejorVentaTrimestre se encarga de convertir la informacion obtenida de MayorVentaProduct
     * a informacion que pueda utilizar el usuario
     */
    public static void MejorVentaTrimestre()
    {
        Estadistica.MayorVentaProduct();
        int trimestreamostrar = Estadistica.MayorVentaProduct();
            System.out.print("El trimestre con mas ventas fue " + trimestrestabla[trimestreamostrar]);
        CLI.ReiniciarOperacion();
    }
}


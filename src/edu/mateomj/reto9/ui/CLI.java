package edu.mateomj.reto9.ui;
import java.util.Scanner;
import edu.mateomj.reto9.process.Ayudante;
import edu.mateomj.reto9.process.Pelota;

/**
 * La clase CLI se encarga de las interacciones con el usuario por medio de prints
 */
public class CLI {
    /**
     * El metodo menuPrograma se encarga de dejar al usuario escoger cuál seccion del programa quiere usar, si la de pelotas o la de ayundates
     */
    public static void menuPrograma(){
        System.out.println("Favor de seleccionar el apartado a checar");
        System.out.println("a. Ayudante");
        System.out.println("b. Pelota");
        System.out.println("c. Salir ");

        Scanner leeropcion = new Scanner(System.in);
        String seleccionmenu = leeropcion.nextLine();

        switch (seleccionmenu) {
            case "a":
                imprimirAyudantes();
                break;
            case "b":
                menuPelota();
                break;
            case "c":
                System.exit(0);
                break;
            default:
                System.out.println("Favor de introducir una opcion valida");
                edu.mateomj.reto9.ui.CLI.menuPrograma();
        }
    }

    /**
     * Este metodo se encarga de imprimir los datos d ela seccion del reto de pelota
     */
    public static void menuPelota(){
        Pelota Pelota1 = new Pelota();
        System.out.println("Estos son los valores de su pelota");
        System.out.println("-----------------------------------");
        System.out.println("Este es el color de su pelota: "+Pelota1.getcolorPelota());
        System.out.println("Su pelota tiene "+Pelota1.getpoder()+" kilotones de fuerza explosiva");
        System.out.println("Su pelota va a "+Pelota1.getrapidez()+" kilometros por hora");
        System.out.println("-----------------------------------");

        Pelota1.aumentarpoder();
        Pelota1.disminuirrapidez();

        System.out.println("Estos son los valores ahora cambiados como pide el reto");
        System.out.println("-----------------------------------");
        System.out.println("Este es el color de su pelota: "+Pelota1.getcolorPelota());
        System.out.println("Su pelota tiene "+Pelota1.getpoder()+" kilotones de fuerza explosiva");
        System.out.println("Su pelota va a "+Pelota1.getrapidez()+" kilometros por hora");
        System.out.println("-----------------------------------");
        //menuPelota();



    }

    /**
     * Este metodo se encarga de imprimir lo relacionado al reto de ayudantes
     */
    public static void imprimirAyudantes(){
        Ayudante Ayudante1 = new Ayudante();
        Ayudante Ayudante2 = new Ayudante();
        Ayudante Ayudante3 = new Ayudante();
        Ayudante Ayudante4 = new Ayudante();
        Ayudante Ayudante5 = new Ayudante();

        //estoy al tanto de que se veo feo el bloque de código, pero hay que llamar a cada constructor 5 veces para cada atributo
        System.out.println("Aqui los rasgos de su ayudante numero 1");
        System.out.println("Su cantidad de ojos: "+ Ayudante1.getojos());
        System.out.println("Su color de piel: "+ Ayudante1.getpiel());
        System.out.println("Su estatura: "+ Ayudante1.getaltura());
        System.out.println("Su poder de creacion: "+ Ayudante1.getnivelCreacion());
        System.out.println("Su poder destructivo: "+ Ayudante1.getnivelDestructivo());
        System.out.println("-----------------------------------------------");
        System.out.println("Aqui los rasgos de su ayudante numero 2");
        System.out.println("Su cantidad de ojos:"+ Ayudante2.getojos());
        System.out.println("Su color de piel:"+ Ayudante2.getpiel());
        System.out.println("Su estatura:"+ Ayudante2.getaltura());
        System.out.println("Su poder de creacion:"+ Ayudante2.getnivelCreacion());
        System.out.println("Su poder destructivo:"+ Ayudante2.getnivelDestructivo());
        System.out.println("-----------------------------------------------");
        System.out.println("Aqui los rasgos de su ayudante numero 3");
        System.out.println("Su cantidad de ojos:"+ Ayudante3.getojos());
        System.out.println("Su color de piel:"+ Ayudante3.getpiel());
        System.out.println("Su estatura:"+ Ayudante3.getaltura());
        System.out.println("Su poder de creacion:"+ Ayudante3.getnivelCreacion());
        System.out.println("Su poder destructivo:"+ Ayudante3.getnivelDestructivo());
        System.out.println("-----------------------------------------------");
        System.out.println("Aqui los rasgos de su ayudante numero 4");
        System.out.println("Su cantidad de ojos:"+ Ayudante4.getojos());
        System.out.println("Su color de piel:"+ Ayudante4.getpiel());
        System.out.println("Su estatura: "+ Ayudante4.getaltura());
        System.out.println("Su poder de creacion: "+ Ayudante4.getnivelCreacion());
        System.out.println("Su poder destructivo: "+ Ayudante4.getnivelDestructivo());
        System.out.println("-----------------------------------------------");
        System.out.println("Aqui los rasgos de su ayudante numero 5");
        System.out.println("Su cantidad de ojos: "+ Ayudante5.getojos());
        System.out.println("Su color de piel: "+ Ayudante5.getpiel());
        System.out.println("Su estatura: "+ Ayudante5.getaltura());
        System.out.println("Su poder de creacion: "+ Ayudante5.getnivelCreacion());
        System.out.println("Su poder destructivo: "+ Ayudante5.getnivelDestructivo());
        System.out.println("-----------------------------------------------");

        System.out.println("Desea volver al menu principal?");
        System.out.println("a: Volver al Menu");
        System.out.println("b: Cerrar Programa");
        Scanner leeropcion = new Scanner(System.in);
        String seleccionmenu = leeropcion.nextLine();
        switch (seleccionmenu) {
            case "a":
                edu.mateomj.reto9.ui.CLI.menuPrograma();
                break;
            case "b":
                System.exit(0);
                break;
            default:
                System.exit(0);

        }

        }
    }

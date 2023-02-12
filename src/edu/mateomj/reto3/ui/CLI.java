package edu.mateomj.reto3.ui;
import java.util.Scanner;
import edu.mateomj.reto3.process.Conversion;

public class CLI {

    public static void Menu_Conversor() {
        String tipoconversion = " ";
        //String valoraconvertir;
        String valorintroducido = " ";
        //String seleccionUsuario;
        //string regresoofin;

        System.out.println("** Programa de Conversiones Numericas **");

        System.out.println("a. convertir de decimal a binario");
        System.out.println("b. Convertir de decimal a octal");
        System.out.println("c. Convertir de decimal a hexadecimal");
        System.out.println("d. Convertir de binario a decimal");
        System.out.println("e. Convertir octal a decimal");

        Scanner LeerSeleccion = new Scanner(System.in);
        String seleccionUsuario = LeerSeleccion.nextLine();

        switch (seleccionUsuario) {
            case "a":
                tipoconversion = "Decimal a Binario";
                break;
            case "b":
                tipoconversion = "Decimal a Octal";
                break;
            case "c":
                tipoconversion = "Decimal a Hexadecimal";
                break;
            case "d":
                tipoconversion = "Binario a Decimal";
                break;
            case "e":
                tipoconversion = "Octal a Decimal";
                break;
            default:
                System.out.println("Favor de introducir una opcion valida");
                CLI.Menu_Conversor();

        }

        System.out.println("Tipo de Conversion seleccionado =" + "(" + seleccionUsuario + ")" + tipoconversion);
        System.out.println("Favor de introducir el valor a convertir");

        Scanner leervalorconversion = new Scanner(System.in);
        String valoraconvertir = leervalorconversion.nextLine();

        switch (seleccionUsuario) {
            case "a" -> valorintroducido = Conversion.ConversionDecimalBinario(valoraconvertir);
            //case "b" -> valorintroducido = Conversion.ConversionDecimalOctal(valoraconvertir);
            //case "c" -> valorintroducido = Conversion.ConversionDecimalHexadecimal(valoraconvertir);
            //case "d" -> valorintroducido = Conversion.ConversionOctalDecimal(valoraconvertir);
            //case "e" -> valorintroducido = Conversion.ConversionHexadecimalDecimal(valoraconvertir);
        }
        //System.out.println("La conversion es la siguiente:"+valoraconvertir);
        System.out.println("¿Desea convertir otra cantidad a un sistema numerico distinto?");
        System.out.println("a: Si");
        System.out.println("b: No");

        Scanner promptreinicio = new Scanner(System.in);
        String regresoofin = leervalorconversion.nextLine();

        switch (regresoofin) {
            case "a":
                CLI.Menu_Conversor();
                break;
            case "b":
                System.exit(0);
                break;
        }

        }
    }


package edu.mateomj.reto1.ui;
import edu.mateomj.reto1.process.Calculator;
import java.util.Scanner;
public class CLI {

    /**
     * En esta clase se maneja lo que es la interfaz de el programa para realizar operaci
     * <p>
     * variable seleccion variable que almacena el valor con el cual se selecciona la operacion
     * variable operacion Variable con la cual se accede a la operacion a realizar en la clase calculator
     * variable resultado variable que guarda el resultado final, es -999999999 para alertar al usuario si falla de que algo salio mal
     */
    public static void Menu_Operaciones() {
        int seleccion;
        int resultado = -999999999;

        System.out.println("Seleccione la operacion que quiere realizar");
        System.out.println("1:Suma");
        System.out.println("2:Resta");
        System.out.println("3:Division");
        System.out.println("4:Mutliplicacion");
        System.out.println("5:Residuo Division");
        System.out.println("6:Salir");

            Scanner scanner = new Scanner(System.in);
            seleccion = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Introduce el primer valor");
            int num1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Introduce el segundo valor");
            int num2 = scanner.nextInt();
            scanner.nextLine();

        switch (seleccion) {
            case 1 -> resultado = Calculator.Sumaroperacion(num1, num2);
            case 2 -> resultado = Calculator.restaroperacion(num1, num2);
            case 3 -> resultado = Calculator.dividiroperacion(num1, num2);
            case 4 -> resultado = Calculator.multiplicacionoperacion(num1, num2);
            case 5 -> resultado = Calculator.residuooperacion(num1, num2);
            case 6 -> System.exit(0);
        }
        System.out.printf("El resultado de su operacion es:"+resultado);
    }
}

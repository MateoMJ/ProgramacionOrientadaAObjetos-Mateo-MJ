package edu.mateomj.reto5.process;
import edu.mateomj.reto5.ui.CLI;

import java.util.ArrayList;
import java.util.Scanner;

public class JuegoLetra {


    /**
     *
     * @param palabraselect: almacena la palabra que utiliza el programa para que el usuario la pueda adivinar
     * @return esta es una variable muerta que se requiere para que funcione el programa, se regresa al menu antes de ser usada
     */
    public static String AdivinaLetra(String palabraselect)
    {
        ArrayList<String> letraintroducida = new ArrayList<>();
        ArrayList<Integer> letraencontrada = new ArrayList<>();
        String letraIntroducida;
        Scanner scanner = new Scanner(System.in);

        while (letraencontrada.size() != palabraselect.length()) {
            System.out.println("Introduzca una letra");
            for (int i = 0; i < palabraselect.length(); i++) {
                if (letraencontrada.contains(i)) {
                    System.out.print(palabraselect.charAt(i));
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
            letraIntroducida = scanner.next();

            if (letraintroducida.contains(letraIntroducida)) {
                System.out.println("Ya introduciste esa letra");
                continue;
            }
            boolean palabraEncontrada = false;
            for (int i = 0; i < palabraselect.length(); i++) {
                if (palabraselect.charAt(i) == letraIntroducida.charAt(0)) {
                    palabraEncontrada = true;
                    letraencontrada.add(i);
                }
            }
            if (palabraEncontrada) {
                letraintroducida.add(letraIntroducida);
                System.out.println("Encontraste una letra!");
            } else {
                letraintroducida.add(letraIntroducida);
                System.out.println("Intentelo de nuevo");
            }
        }

        CLI.MenuDificultad();
        return String.valueOf(0);
    }



}

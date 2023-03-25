package edu.mateomj.reto5.process;
import edu.mateomj.reto5.ui.CLI;
import java.util.*;

/**
 * JuegoLetra se encarga de lo que es el proceso de el juego de adivinar palabras
 */
public class JuegoLetra {

    /**
     *
     * @param palabraselect Contiene la palabra que estara adivinando el jugador
     */
    public static void adivinaletra(String palabraselect)
    {
        ArrayList<String> letraintroducida = new ArrayList<>();
        ArrayList<Integer> letraencontrada = new ArrayList<>();
        List <String> numeros = List.of(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"});
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
            if (letraintroducida.contains("0")) {
                System.exit(0);
            }
            if (new HashSet<>(numeros).containsAll(Arrays.asList("1", "2","3","4","5","6","7","8","9"))) {
                System.out.println("Favor de Insertar un caracter valido");
            }
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
        CLI.menudificultad();
    }



}
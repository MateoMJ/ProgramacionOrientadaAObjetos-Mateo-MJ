package edu.mateomj.retofinal.ui;
import java.util.*;

/**
 * esta clase imprime texto que no se puede categorizar facilmente, tambien tiene un scanner que se usa atraves del codigo
 */
public class CLI_Misc {
    /**
     * Clase de escaner de inputs
     * @return regresa el input del usuario
     */
    public static String getplayerinput() {
        String inputParaReturn;
        Scanner leerinput = new Scanner(System.in);
        inputParaReturn = leerinput.nextLine();
        return inputParaReturn;

        /**
         * Esta clase imprime que te equivocaste si el input de un switch no es ningua opcion
         */
    }
    public static void inputInvalido(){
        System.out.println("Favor de introducir una opcion valida");
        return;

    }
}


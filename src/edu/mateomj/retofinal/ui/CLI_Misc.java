package edu.mateomj.retofinal.ui;
import java.util.*;


public class CLI_Misc {
    public static String getplayerinput() {
        String inputParaReturn;
        Scanner leerinput = new Scanner(System.in);
        inputParaReturn = leerinput.nextLine();
        return inputParaReturn;

    }
    public static void inputInvalido(){
        System.out.println("Favor de introducir una opcion valida");
        return;

    }
}


package edu.mateomj.retoExtra.process;
import edu.mateomj.retoExtra.ui.CLI;

import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

/**
 * Esta clase se encarga de tomar los comandos del usuario y correrlos e imprimirlos
 */
public class LectorComando {
    public static char[] vocales  = {'a','e','i','o','u'};
    public static char[] novocales ={'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};

    /**
     * Este metodo contiene toda la logica del programa
     */

    public static void ejecutarPrograma() {
        String archivoPath = "src/edu/mateomj/retoExtra/ArchivoOrdenes";
        CLI.menuPrograma();

        String inputPrograma = " ";
        inputPrograma = CLI.getuserinput(inputPrograma);

        switch (inputPrograma) {
            case "a":

                break;
            case "b":
                archivoPath = CLI.getuserinput(inputPrograma);
                break;
            case "c":
                System.exit(0);
                break;
            default:
                System.out.println("Favor de introducir una opcion valida");
                CLI.inputInvalido();
        }
        ArrayList<String> listaComandos = new ArrayList<>();

        Path path = Paths.get(archivoPath);
        try {
            List<String> lineasDelArchivo = Files.readAllLines(path);
            listaComandos.addAll(lineasDelArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String linea : listaComandos) {
            if(linea.trim().length() >=1 ){
                String[] separador = linea.split(":");
                String comandoL = (separador[0]);
                String comando2 = (separador[1]);
                System.out.print(comandoL);
                System.out.print(":");
                System.out.print(comando2);
                System.out.println();


                switch (comandoL) {
                    case "C":
                        int cuadradomaker =Integer.parseInt(comando2);
                        for (int i=0; i<cuadradomaker; i++) {
                            for (int j = 0; j < cuadradomaker; j++) {
                                System.out.print("*");
                            }
                            for (int k = 0; k < cuadradomaker; k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case "T":
                        int triangulomaker =Integer.parseInt(comando2);
                        for (int i=0; i<triangulomaker; i++) {
                            for (int j = 1; j < triangulomaker - i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k < (i * 2) + 1; k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case "P":
                        int restador =1;
                        char[] guardaLetra1 = comando2.toCharArray();
                        int index = guardaLetra1.length;
                        index = index-restador;
                        int indexoperando = index;
                        for(int i=0; i<index; i++){
                                    System.out.print(guardaLetra1[indexoperando]);
                                indexoperando= indexoperando-restador;
                        }
                        System.out.print(guardaLetra1[0]);
                        System.out.println();


                        break;
                    case "S":
                        int dosletracheck= 0;
                        char[] guardaLetra2 = comando2.toCharArray();
                        for(int i =0; i<vocales.length; i++ ){
                            for(int j=0; j<guardaLetra2.length; j++){
                                if(vocales[i]==guardaLetra2[j]){
                                    guardaLetra2[j]='*';
                                    if(guardaLetra2.length<j+1){
                                        if(guardaLetra2[j]==guardaLetra2[j+1]){
                                            guardaLetra2[j+1]='*';
                                        }
                                        j++;
                                    }
                                }
                            }
                        }
                        for(int i =0; i<novocales.length; i++ ){
                            for(int j=0; j<guardaLetra2.length; j++){
                                if(novocales[i]==guardaLetra2[j]){
                                    guardaLetra2[j] ='#';
                                    if(guardaLetra2.length<j+1){
                                        if(guardaLetra2[j]==guardaLetra2[j+1]){
                                            guardaLetra2[j+1]='*';
                                        }
                                        j++;
                                    }
                                }
                            }
                        }
                        System.out.println(guardaLetra2);
                        break;
                }

            }else {
                //Vacio porque no queremos hacer nada con las lineas vacias
            }

        }

    }
}


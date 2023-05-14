package edu.mateomj.retofinal.process;
import edu.mateomj.retofinal.objects.personajes.Heroe;
import edu.mateomj.retofinal.objects.personajes.Mago;
import edu.mateomj.retofinal.objects.personajes.Ogro;
import edu.mateomj.retofinal.objects.Villa;

import java.io.*;
import java.util.Random;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * clase que tiene toda la logica del juego
 */
public class GameProcess {
    /**
     * clase que pone los valores iniciales de los objetos declarados
     */

    public static void objectInitialize(){
        Heroe.vidaMaxima =10;
        Heroe.vidaActual =10;
        Heroe.defensaMaxima =6;
        Heroe.defensaActual =6;
        Villa.tiempoRestante =30;
        Villa.hadasRescatadas =1;
        playerHub();
    }

    /**
     * metodo que se encarga de cosas cuando estas en la villa
     */
    public static void playerHub(){
        String playerInput;

        edu.mateomj.retofinal.ui.CLI_Villa.printDecidirAccion();

        playerInput = edu.mateomj.retofinal.ui.CLI_Misc.getplayerinput();

        switch (playerInput) {
            case "a":
                edu.mateomj.retofinal.ui.CLI_Pelea.printInicioPeleaOgroBuscada();
                peleaOgro();
                break;
            case "b":
                explorarMazmorra();
                break;
            case "c":
                int disminuir = 1;
                Heroe.vidaActual = Heroe.vidaMaxima;
                Heroe.defensaActual = Heroe.defensaMaxima;
                Villa.tiempoRestante = Villa.tiempoRestante-disminuir;
                edu.mateomj.retofinal.ui.CLI_Villa.printDescanso();
                break;
            case "d":
                //Pelea Mago
                break;
            default:
                edu.mateomj.retofinal.ui.CLI_Misc.inputInvalido();
                playerHub();
        }
        playerHub();

    }

    /**
     * meotod que se encarga de la logica random de explorar la mazmorra
     */
    public static void explorarMazmorra(){
        int incrementador =1;
        int decrementador =1;
        edu.mateomj.retofinal.ui.CLI_Mazmorra.printEntrarMazmorra();

        Random randomEvent = new Random();
        int elegirTipoEvento;
        elegirTipoEvento = randomEvent.nextInt(4);

        switch (elegirTipoEvento) {
            case 0: //Rescatar hadas
                edu.mateomj.retofinal.ui.CLI_Mazmorra.printRescatarHadas();
                Villa.hadasRescatadas = Villa.hadasRescatadas+incrementador;
                edu.mateomj.retofinal.ui.CLI_Mazmorra.printSalirMazmorra();
                playerHub();
                break;
            case 1: //Encontrar pocion
                edu.mateomj.retofinal.ui.CLI_Mazmorra.printEncontrarPocion();
                Heroe.potion = Heroe.potion+incrementador;
                edu.mateomj.retofinal.ui.CLI_Mazmorra.printSalirMazmorra();
                playerHub();
                break;
            case 2: //perder vida

                break;
            case 3: //Encontrar Ogro
                edu.mateomj.retofinal.ui.CLI_Mazmorra.encontrarOgro();
                peleaOgro();

            case 4: //Perder un dia
                edu.mateomj.retofinal.ui.CLI_Mazmorra.printperderUnDia();
                Villa.tiempoRestante = Villa.tiempoRestante-decrementador;
                playerHub();
                break;
        }

    }

    /**
     * meotodo que deberia de encargarse de la pelea con el ogro que lamentablemente no funciono despues de como 8 intentos, se me acabo el tiempo
     */
    public static void peleaOgro() {
        Random elementoRandom = new Random();
        Ogro Ogro1 = new Ogro();
        int seleccionAtaqEnemigo;
        int valorAtaque1 =0;
        int ValorAtaque2 =0;
        seleccionAtaqEnemigo = elementoRandom.nextInt(3);

        switch (seleccionAtaqEnemigo) {
            case 0: //Ataque tipo 1
                //Ogro1.ataque1A(valorAtaque1);
                break;
            case 1: //Ataque tipo 2

                break;
            case 2: //Ataque tipo 3

                break;
            case 3: //Ataque tipo 4

                break;
        }

    }
}

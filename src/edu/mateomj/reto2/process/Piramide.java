package edu.mateomj.reto2.process;

/**
 * La clase piramide se encarga de procesar e imprimir la piramide de asteriscos
 */
public class Piramide {

    /**
     * Constructor default de un objeto tipo Piramide
     */
    public Piramide(){

    }

    /**
     *la clase crear piramide recibe el input del usuario y crea una piramide con ese dato
     * @param asteriscosPiramide contiene el valor de cuantos asteriscos tiene la piramide para crear la en base al tama;o especificaco
     */
    public void crearPiramide(int asteriscosPiramide){
        for (int i=0; i<asteriscosPiramide; i++){
            for (int j=1; j<asteriscosPiramide-i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

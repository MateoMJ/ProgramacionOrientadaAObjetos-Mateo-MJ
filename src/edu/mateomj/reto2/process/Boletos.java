package edu.mateomj.reto2.process;
import edu.mateomj.reto2.ui.CLI;

/**
 * La clase boletos se encarga de añadir el total de boletos comprados a la variable estatica que lo guarda
 */
public class Boletos {
    public int boletoA = 100;
    public int boletoN = 70;
    public int boletoB = 70;
    public int boletoI = 50;
    public Boletos(){

    }

    /**
     * Todos los metodos de getter modifican la variable estatica de precio total para saber el costo final
     * @param precioTotal el costo de todos los boletos que se han comprado
     */

    public void getboletoA(int precioTotal){
        CLI.precioTotal = precioTotal+boletoA;
    }
    public void getboletoN(int precioTotal){
        CLI.precioTotal = precioTotal+boletoN;
    }
    public void getboletoB(int precioTotal){
        CLI.precioTotal = precioTotal+boletoB;
    }
    public void getboletoI(int precioTotal){
        CLI.precioTotal = precioTotal+boletoI;
    }
}

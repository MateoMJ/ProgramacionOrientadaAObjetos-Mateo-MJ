package edu.mateomj.reto4.process;

import java.util.ArrayList;
import java.util.List;
/**
 * la clase Estadistica se encarga de operaciones para obtener la informacion
 * que requiere el usuario
 */
public class Estadistica {

    /**
     * SaborMayorVenta se encarga de calcular el trimestre que mas producto
     * vendio de todos los sabores de cafe
     *
     * @param tablacafe accede a el array que contiene todos los valores de venta con los cuales trabaja el programa
     * @return regresa el valor numerico de los trimestres con mayores ventas para convertir a sus equivalentes en texto
     */
    public static ArrayList<Integer> SaborMayorVenta(double[][] tablacafe)
    {
        double max;
        List<Integer> trimestres = new ArrayList<>();
        int auxindex = 0;

        for (int i = 0; i < tablacafe.length; i++)
        {
            max = Double.MIN_VALUE;
            for (int j = 0; j < tablacafe.length; j++)
            {
                if (tablacafe[i][j] > max)
                {
                    max = tablacafe[i][j];
                    auxindex = j;
                }
            }
            trimestres.add(auxindex);

        }
        return (ArrayList<Integer>) trimestres;
    }

    /**
     * MayorVentaProduct se encarga de calcular el trimestre que mas ventas vio de todos los productos en general
     * @return regresa el valor numerico de el trimestre con mas ventas para convertir a equivalente de texto
     */
    public static int MayorVentaProduct()
    {
        double[][] tablacafe ={};
        double max;
        List<Integer> trimestres = new ArrayList<>();
        int auxindex = 0;

        for (int i = 0; i < tablacafe.length; i++)
        {
            max = Double.MIN_VALUE;
            for (int j = 0; j < tablacafe.length; j++)
            {
                if (tablacafe[j][i] > max)
                {
                    max = tablacafe[i][j];
                    auxindex = j;
                }
            }
            trimestres.add(auxindex);

        }
        return auxindex;
    }
}

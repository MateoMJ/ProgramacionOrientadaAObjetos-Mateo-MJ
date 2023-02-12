package edu.mateomj.reto3.process;
import java.util.ArrayList;

public class Conversion {

    public static String ConversionDecimalBinario(String valoraconvertir)
    {
        //String convertirstring ="";
        int valorenuso = Integer.parseInt(valoraconvertir);
        ArrayList<String> valorbinario = new ArrayList<>();
        while(valorenuso >0)
        {
            valorenuso =(valorenuso/2);
            if(valorenuso%2 ==0)
            {
                valorbinario.add("1");
            }
            else
            {
                valorbinario.add("0");
            }

        }
        String convertirstring ="";
        for (String f : valorbinario) {
            convertirstring += f +"";
        }
        System.out.println("La conversion es la siguiente: " + convertirstring);
        return valoraconvertir;
    }
    //public static String ConversionDecimalOctal(String valoraconvertir)
    {

    }
    //public static String ConversionDecimalHexadecimal(String valoraconvertir)
    {

    }
    //public static String ConversionOctalDecimal(String valoraconvertir)
    {

    }
    //public static String ConversionHexadecimalDecimal(String valoraconvertir)
    {

    }
}


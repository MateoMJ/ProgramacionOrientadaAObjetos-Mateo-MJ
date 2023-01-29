package edu.mateomj.reto1.process;
/**
 * Clase de Ejecucion de logica de calculadora
 * Aqui se realizan todas las operaciones
 * variable num1 Primer valor a usar en la operacion
 * variable num2 Segundo valor a usar en la operacion
 * */
public class Calculator
{

    public static int Sumaroperacion(int num1, int num2)
    {
        return num1 + num2;
    }
    public static int restaroperacion(int num1, int num2)
    {
        return num1 - num2;
    }
    public static int dividiroperacion(int num1, int num2)
    {
        return num1 / num2;
    }
    public static int multiplicacionoperacion(int num1, int num2)
    {
        return num1 * num2;
    }
    public static int residuooperacion(int num1, int num2)
    {
        return num1 % num2;
    }

}

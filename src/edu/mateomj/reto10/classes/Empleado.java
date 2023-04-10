package edu.mateomj.reto10.classes;

/**
 * La clase abstracta base de empleado cual se encarga de poner el metodo de trabajar para ser heredado
 */
public abstract class Empleado
{

    public String nombre;
    public String apellido;
    public String fechanacimiento;
    public int Sueldo;


    /**
     * El metodo abstracto de trabajar para ser heredado por todos los roles que forman el diagrama
     */
    public abstract void trabajar();
}

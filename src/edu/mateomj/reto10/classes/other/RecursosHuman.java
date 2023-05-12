package edu.mateomj.reto10.classes.other;
import edu.mateomj.reto10.interfaces.Administracion.Interviewer;
import edu.mateomj.reto10.classes.Empleado;

/**
 * La clase de RecursosHuman representa lo que sera la seccion de recursos humanos en una empresa,
 * Permite la creacion de objetos tipo RecursosHuman por medio de constructores
 */
public class RecursosHuman extends Empleado implements Interviewer
{
    /**
     * El constructor a utilizar para construir un objeto tipo RecursosHuman
     * @param nombre El primer nombre del HR, heredado de Empleado
     * @param apellido El segundo nombre del HR, heredado de Empleado
     * @param fechanacimiento La fecha en donde nació el HR para deducir su edad, heredado de Empleado
     * @param sueldo Cuanto le pagan al HR, heredado de Empleado
     */
    public RecursosHuman(String nombre, String apellido, String fechanacimiento, int sueldo){
        super();
    }

    /**
     * Constructor default de HR
     */
    public RecursosHuman(){

    }
    /**
     * Metodo entrevistar cual indica como entrevista el rol asignado
     */
    @Override
    public void entrevistar()
    {
        System.out.println("Entrevistando empleados");
    }

    /**
     * metodo Trabajar cual indica como trabaja el rol asignado
     */
    @Override
    public void trabajar()
    {
        System.out.println("Trabajando como recursos humanos");
    }
}

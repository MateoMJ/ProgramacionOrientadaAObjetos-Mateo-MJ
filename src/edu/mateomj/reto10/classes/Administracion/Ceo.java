package edu.mateomj.reto10.classes.Administracion;
import edu.mateomj.reto10.classes.Administracion.Manager;

/**
 * La clase Ceo representa lo que seria el Ceo de una empresa cual administra muchas cosas
 * esta clase construye un objeto de ceo por medio de constructores
 */
public class Ceo extends Manager
{
    /**
     * El constructor a utilizar para construir un objeto tipo Ceo
     * @param nombre El primer nombre del Ceo, heredado de Empleado
     * @param apellido El segundo nombre del Ceo, heredado de Empleado
     * @param fechanacimiento La fecha en donde nació el Ceo para deducir su edad, heredado de Empleado
     * @param sueldo Cuanto le pagan al Ceo, heredado de Empleado
     * @param areaadministrada que administra el ceo, hereado de Manager
     */
    public Ceo(String nombre, String apellido, String fechanacimiento, int sueldo, String areaadministrada){
        super();
    }

    /**
     * Constructor Default del Ceo
     */
    public Ceo(){

    }
    /**
     * metodo Trabajar cuál indica como trabaja el rol asignado
     */
    @Override
    public void trabajar()
    {
        super.trabajar();
        System.out.println("Trabajando como CEO");
    }

    /**
     * metodo administrando cual indica que administraria y como lo hace el rol asignado
     */

    @Override
    public void administrando() {
        super.administrando();
        System.out.println("Administrando operaciones de la empresa");
    }
}

package edu.mateomj.reto10.classes.Engineers;
import edu.mateomj.reto10.classes.Engineers.JrEngineer;
import edu.mateomj.reto10.interfaces.Administracion.Interviewer;

/**
 * Clase que representa un programador experimentado en una empresa
 * esta clase construye un objeto de tipo SnrEngineer por medio de constructores
 */
public class SnrEngineer extends JrEngineer implements Interviewer
{

    /**
     * El constructor a utilizar para construir un objeto tipo SnrEngineer
     * @param nombre El primer nombre del Senior, heredado de Empleado
     * @param apellido El segundo nombre del senior, heredado de Empleado
     * @param fechanacimiento La fecha en donde nació el senior para deducir su edad, heredado de Empleado
     * @param sueldo Cuanto le pagan al senior, heredado de Empleado
     * @param rfc El rfc del sat del senior, heredado de JrEngineer
     */
    public SnrEngineer(String nombre, String apellido, String fechanacimiento, int sueldo, String lenguajes, String rfc){
        super();
    }

    /**
     * Constructor default de SnrEngineer
     */
    public SnrEngineer(){

    }
    /**
     * metodo Trabajar cual indica como trabaja el rol asignado
     */
    @Override
    public void trabajar() {
        super.trabajar();
        System.out.println("Trajando como Senior");
    }
    /**
     * metodo programar cual demuestra como programaria el rol asignado
     */
    @Override
    public void programar() {
        super.programar();
        System.out.println("Programando con mucha experiencia");
    }
    /**
     * metodo entrevistar cual indica como entrevisaria y a quien el rol asignado
     */
    @Override
    public void entrevistar()
    {
        System.out.println("Entrevistando nuevos Juniors");
    }

    @Override
    public void mantienimientocodigo() {
        super.mantienimientocodigo();
        System.out.println("Manteniendo codigo bien documentado de manera experta");
    }
}

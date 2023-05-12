package edu.mateomj.reto10.classes.Administracion;
import edu.mateomj.reto10.classes.Empleado;
import edu.mateomj.reto10.interfaces.Administracion.Interviewer;

/**
 * Clase Manager cuál representa un administrador en una empresa
 * esta clase construye un objeto de tipo Manager por medio de constructores
 */
public class Manager extends Empleado implements Interviewer
{

    public String areaadminstrada;

    /**
     * el metodo ToString permite asignar un valor a retornar de los atributos nativos de la clase
     * @return regresa los atributos nativos de esta clase
     */
    @Override
    public String toString() {
        return "Manager{" +
                "areaadminstrada='" + areaadminstrada + '\'' +
                '}';
    }

    /**
     *
     * El constructor a utilizar para construir un objeto tipo Manager
     * @param nombre El primer nombre del Manager, heredado de Empleado
     * @param apellido El segundo nombre del Manager, heredado de Empleado
     * @param fechanacimiento La fecha en donde nació el manager para deducir su edad, heredado de Empleado
     * @param sueldo Cuanto le pagan al X, heredado de Empleado
     * @param areaadministrada que area administra el manager, nativo de esta clase
     */
    public Manager(String nombre, String apellido, String fechanacimiento, int sueldo, String areaadministrada){
        super();
    }

    /**
     * Constructor default de Manager
     */
    public Manager(){

    }
    /**
     * metodo Trabajar cual indica como trabaja el rol asignado
     */
    @Override
    public void trabajar()
    {
        System.out.println("Trabajando como Manager");
    }

    /**
     * Metodo entrevistar cual indica como entrevistaria el rol
     */
    @Override
    public void entrevistar()
    {
        System.out.println("Entrevistando nuevos empleados");
    }

    /**
     * metodo administrando cual indica como administraria y que el rol asignado
     */
    public void administrando()
    {
        System.out.println("Administrando a los trabajadores de la oficina");
    }
}

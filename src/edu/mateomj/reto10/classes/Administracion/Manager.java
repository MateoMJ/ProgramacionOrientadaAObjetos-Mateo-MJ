package edu.mateomj.reto10.classes.Administracion;
import edu.mateomj.reto10.classes.Empleado;
import edu.mateomj.reto10.interfaces.Administracion.Interviewer;

/**
 * Clase Manager cual representaria un administrador en una empresa, hereda ele metodo trabajar, entrevistar y administrando
 */
public class Manager extends Empleado implements Interviewer
{

    private String areanadminstrada;
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

package edu.mateomj.reto10.classes.other;
import edu.mateomj.reto10.interfaces.Administracion.Interviewer;
import edu.mateomj.reto10.classes.Empleado;

/**
 * La clase de RecursosHuman representa lo que seria la seccion de recursos humanos en una empresa,
 * esta contiene los metodos entrevistar y trabajar cuales fueron heredados
 */
public class RecursosHuman extends Empleado implements Interviewer
{
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

package edu.mateomj.reto10.classes.Engineers;
import edu.mateomj.reto10.classes.Engineers.JrEngineer;
import edu.mateomj.reto10.interfaces.Administracion.Interviewer;

/**
 * Clase que representaria un programador experiemntado en una empresa, hereda los metodos trabajar, programar y entrevistar
 */
public class SnrEngineer extends JrEngineer implements Interviewer
{
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

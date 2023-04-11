package edu.mateomj.reto10.classes.Engineers;
import edu.mateomj.reto10.classes.Empleado;
import edu.mateomj.reto10.interfaces.Engineer.Programmer;
public class JrEngineer extends Empleado implements Programmer
{
    public String lenguajes;
    /**
     * metodo Trabajar cual indica como trabaja el rol asignado
     */
    @Override
    public void trabajar()
    {
        System.out.println("Trabajando como junior");
    }

    /**
     * metodo Trabajar cual indica como trabaja el rol asignado
     */
    @Override
    public void programar()
    {
        System.out.println("Programando con habilidades que pueden mejorar");
    }

    /**
     *  metodo mantenimientocodigo representa como un programador en este caso el junior haria mantenimiento
     */
    public void mantienimientocodigo()
        {
            System.out.println("Manteniendo codigo bien documentado");
        }
}

package edu.mateomj.reto10.classes.Administracion;
import edu.mateomj.reto10.classes.Administracion.Manager;

public class Ceo extends Manager
{
    /**
     * metodo Trabajar cual indica como trabaja el rol asignado
     */
    @Override
    public void trabajar()
    {
        super.trabajar();
        System.out.println("Trabajando como CEO");
    }

    /**
     * metodo administrando cual indica que administraria y como lo haria el rol asignado
     */

    @Override
    public void administrando() {
        super.administrando();
        System.out.println("Administrando operaciones de la empresa");
    }
}

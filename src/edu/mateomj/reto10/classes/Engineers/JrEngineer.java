package edu.mateomj.reto10.classes.Engineers;
import edu.mateomj.reto10.classes.Empleado;
import edu.mateomj.reto10.interfaces.Engineer.Programmer;

/**
 * La clase junior representa un programador novato de una empresa
 * esta clase construye un objeto de tipo JrEngineer por medio de constructores
 */
public class JrEngineer extends Empleado implements Programmer
{
    public String lenguajes;
    public String rfc;

    /**
     * el metodo ToString permite asignar un valor a retornar de los atributos nativos de la clase
     * @return regresa los atributos nativos de esta clase
     */
    @Override
    public String toString() {
        return "JrEngineer{" +
                "lenguajes='" + lenguajes + '\'' +
                ", rfc='" + rfc + '\'' +
                '}';
    }

    /**
     *Todos los metodos a continuacion de get y set permiten asignar y tomar valores de los atributos que utiliza la clase
     */
    public String getlenguajes(String lenguajes){
        return lenguajes;
    }
    public void setlenguajes(){
        this.lenguajes = lenguajes;
    }
    public String getrfc(){
        return rfc;
    }
    public void setrfc(){
        this.rfc = rfc;
    }

    /**
     *
     * El constructor a utilizar para construir un objeto tipo JrEngineer
     * @param nombre El primer nombre del junior, heredado de Empleado
     * @param apellido El segundo nombre del junior, heredado de Empleado
     * @param fechanacimiento La fecha en donde nació el junior para deducir su edad, heredado de Empleado
     * @param sueldo Cuanto le pagan al junior, heredado de Empleado
     * @param rfc El rfc del junior, nativo de esta clase
     */
    public JrEngineer(String nombre, String apellido, String fechanacimiento, int sueldo, String rfc){
        super();
    }

    /**
     * El Constructor default de un objeto junior
     */
    public JrEngineer(){

    }

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

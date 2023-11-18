package edu.mateomj.reto10.classes;

import java.util.Objects;

/**
 * La clase abstracta base de empleado cuál se encarga de poner el metodo de trabajar para ser heredado
 * Todas las otras clases heredan fundamentos de esta clase
 */
public abstract class Empleado implements Comparable<Empleado>
{

    public String nombre;
    public String apellido;
    public String fechanacimiento;
    public int sueldo;

    /**
     * el metodo ToString permite asignar un valor a retornar de los atributos nativos de la clase
     * @return regresa los atributos nativos de esta clase
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechanacimiento='" + fechanacimiento + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    /**
     *
     * Se encarga de regresar true si el valor no es null permitiendo operaciones
     * @return
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        Empleado empleado = (Empleado) o;
        return getfechanacimiento() == empleado.getfechanacimiento() && Objects.equals(getnombre(), empleado.getnombre());
    }

    /**
     * Todos estos metodos de set y get permiten la asignacion de valores y la recaudacion de estos
     */
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public void setapellido(String apellido){
        this.apellido = apellido;
    }
    public String getfechanacimiento(){
        return fechanacimiento;
    }
    public void setfechanacimiento(){
        this.fechanacimiento = fechanacimiento;
    }
    public int getsueldo(){
        return sueldo = sueldo;
    }
    public void setsueldo(int sueldo){
        this.sueldo = sueldo;
    }
    public Empleado(String nombre, String apellido, String fechanacimiento, int sueldo){

    }
    public Empleado(){

    }
    /**
     * El metodo abstracto de trabajar para ser heredado por todos los roles que forman el diagrama
     */
    public abstract void trabajar();
}

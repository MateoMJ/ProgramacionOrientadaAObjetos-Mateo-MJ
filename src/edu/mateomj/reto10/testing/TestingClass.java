package edu.mateomj.reto10.testing;
import edu.mateomj.reto10.classes.Engineers.JrEngineer;
import edu.mateomj.reto10.classes.Engineers.SnrEngineer;
import edu.mateomj.reto10.classes.Administracion.Ceo;
import edu.mateomj.reto10.classes.Administracion.Manager;
import edu.mateomj.reto10.classes.other.RecursosHuman;

import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;


/**
 * La Clase TestingClass se encarga de lo que es demostrar el funcionamiento de los retos 10 a 12
 */
public class TestingClass
{
    /**
     * Este es el metodo en donde se encuentran los contenidos de cada reto
     */
    public static void pruebas()
    {
        //Aquí comienzan los contenidos del reto 10
        System.out.println("----------------Contenidos Reto 10----------------");
        JrEngineer Junior1 = new JrEngineer();
        SnrEngineer Senior1 = new SnrEngineer();
        Manager Manager1 = new Manager();
        Ceo Ceo1 = new Ceo();
        RecursosHuman HR1 = new RecursosHuman();

        testprogramador(Junior1,Senior1);
        testempleado(Junior1,Senior1,Manager1,Ceo1,HR1);
        testinterview(Senior1,Manager1,HR1);

        //Aquí comienzan los contenidos del reto 11
        System.out.println("----------------Contenidos Reto 11----------------");
        System.out.println("Juniors Almacenados en un array e impresos");
        ArrayList<String> listajuniors = new ArrayList<>();

        Path path = Paths.get("src/edu/mateomj/reto10/listaEngineers");
        try {
            List<String> lineasDelArchivo = Files.readAllLines(path);
            listajuniors.addAll(lineasDelArchivo);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(listajuniors);

        System.out.println("Juniors mayores a 20");
        imprimirmayora20(listajuniors);

        //Aquí comienzan los contenidos del reto 12
        System.out.println("----------------Contenidos Reto 12----------------");
        //Codigo para extraer y guardar los juniors en una lista, ya esta en el apartado de reto 11, No veo motivo para colocarlo dos veces
        //ArrayList<String> listajuniors = new ArrayList<>();
        //Path path = Paths.get("src/edu/mateomj/reto10/listaEngineers");
        //try {
        //    List<String> lineasDelArchivo = Files.readAllLines(path);
        //    listajuniors.addAll(lineasDelArchivo);
        //}catch (IOException e){
        //    e.printStackTrace();
       // }

        System.out.println("Juniors que tienen entre 20 y 25");
        imprimir20entre25(listajuniors);

        System.out.println("Los primeros 10 juniors de la lista ordenados alfabéticamente");
        Collections.sort(listajuniors);
        listajuniors.stream()
                .limit(10)
                .forEach(System.out::println);

        System.out.print("El promedio de la edad de los juniors: ");
        imprimirEdadPromedio(listajuniors);

        System.out.println("El ultimo empleado de la lista basado en el ordenamiento de edad seguido por nombre");
        imprimirUltimoEmpleado(listajuniors);


    }

    /**
     * testprogramador se encarga de demostrar el funcionamiento del polimorfismo con el metodo de programar
     * @param Junior1 El objeto de un programador Junior con el metodo de programar
     * @param Senior1 El objeto existente de un programador senior que hereda de Junior e Interviewer
     */
    public static void testprogramador(JrEngineer Junior1, SnrEngineer Senior1)
    {
        System.out.println("Asi Programa cada rol");
        Junior1.programar();
        Senior1.programar();
    }

    /**
     * En testempleado se demuestra el funcionamiento del polimorfismo con el metodo de trabajar cual todos los roles
     * tienen debido a que fue heredado de empleado
     * @param Junior1 El objeto existente de un programador Junior con el metodo de programar
     * @param Senior1 El objeto existente de un programador senior que hereda de Junior e Interviewer
     * @param Manager1 El objeto existente de un manager con el metodo de administrar que hereda de interviewer
     * @param Ceo1 El objeto existente de un ceo que hereda de manager
     * @param HR1 El objeto existente de recursos humanos que hereda de interviewer
     */
    public static void testempleado(JrEngineer Junior1, SnrEngineer Senior1,Manager Manager1, Ceo Ceo1, RecursosHuman HR1)
    {
        System.out.println("Asi trabaja cada rol");
        Junior1.trabajar();
        Senior1.trabajar();
        Manager1.trabajar();
        Ceo1.trabajar();
        HR1.trabajar();
    }

    /**
     * testinterview se encarga de demostrar el polimorfismo con el metodo de entrevistar
     * @param Senior1 El objeto existente de un programador senior que hereda de Junior e Interviewer
     * @param Manager1 El objeto existente de un manager con el metodo de administrar que hereda de interviewer
     * @param HR1 El objeto existente de recursos humanos que hereda de interviewer
     */
    public static void testinterview(SnrEngineer Senior1,Manager Manager1, RecursosHuman HR1)
    {
        System.out.println("Asi entrevista cada rol");
        Manager1.entrevistar();
        Senior1.entrevistar();
        HR1.entrevistar();
    }

    /**
     * Este metodo se encarga de imprimir los juniors que sean mayor a 20
     * @param jrmayora20 El nuevo array que obtiene lo que contiene el array de listajuniors con todos los juniors del archivo
     *
     */
    public static void imprimirmayora20(ArrayList<String> jrmayora20 ){
        for (String empleado : jrmayora20 ) {
            String[] splitter = empleado.split(";");
            int edad = Integer.parseInt(splitter[2]);
            if (edad > 20) {
                System.out.println(empleado);
            }
        }
    }

    /**
     * Este metodo se encarga de imprimir los juniors que tengan entre 20 y 25
     * @param jrentre20y25 la lista que existe en este metodo con los contenidos de la lista listajuniors
     */
    public static void imprimir20entre25(ArrayList<String> jrentre20y25 ){
        for (String empleado : jrentre20y25 ) {
            String[] splitter = empleado.split(";");
            int edad = Integer.parseInt(splitter[2]);
            if (edad >= 20 && edad <= 25) {
                System.out.println(empleado);
            }
        }
    }

    /**
     * este metodo imprime la edad promedio de los juniors
     * @param lista la lista que existe en este metodo con los contenidos de la lista listajuniors
     */
    public static void imprimirEdadPromedio(ArrayList<String> lista){
        double Promedio = lista.stream()
                .mapToInt(string -> Integer.parseInt(string.split(";")[2]))
                .average()
                .orElse(0.0);
        System.out.println(Promedio);
    }

    /**
     * Este metodo se encarga de imprimir el ultimo junior de la lista basado en el critero de ordenamiento de primero la edad y luego elnombre
     * @param lista la lista que existe en este metodo con los contenidos de la lista listajuniors
     */
    public static void imprimirUltimoEmpleado(ArrayList<String> lista){
        String ultimoEmpleado = lista.stream()
                .sorted(Comparator.comparingInt((String edad) -> Integer.parseInt(edad.split(";")[2]))
                        .thenComparing(string -> string.split(";")[1])
                )
                .reduce((first, second) -> second)
                .orElse(null);
        System.out.println(ultimoEmpleado);
    }



}

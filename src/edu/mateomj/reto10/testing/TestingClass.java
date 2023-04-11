package edu.mateomj.reto10.testing;
import edu.mateomj.reto10.classes.Engineers.JrEngineer;
import edu.mateomj.reto10.classes.Engineers.SnrEngineer;
import edu.mateomj.reto10.classes.Administracion.Ceo;
import edu.mateomj.reto10.classes.Administracion.Manager;
import edu.mateomj.reto10.classes.other.RecursosHuman;

/**
 * La Clase TestingClass se encarga de lo que es demostrar el funcionamiento del polimforsimo
 */
public class TestingClass
{
    /**
     * Pruebas crea los objetos de cada rol del diagrama
     */
    public static void pruebas()
    {
        JrEngineer Junior1 = new JrEngineer();
        SnrEngineer Senior1 = new SnrEngineer();
        Manager Manager1 = new Manager();
        Ceo Ceo1 = new Ceo();
        RecursosHuman HR1 = new RecursosHuman();

        testprogramador(Junior1,Senior1);
        testempleado(Junior1,Senior1,Manager1,Ceo1,HR1);
        testinterview(Senior1,Manager1,HR1);

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

}

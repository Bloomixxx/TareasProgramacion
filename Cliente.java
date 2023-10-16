import java.util.*;

public class Cliente {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("************PERSONA**********");
        System.out.println("NOMBRE:");
        String nombre = leer.next();

        System.out.println("RESIDENCIA:");
        String residencia = leer.next();
        System.out.println("************DATOS DE LA PERSONA**********");

        Persona p = new Persona(nombre, residencia);
        //OVERRIDING
        p.imprimePersona();

        System.out.println("************ESTUDIANTE**********");
        System.out.println("NOMBRE:");
        nombre = leer.next();

        System.out.println("RESIDENCIA:");
        residencia = leer.next();

        System.out.println("FACULTAD:");
        String facultad = leer.next();

        System.out.println("PAGO INSCRIPCION:");
        float pago = leer.nextFloat();

        System.out.println("************DATOS DEL ESTUDIANTE**********");
            //Polimorfismo -  OVERRIDING 
        Estudiante e= new Estudiante(nombre, residencia, facultad, pago);
        e.imprimePersona();


        System.out.println("************CATEDRATICO**********");
        System.out.println("NOMBRE:");
        nombre = leer.next();

        System.out.println("RESIDENCIA:");
        residencia = leer.next();

        System.out.println("FACULTAD:");
        facultad = leer.next();

        System.out.println("SALARIO:");
        float salario = leer.nextFloat();

        System.out.println("************DATOS DEL CATEDRATICO**********");

        Catedratico c = new Catedratico(nombre, residencia, facultad, salario);
       // POLIMORFISMO - OVERRIDING
        c.imprimePersona();
        

    }
}
 
import java.util.Scanner;
public class Cliente{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Escribe titulo (Libro 1):");
        String titulo = leer.next();

        System.out.println("Escribe autor(es) (Libro 1):");
        String autores = leer.next();

        Libro libro = new Libro(titulo, autores);

        //Libro libro2 = new Libro(titulo, autor, precio);

            System.out.println("Escribe titulo 2:");
            titulo = leer.next();

            System.out.println("Escribe autor(es) 2:");
            autores = leer.next();

            Libro libro2 = new Libro(titulo, autores);

            System.out.println("---------------------------------------");
            System.out.println("DATOS DEL PRIMER LIBRO: ");
            libro.imprimeLibro();
            System.out.println("---------------------------------------");
            System.out.println("DATOS DEL SEGUNDO LIBRO: ");
            libro2.imprimeLibro();
            System.out.println("---------------------------------------");

            
            
            System.out.println("Inserta precio (libro 1):");
            double precio = leer.nextDouble();
            libro.setPrecio(precio);
            System.out.println("---------------------------------------");
            System.out.println("DATOS ACTUALIZADOS PRIMER LIBRO: ");
            libro.imprimePrecioLibro();
            System.out.println("---------------------------------------");
            
            leer.close();


        }
    }

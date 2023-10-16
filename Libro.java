import javax.swing.JOptionPane;
public class Libro {
    private String titulo;
    private String autores;
    private double precio;
    
    public static void main (String[] args) {
    }
    
     public Libro(String titulo, String autores) {
        this.titulo = titulo;
        this.autores = autores;
     
    }

    public void imprimeLibro() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor(es): " + this.getAutores()); 
    }

    public void imprimePrecioLibro() {
        imprimeLibro();
        System.out.println("Precio: " + this.getPrecio());
    }

    public void ventanaLibro(){
        JOptionPane.showMessageDialog(null,"Titulo: "+ this.getTitulo() +", Autor: "+ this.getAutores() +", Precio: "+ this.getPrecio());
    }
   
    public String getTitulo() {
        return titulo;
    }
    public String getAutores() {
        return autores;
    }
   public double getPrecio() {
        return precio;
   }
    public void setPrecio(double nuevo_precio) {
        this.precio = nuevo_precio;
    }
}


public class Mamifero {
    
    // Propiedad manipulada por encapsulamiento
    private String nombre;
    
    // Constructor
    public Mamifero(String nombre){
        this.nombre = nombre;
        System.out.println("Ha creado un mamífero llamado " + nombre);
    }
    
    // Método para todos los mamíferos
    public void amamantar() {
        System.out.println("Tomo leche proveniente de mi madre");
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
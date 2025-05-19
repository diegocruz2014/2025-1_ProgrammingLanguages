public class Mamifero {
    
    // Propiedad manipulada por encapsulamiento
    private String nombre;
    
    // Constructor
    public Mamifero(String nombre){
        this.nombre = nombre;
    }
    // Constructor por sobrecarga de métodos (Polimorfismo)
    public Mamifero() {
        this.nombre = "Por definir";
    }
    
    // Método para todos los mamíferos
    public String expresarse() {
        return "Por definir";
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
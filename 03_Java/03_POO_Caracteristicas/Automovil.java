// Abstracción (capacidad de crear una clase con propiedades y métodos)
public class Automovil {
    // Encapsulamiento (con los parámetros de acceso private y static se 
    // modificarán las propiedades con métodos propios de la clase)
    // Atributos
    private static String marca, modelo, color;
    private static short cilindraje;
    
    // Constructor: Método que crea una instancia de la clase al interior del
    //              ambiente en el que se presente.
    // Polimorfismo (hacer que un mismo método ejecute tareas diferentes), en
    // este caso a través de la sobrecarga de métodos.
    public Automovil(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    public Automovil(String modelo, String color){
        this.marca = "Mercedes";
        this.modelo = modelo;
        this.color = color;
    }
    
    public Automovil(short cilindraje){
        this.marca = "Por definir";
        this.modelo = "Por definir";
        this.color = "Por definir";
        this.cilindraje = cilindraje;
    }
    
    // Getter y Setter
    public static String getMarca() {
        return marca;
    }
    
    public static void setMarca(String marca) {
        Automovil.marca = marca;
    }
    
    public static String getModelo() {
        return modelo;
    }
    
    public static void setModelo(String modelo) {
        Automovil.modelo = modelo;
    }
    
    public static String getColor() {
        return color;
    }
    
    public static void setColor(String color) {
        Automovil.color = color;
    }
    
    public static short getCilindraje() {
        return cilindraje;
    }
    
    public static void setCilindraje(short cilindraje) {
        Automovil.cilindraje = cilindraje;
    }
}
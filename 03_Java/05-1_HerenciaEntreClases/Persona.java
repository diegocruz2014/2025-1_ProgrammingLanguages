// Herencia entre clases 
public class Persona extends Mamifero { // Persona hereda de Mamifero
    
    // Propiedades de la clase Persona
    private String fechaNacimiento, tipoId, sexoBiologico;
    private int numId;
    
    // Constructor
    public Persona(String nombre, String tipoId, int numId){
        // Creación del parámetro "nombre" propio de la clase
        // Mamifero haciendo uso del constructor de la clase Mamifero
        super(nombre);  
        this.tipoId = tipoId;
        this.numId = numId;
    }
    
    // Getters y Setters
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(int day, int month, int year) {
        this.fechaNacimiento = day + " de " + setMes(month) + " de " + year;
    }
    
    public String getTipoId() {
        return tipoId;
    }
    public void setTipoId(String tipoId){
        this.tipoId = tipoId;
    }
    
    public String getSexoBiologico() {
        return sexoBiologico;
    }
    public void setSexoBiologico(char sexo) {
        if (sexo == 'm' || sexo == 'M') this.sexoBiologico = "Masculino";
        else if (sexo == 'f' || sexo == 'F') this.sexoBiologico = "Femenino";
        else this.sexoBiologico = "Sexo biológico definido incorrectamente";
    }
    
    public int getNumId() {
        return numId;
    }
    public void setNumId(int numId) {
        this.numId = numId;
    }
    
    // Método privado
    private String setMes(int numMes) {
        String mes;
        switch (numMes){
            case 1:
                mes = "enero";
                break;
            case 2:
                mes = "febrero";
                break;
            case 3:
                mes = "marzo";
                break;
            case 4:
                mes = "abril";
                break;
            case 5:
                mes = "mayo";
                break;
            case 6:
                mes = "junio";
                break;
            case 7:
                mes = "julio";
                break;
            case 8:
                mes = "agosto";
                break;
            case 9:
                mes = "septiembre";
                break;
            case 10:
                mes = "octubre";
                break;
            case 11:
                mes = "noviembre";
                break;
            case 12:
                mes = "diciembre";
                break;
            default:
                mes = "Error: mes incorrecto";
        }
        return mes;
    }
    
    // Sobreescritura de métodos
    @Override
    public String expresarse() {
        return "¡Hola!";
    }
    
}
public class TiposPrimitivos
{
	public static void main(String[] args) {
	    
	    // Tipo booleano
	    boolean b;
	    b = !(3 - 2 == 1) || false;
	    System.out.println("\nTipo: boolean");
	    System.out.println("Valor booleano: " + b);
	    
	    // Tipo carácter
	    char letra = '\u266B';
        System.out.println("\n" + letra);
        System.out.println("Tipo: char");
        System.out.println("Tamaño en bits: " + Character.SIZE);
        System.out.println("Tamaño en bytes: " + Character.BYTES);
	    
	    // Tipo cadena de caracteres (no es un tipo primitivo)
	    //String cadena = "Este es un conjunto de caracteres."; // Declaración como tipo primitivo.
	    String cadena = new String(); // Estilo de Programación Orientada a Objetos (POO).
	    cadena = "Este es el símbolo de pi: \u03C0";
	    System.out.println("\n" + cadena);
	    System.out.println("Tipo: String");
	    
	    // Tipos primitivos enteros
	    
	    // byte
	    byte n1 = 23;
	    System.out.println("\n" + n1);
	    System.out.println("Tipo: byte");
	    System.out.println("Tamaño en bits: " + Byte.SIZE);
	    System.out.println("Tamaño en bytes: " + Byte.BYTES);
	    System.out.println("Valor mínimo: " + Byte.MIN_VALUE);
	    System.out.println("Valor máximo: " + Byte.MAX_VALUE);
	    
	    
	}
}

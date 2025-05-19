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
	    byte n1 = 127;
	    System.out.println("\n" + n1);
	    System.out.println("Tipo: byte");
	    System.out.println("Tamaño en bits: " + Byte.SIZE);
	    System.out.println("Tamaño en bytes: " + Byte.BYTES);
	    System.out.println("Valor mínimo: " + Byte.MIN_VALUE);
	    System.out.println("Valor máximo: " + Byte.MAX_VALUE);
	    
	    // short
	    short n2 = 32767;
	    System.out.println("\n" + n2);
	    System.out.println("Tipo: short");
	    System.out.println("Tamaño en bits: " + Short.SIZE);
	    System.out.println("Tamaño en bytes: " + Short.BYTES);
	    System.out.println("Valor mínimo: " + Short.MIN_VALUE);
	    System.out.println("Valor máximo: " + Short.MAX_VALUE);
	    
	    // int
	    int n3 = 2147483647;
	    System.out.println("\n" + n3);
	    System.out.println("Tipo: int");
	    System.out.println("Tamaño en bits: " + Integer.SIZE);
	    System.out.println("Tamaño en bytes: " + Integer.BYTES);
	    System.out.println("Valor mínimo: " + Integer.MIN_VALUE);
	    System.out.println("Valor máximo: " + Integer.MAX_VALUE);
	    
	    // long
	    long n4 = 9223372036854775807L;
	    System.out.println("\n" + n4);
	    System.out.println("Tipo: long");
	    System.out.println("Tamaño en bits: " + Long.SIZE);
	    System.out.println("Tamaño en bytes: " + Long.BYTES);
	    System.out.println("Valor mínimo: " + Long.MIN_VALUE);
	    System.out.println("Valor máximo: " + Long.MAX_VALUE);
	    
	    // Tipos primitivos reales
	    
	    // float (floating point)
	    float n5 = 3.4028235E38F;
	    System.out.println("\n" + n5);
	    System.out.println("Tipo: float");
	    System.out.println("Tamaño en bits: " + Float.SIZE);
	    System.out.println("Tamaño en bytes: " + Float.BYTES);
	    System.out.println("Valor mínimo: " + Float.MIN_VALUE);
	    System.out.println("Valor máximo: " + Float.MAX_VALUE);
	    
	    // En cuanto a la precisión de los números reales
	    System.out.println(0.15 + 0.15 == 0.1 + 0.2);
	    
	    // double
	    double n6 = 1.7976931348623157E308;
	    System.out.println("\n" + n6);
	    System.out.println("Tipo: double");
	    System.out.println("Tamaño en bits: " + Double.SIZE);
	    System.out.println("Tamaño en bytes: " + Double.BYTES);
	    System.out.println("Valor mínimo: " + Double.MIN_VALUE);
	    System.out.println("Valor máximo: " + Double.MAX_VALUE);
	    
	    // var: Tipo de dato genérico en Java
	    var n7 = 2025;
	    System.out.println("\n" + n7);
	    System.out.println("Variable tipo var");
	    System.out.println("Tipo de dato: " + ((Object) n7).getClass().getName());
	}
}

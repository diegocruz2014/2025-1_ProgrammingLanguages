public class Main
{
	public static void main(String[] args) {
		// Crear instancias de las clases Gato y Perro.
		Gato lucio = new Gato("Lucio");
		Perro renato = new Perro("Renato");
		
		// Realizar acciones con las instancias creadas.
		System.out.println("\nNombre del animal: " + lucio.getNombre()); // Método heredado de la clase Mamifero
		lucio.expresarse(); // Método heredado de la clase Animal
		lucio.alimentarse("hogareño"); // Método heredado de la clase Animal
		lucio.amamantar(); // Método heredado de la clase Mamifero
		System.out.println(lucio.recorridoEnMetrosPorSegundo()); // Método heredado de la clase Animal
	
	    System.out.println("\nNombre del animal: " + renato.getNombre()); // Método heredado de la clase Mamifero
		renato.expresarse(); // Método heredado de la clase Animal
		renato.alimentarse("callejero"); // Método heredado de la clase Animal
		renato.amamantar(); // Método heredado de la clase Mamifero
		System.out.println(renato.recorridoEnMetrosPorSegundo()); // Método heredado de la clase Animal
	}
}

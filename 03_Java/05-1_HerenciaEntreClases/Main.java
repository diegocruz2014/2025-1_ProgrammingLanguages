public class Main
{
	public static void main(String[] args) {
		// Crear una instancia de la clase Persona.
		Persona juan = new Persona("Juan", "CC", 123456789);
		juan.setFechaNacimiento(28,14,2000);
		juan.setSexoBiologico('m');
		// Realizar acciones con la instancia de la clase Persona.
		System.out.println("Usuario: " + juan.getNombre()); // Método heredado de la clase Mamifero
		System.out.println("Saludo: " + juan.expresarse()); // Método heredado de la clase Mamifero y sobreescrito en la clase Persona
		System.out.println("Fecha de nacimiento: " + juan.getFechaNacimiento());
		System.out.println("Sexo biológico: " + juan.getSexoBiologico());
		System.out.println("Tipo de documento: " + juan.getTipoId());
		System.out.println("Número de documento: " + juan.getNumId());
	}
}

package ejercicios;

public class DNI {
	private static final int NUMERO_DIVISOR = 23;
	private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

	public static void main(String[] args) {
		int numeros = 12345678;
		mostrarLetraDNI(numeros);
	}

	private static void mostrarLetraDNI(int numero) {
		char letraDNI = obtenerLetra(numero);
		System.out.println("La letra del DNI es " + letraDNI);
	}

	private static char obtenerLetra(int numeros) {
		char letraDNI = LETRAS.charAt(numeros % NUMERO_DIVISOR);
		return letraDNI;
	}
}

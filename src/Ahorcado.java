
import java.util.Scanner;

public class Ahorcado {

	// M�todo que comprueba que la partida se ha terminado
	// O pierdo las vidas o gano la partida
	public static boolean partidaTerminada() {
		boolean terminado = false;

		return terminado;
	}

	public static void inicializarVectores(String vHuecos[], String vSolucion[], String palabra) {
		for (int i = 0; i < vSolucion.length; i++) {
			vHuecos[i] = "_";
			vSolucion[i] = palabra.substring(i, i + 1);
			// Compruebo que todo este bien
			// System.out.print(vHuecos[i] + " ");
			// System.out.print(vSolucion[i] + " ");
		}
	}

	public static void pintaMu�eco(String vFallos[],String vHuecos[]) {
		int fallos = 0;

		// Calculo cuantos fallos llevo
		for (int i = 0; i < vFallos.length; i++) {
			if (vFallos[i]!=null) {
				fallos++;
			}
		}
			
		// Pinto mu�eco
		switch (fallos) {
		case 1:
			System.out.println("______________");
			System.out.println("||           |");
			System.out.println("||           |");
			System.out.println("||         (x_x)");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||____________________");
			System.out.println("|_____________________");
			break;
			
		case 2:
			System.out.println("______________");
			System.out.println("||           |");
			System.out.println("||           |");
			System.out.println("||         (x_x)");
			System.out.println("||           |");
			System.out.println("||           |");
			System.out.println("||           |");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||____________________");
			System.out.println("|_____________________");
			break;
			
		case 3:
			System.out.println("______________");
			System.out.println("||           |");
			System.out.println("||           |");
			System.out.println("||         (x_x)");
			System.out.println("||           |");
			System.out.println("||         //|");
			System.out.println("||           |");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||____________________");
			System.out.println("|_____________________");

			break;
			
		case 4:
			System.out.println("______________");
			System.out.println("||           |");
			System.out.println("||           |");
			System.out.println("||         (x_x)");
			System.out.println("||           |");
			System.out.println("||         //|\\");
			System.out.println("||           |");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||____________________");
			System.out.println("|_____________________");
			break;
			
		case 5:
			System.out.println("______________");
			System.out.println("||           |");
			System.out.println("||           |");
			System.out.println("||         (x_x)");
			System.out.println("||           |");
			System.out.println("||         //|\\");
			System.out.println("||           |");
			System.out.println("||         //");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||____________________");
			System.out.println("|_____________________");
			break;
			
		case 6:
			System.out.println("______________");
			System.out.println("||           |");
			System.out.println("||           |");
			System.out.println("||         (x_x)");
			System.out.println("||           |");
			System.out.println("||         //|\\");
			System.out.println("||           |");
			System.out.println("||         // \\");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||");
			System.out.println("||____________________");
			System.out.println("|_____________________");
			break;
		}
		
		System.out.println();
		System.out.println();
		for (int i = 0; i < vHuecos.length; i++) {
			System.out.print(vHuecos[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Fallos:");
		for (int i = 0; i < vFallos.length; i++) {
			if (vFallos[i]!=null)
				System.out.print(vFallos[i] + " ");
		}
		
	}
	
	//Pregunta la letra y actualiza los vectores
	//Si se encuentra actualiza vHuecos
	//Si fallo actualiza vFallos
	public static void preguntarLetra(String vHuecos[], String vSolucion[], String vFallos[]) {
		Scanner leer = new Scanner(System.in);
		String letra ="";
		System.out.println("Dime una letra");
		letra = leer.nextLine();
		
		for(int i=0;i<vSolucion.length;i++) {
			if() {
				
			}
		}
		
	}

	public static void main(String[] args) {
		String palabraSolucion = "HOLA";
		String vFallos[], vSolucion[], vHuecos[];
		Scanner leer = new Scanner(System.in);

		// Tama�o 6 porque son 6 vidas m�ximo
		vFallos = new String[6];
		vHuecos = new String[palabraSolucion.length()];
		vSolucion = new String[palabraSolucion.length()];
		inicializarVectores(vHuecos, vSolucion, palabraSolucion);

		do {
			pintaMu�eco(vFallos,vHuecos);
			preguntarLetra(vHuecos, vSolucion, vFallos);
		} while (partidaTerminada());

	}

}

import java.util.Scanner;

public class Ahorcado {

	// Método que comprueba que la partida se ha terminado
	// O pierdo las vidas o gano la partida
	public static boolean ganarPartida(String vHuecos[]) {
		boolean terminado = true;
		
		for(int i=0;i<vHuecos.length;i++) {
			if(vHuecos[i].equals("_")) {
				terminado = false;
				break;
			}
		}
		
		
		if(terminado) {
			System.out.println("Has ganado");
		}
		return terminado;
	}
	
	public static boolean perderPartida(String vFallos[]) {
		boolean terminado = true;
		
		for(int i=0;i<vFallos.length;i++) {
			if(vFallos[i]==null) {
			terminado = false;
			break;
		}
		}
		if(terminado) {
			System.out.println("Has perdido");
		}
		
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

	public static void pintaMuñeco(String vFallos[],String vHuecos[]) {
		int fallos = 0;

		// Calculo cuantos fallos llevo
		for (int i = 0; i < vFallos.length; i++) {
			if (vFallos[i]!=null) {
				fallos++;
			}
		}
			
		// Pinto muñeco
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
			boolean encontrado = false;
			
			for(int i=0;i<vSolucion.length;i++) {
				if(letra.equalsIgnoreCase(vSolucion[i])) {
					vHuecos[i] = letra;
					encontrado = true;
				}
			}
			if(!encontrado) {
				for (int i = 0; i < vFallos.length; i++) {
					if(vFallos[i]!=null) {
						vFallos[i] = letra;
						break;
					}
				}
			}
		
	}

	public static void main(String[] args) {
		String palabraSolucion = "HOLA";
		String vFallos[], vSolucion[], vHuecos[];
		Scanner leer = new Scanner(System.in);

		// Tamaño 6 porque son 6 vidas máximo
		vFallos = new String[6];
		vHuecos = new String[palabraSolucion.length()];
		vSolucion = new String[palabraSolucion.length()];
		
		System.out.println("* * * * * * * * * *");
		System.out.println("JUEGO DEL AHORCADO");
		System.out.println("* * * * * * * * * *");

		inicializarVectores(vHuecos, vSolucion, palabraSolucion);

		do {
			preguntarLetra(vHuecos, vSolucion, vFallos);
			pintaMuñeco(vFallos,vHuecos);
		} while (!ganarPartida(vHuecos) && !perderPartida(vFallos));

	}

}
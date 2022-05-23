package loops;

import java.util.Scanner;

public class MediaMaior {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero;
		int aux = 0;
		int maior = 0;
		int media = 0;

		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			if(numero > maior) {
				maior = numero;
			}
			aux = aux + 1;
			
			media += numero;
			media = media/aux;

		} while (aux < 5);
		
		System.out.println("O numero maior foi: " + maior);
		System.out.println("A média é: "+ media);
	}
}

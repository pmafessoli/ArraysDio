package arrays;

import java.util.Random;

public class NumeroAleatorios {

	public static void main(String[] args) {

		Random random = new Random();
		
		int[] numeroAleatorios = new int[20];
		
		for(int i = 0; i < numeroAleatorios.length; i++) {
		int numero = random.nextInt(100);
		numeroAleatorios[i] = numero;
			
		}
		
		System.out.println("Numero aleatótios");
		for (int numero : numeroAleatorios) {
			System.out.print(numero + " ");
		}
		System.out.println("\nSucessores dos numeros aleatórios");
		for (int numero : numeroAleatorios) {
			System.out.print(numero+1 + " ");
		}
		
	}
}
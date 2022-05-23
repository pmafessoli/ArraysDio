package arrays;

import java.util.Scanner;

public class Consoantes {
	public static void main(String[] args) {
			
		Scanner scan =  new Scanner(System.in);
		
		String[] consoantes = new String[6];
		int consoantesLidas = 0;
		int count = 0;
		
		
		do {
			
			System.out.println("Digete uma letra: ");
			String letra = scan.next();
				
			if(!(letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e") |
					letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") |
					letra.equalsIgnoreCase("u")) ){
				consoantes[count] = letra;
				consoantesLidas++;
			}
			count++;
			
		} while (count < consoantes.length);
		System.out.println("Consoantes: ");
		for (String consoante : consoantes) {
			if(consoante != null) {
			System.out.print(consoante + " ");
			}
		}
		
	}
}

package loops;

import java.util.Iterator;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int tabuada;
		System.out.println("Informe a tabuada: ");
		tabuada = scan.nextInt();
		
		System.out.println("Tabuada de: " + tabuada);
		
		for (int i = 1; i <=10; i++) {
			
			System.err.println(tabuada + " X "+ i + " = " + (tabuada * i));
		}
	}

}

package loops;

import java.util.Scanner;



public class Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int multiplicacao = 1;
		System.out.println("Informe o fatorial: ");
		int fatorial = scan.nextInt();

		System.out.println(fatorial + "!= ");

		for (int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao * i;
		}
		
		System.out.println(multiplicacao);
	}
}

package loops;

import java.util.Scanner;

public class Nota {
		public static void main(String[] args) {
			
			Scanner scan =  new Scanner(System.in);
			int nota;
			System.out.println("Informe a nota:");
			nota = scan.nextInt();
			if(nota >= 0 && nota <= 10) {
				System.out.println("A nota informada foi: " + nota);
			
			}else {
				System.out.println("A nota deve ser de 0 a 10");
			}
			
		}
}

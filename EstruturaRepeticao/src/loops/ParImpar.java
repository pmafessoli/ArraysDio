package loops;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qtdNumero = 0;
		int aux = 0;
		int par = 0;
		int impar = 0;
		int numero;
	
		System.out.println("Quantidade de numeros: ");
		qtdNumero = scan.nextInt();
	
		do {
			
			System.out.println("Informe um número: ");
			numero = scan.nextInt();
			aux  = aux +1;
			
			if(numero % 2 == 0) {
				par ++;
			}else {
				impar ++;
			}
			
		} while (aux < qtdNumero);
		
		System.out.println("O total dos número pares foi de: " + par);
		System.out.println("O total dos número impares foi de: " + impar);
		}
	}


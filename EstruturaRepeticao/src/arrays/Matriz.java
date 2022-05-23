package arrays;

import java.util.Iterator;
import java.util.Random;

public class Matriz {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] m = new int[4][4];
		
		for (int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = random.nextInt(9);
			}
				System.out.println("Matriz: ");
			for (int[] matriz : m) {
				for(int coluna: matriz) {
					System.out.println(coluna + " ");
				}
			}
		}
	}
}

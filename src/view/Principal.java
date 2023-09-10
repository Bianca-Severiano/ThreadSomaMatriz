package view;

import controller.ThreadSoma;

public class Principal {

	public static void main(String[] args) {
		int matriz[][] = new int[3][5];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 10);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < matriz.length; i++) {
			Thread t = new ThreadSoma(matriz[i]);
			t.start();
		}

	}

}

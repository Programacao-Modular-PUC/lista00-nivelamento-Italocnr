package atividade04;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, m;
		int k = 0; 

		System.out.print("Digite o valor de n para preenchimento do vetor X: ");
		n = sc.nextInt();

		System.out.print("Digite o valor de m para preenchimento do vetor Y: ");
		m = sc.nextInt();

		int[] x = new int[n];
		int[] y = new int[m];

		System.out.println("PREENCHIMENTO DOS VETORES");

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o %d numero do vetor X: ", i + 1);
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			System.out.printf("Digite o %d numero do vetor Y: ", i + 1);
			y[i] = sc.nextInt();
		}

		int[] z = new int[n];

		for (int i = 0; i < n; i++) {

			boolean existeEmY = false;

			for (int j = 0; j < m; j++) {
				if (x[i] == y[j]) {
					existeEmY = true;
					break;
				}
			}

			if (existeEmY) {

				boolean jaExisteEmZ = false;

				for (int t = 0; t < k; t++) {
					if (x[i] == z[t]) {
						jaExisteEmZ = true;
						break;
					}
				}

				if (!jaExisteEmZ) {
					z[k] = x[i];
					k++;
				}
			}
		}

		System.out.println("Intersecao:");
		for (int i = 0; i < k; i++) {
			System.out.print(z[i] + " ");
		}

		sc.close();
	}
}
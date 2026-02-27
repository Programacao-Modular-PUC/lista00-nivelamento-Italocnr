package atividade02;

import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,z, maior=0, menor=0,cont, aux = 0;
		boolean dentro_inter, fora_inter, divisivel;
		
		System.out.println("Digite o valor de x");
		x = sc.nextInt();
		System.out.println("Digite o valor de y");
		y = sc.nextInt();
		System.out.println("Digite o valor de z");
		z = sc.nextInt();
		
		int[] vector = {x, y, z};
		
	
		for(int i=0; i < 3; i++) {
			if (i == 0) {
				maior = vector[i];
				menor = vector[i];
			}
			else if (vector[i] > maior) {
				maior = vector[i];
			}
			else if (vector[i] < menor) {
				menor = vector[i];
			}
		}
		
		
		if (vector[0] > vector[2] && vector[0] < vector[2]) {
			dentro_inter = true;
		}
		else {
			dentro_inter = false;
		}
		
		if (vector[0] % vector[1] == 0 && vector[0] % vector[2] == 0) {
			divisivel = true;
		}
		else {
			divisivel = false;
		}
		
		System.out.println("O maior numero digitado foi: " + maior);
		System.out.println("O menor numero digitado foi: " + menor);
		System.out.println("O numero x esta dentro do intervalo [y, z]? " + dentro_inter);
		System.out.println("O numero x e divisivel por y e por z? " + divisivel);
		
			
		}
	}

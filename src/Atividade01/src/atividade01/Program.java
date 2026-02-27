package atividade01;

import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, fat=1;
		
		System.out.println("Digite o valor de x");
		x = sc.nextInt();
		
		
	
		for(int i=1; i <= x; i++) {
			fat *= i;
		}
		
		System.out.println("O fatorial de " + x + " e igual a " + fat);
		
	}
}

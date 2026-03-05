package atividade09;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[6];
		int somaPares=0, contImpar=0;
		
		for(int i=0; i < 6; i++) {
			System.out.printf("Digite o %d numero:", i+1);
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Os numeros pares sao:");
		for(int i=0; i < 6; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.printf("Numero %d na posicao %d\n", numeros[i], i+1);
				somaPares += numeros[i];
			}
		}

		System.out.printf("Soma dos pares = %d\n", somaPares);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Os numeros impares sao:\n");
		for(int i=0; i < 6; i++) {
			if (numeros[i] % 2 != 0) {
				System.out.printf("Numero %d na posicao %d\n", numeros[i], i);
				contImpar++;
			}
		}
		System.out.printf("Quantidade de impares: %d", contImpar);
	}
}

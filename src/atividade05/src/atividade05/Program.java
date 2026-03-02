package atividade05;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade = 0, maiorIdade = 0, menorIdade = 0, quantFem = 0, i = 0;
		String sexo = "", corOlhos = "", corCabelo = "";

		while (true) {

			System.out.printf("\nDigite a idade do %d cidadao (-1 para encerrar): ", i + 1);
			idade = sc.nextInt();

			if (idade == -1) {
				break;
			}

			System.out.println("Sexo:");
			System.out.println("1 - Masculino");
			System.out.println("2 - Feminino");
			int opSexo = sc.nextInt();

			switch (opSexo) {
				case 1:
					sexo = "masculino";
					break;
				case 2:
					sexo = "feminino";
					break;
				default:
					sexo = "desconhecido";
			}

			System.out.println("Cor dos olhos:");
			System.out.println("1 - Azuis");
			System.out.println("2 - Verdes");
			System.out.println("3 - Castanhos");
			int opOlhos = sc.nextInt();

			switch (opOlhos) {
				case 1:
					corOlhos = "azul";
					break;
				case 2:
					corOlhos = "verde";
					break;
				case 3:
					corOlhos = "castanho";
					break;
				default:
					corOlhos = "desconhecido";
			}

			System.out.println("Cor do cabelo:");
			System.out.println("1 - Louro");
			System.out.println("2 - Castanho");
			System.out.println("3 - Preto");
			int opCabelo = sc.nextInt();

			switch (opCabelo) {
				case 1:
					corCabelo = "louro";
					break;
				case 2:
					corCabelo = "castanho";
					break;
				case 3:
					corCabelo = "preto";
					break;
				default:
					corCabelo = "desconhecido";
			}

			if (i == 0) {
				maiorIdade = idade;
				menorIdade = idade;
			}

			if (idade > maiorIdade) {
				maiorIdade = idade;
			}

			if (idade < menorIdade) {
				menorIdade = idade;
			}

			if (sexo.equals("feminino") &&
				corOlhos.equals("verde") &&
				corCabelo.equals("louro") &&
				idade >= 18 && idade <= 35) {

				quantFem++;
			}

			i++;
		}

		if (i > 0) {
			System.out.println("\nA maior idade dentre os habitantes e: " + maiorIdade);
			System.out.println("A menor idade dentre os habitantes e: " + menorIdade);
			System.out.println("Quantidade de mulheres (18 a 35, olhos verdes e cabelos louros): " + quantFem);
		} else {
			System.out.println("Nenhum habitante foi informado.");
		}

		sc.close();
	}
}
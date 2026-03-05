package atividade07;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] temperaturas = new double[12];
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro"};
		double maiorTemp =0, menorTemp =0;
		String mesMaiorTemp = null , mesMenorTemp = null;
		int numMaiorMes =0, numMenorMes=0;
		
		for(int i=0; i<12; i++) {
			System.out.printf("Digite a temperatura media do %d mes", i+1);
			temperaturas[i] = sc.nextDouble();
		}
		
		for(int i=0; i<12; i++) {
			if(i==0) {
				maiorTemp = temperaturas[i];
				menorTemp = temperaturas[i];
				mesMaiorTemp = meses[i];
				mesMenorTemp = meses[i];
				numMaiorMes = i+1;
				numMenorMes = i+1;
			}
			else if(temperaturas[i] > maiorTemp) {
				maiorTemp = temperaturas[i];
				mesMaiorTemp = meses[i];
				numMaiorMes = i+1;
				
			}
			else if(temperaturas[i] < menorTemp) {
				menorTemp = temperaturas[i];
				mesMenorTemp = meses[i];
				numMenorMes = i+1;
			}
		}
		System.out.printf("O mes que registrou a maior temperatura media foi %d - %s, com uma media de: %.2f graus \n", numMaiorMes, mesMaiorTemp, maiorTemp);
		System.out.printf("O mes que registrou a menor temperatura media foi %d - %s, com uma media de %.2f graus", numMenorMes, mesMenorTemp, menorTemp);
		
		
		sc.close();
	}
}

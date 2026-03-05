package atividade10;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[][] vendas = new double[12][4];
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Juho",
				"Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		double[] totalVendidoMes = new double[12]; double[] totalVendidoSemana = new double[4];
		double valorTotalVendido =0;
		
		System.out.println("---PREENCHIMENTO DOS VALORES DAS VENDAS---");
		for(int i=0; i < 12; i++) {
			for(int j=0; j < 4; j++) {
				System.out.printf("Digite o preço das vendas da %d semana do %d mes", j+1, i+1);
				vendas[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("---------------------------------------------------------");
		for(int i=0; i < 12; i++) {
			for(int j=0; j < 4; j++) {
				valorTotalVendido += vendas[i][j];
				totalVendidoMes[i] += vendas[i][j]; 
			}
			System.out.printf("O total vendido no mes de %s foi %.2f\n", meses[i], totalVendidoMes[i]);
		}
		System.out.println("---------------------------------------------------------");
		
		
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 12; j++) {
				totalVendidoSemana[i] += vendas[j][i];
			}
			System.out.printf("O total vendido na semana %d durando o ano foi: %.2f\n",i+1, totalVendidoSemana[i]);
		}
		
		System.out.println("---------------------------------------------------------");
		System.out.printf("O total vendido pela loja no ano foi: %.2f", valorTotalVendido);
		
		sc.close();
	}
}

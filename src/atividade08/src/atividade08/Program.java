package atividade08;

import java.util.Scanner;

public class Program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double salarioVendedor = 545.0, salarioFinalVendedor=0;
		double[] valorProdutos = new double[10];
		int[] quantItensVendidos = new int[10];
		int position= 0, maiorQuant=0;
		double valorTotalPorProduto=0, valorTotalVendas = 0, valorComissao =0, valorObjetoMaisVendido=0;
		
		for(int i=0; i < 10; i++) {
			System.out.printf("\nDigite o valor do %d produto:", i+1);
			valorProdutos[i] = sc.nextDouble();
			System.out.printf("Digite a quantidade de itens vendidos do %d produto\n", i+1);
			quantItensVendidos[i] = sc.nextInt();
			System.out.println("----------------------------------------------------------------------");
			if (i==0) {
				maiorQuant = quantItensVendidos[i];
				valorObjetoMaisVendido = valorProdutos[i];
				position = i;
			}
			else if(quantItensVendidos[i] > maiorQuant) {
				maiorQuant = quantItensVendidos[i];
				valorObjetoMaisVendido = valorProdutos[i];
				position = i;
			}
			
		}

		for(int i=0; i<10; i++) {
			valorTotalPorProduto =  quantItensVendidos[i] * valorProdutos[i];
			valorTotalVendas += quantItensVendidos[i] * valorProdutos[i];
			System.out.printf("\n A quantidade de itens vendidos do %d produto foi: %d\n", i+1, quantItensVendidos[i]);
			System.out.printf("O valor unitario do %d produto e: %.2f\n", i+1, valorProdutos[i]);
			System.out.printf("O valor total dos itens vendidos do %d produto foi: %.2f\n", i+1, valorTotalPorProduto);
			System.out.println("----------------------------------------------------------------------");
		}
		
		
		valorComissao = (valorTotalVendas * 0.05);
		salarioFinalVendedor = salarioVendedor + valorComissao;
		System.out.printf("O valor total das vendas foi: %.2f\n", valorTotalVendas);
		System.out.printf("O valor da comissão que devera ser paga ao vendedor e: %.2f\n", valorComissao);
		System.out.printf("O valor do objeto mais vendido e: %.2f e sua posicao no vetor e %d\n", valorObjetoMaisVendido, position);
		System.out.printf("Valor final a ser pago ao colaborador incluindo salario e comissao: %.2f", salarioFinalVendedor);
		
		sc.close();
	}
}

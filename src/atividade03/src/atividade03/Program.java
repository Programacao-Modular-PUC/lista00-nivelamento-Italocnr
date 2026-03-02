package atividade03;

import java.util.Scanner;

/*  Enunciado da Atividade03: 
	Intersecção de vetores - Faça um programa que leia dois vetores de ínteiros representando
	o número de matrícula de n alunos matriculados respectivamente em Programação e Modelagem.
	Em seguida, o programa deverá imprimir o número de matrícula dos alunos que estão matrículados
	simultaneamente nas duas UCs (ou seja, calcular a interseção dos dois vetores). O valor de n
	é lido pelo teclado.
 */

public class Program {
	public static void main(){
		Scanner sc = new Scanner(System.in);
		
		int n, cont = 0;
		
		System.out.println("Digite o número de alunos para prosseguir com o processo de matricula:");
		n = sc.nextInt();
		
		int[] matriculasPM = new int[n];
		int[] matriculasMD = new int[n];
		
		System.out.println("PREENCHIMENTO DE MATRICULAS DOS ALUNOS DA DISCIPLINA DE PROGRAMACAO MODULAR\n");
		for(int i=0; i < n; i++) {
			System.out.printf("Digite a matricula do %dº aluno \n", i+1);
			matriculasPM[i] = sc.nextInt();
		}
		
		System.out.println("PREENCHIMENTO DE MATRICULAS DOS ALUNOS DAS DISCIPLINAS DE MODELAGEM DE PROCESSOS DE NEGOCIOS\n");
		for(int i=0; i < n; i++) {
			System.out.printf("Digite a matricula do %dº aluno:\n", i+1);
			matriculasMD[i] = sc.nextInt();
		}
		
		System.out.println("MATRICULA DOS ALUNOS MATRICULADOS EM AMBAS UCs:");
		for(int i=0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (matriculasPM[i] == matriculasMD[j]) {
					System.out.printf("%d - %d \n", i+1, matriculasPM[i]);
					cont++;
				}
			}
		}
		if (cont == 0) {
			System.out.println("Não existe nenhum aluno matriculado em ambas UCs");
		}
	}
}

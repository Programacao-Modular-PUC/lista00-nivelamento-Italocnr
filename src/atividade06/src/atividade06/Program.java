package atividade06;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int  nota = 0, aprovados= 0;
		double pctAprovados;
		int[] numAluno = new int[3];
		int[] notaAlunos = new int[3];
		char[] gabaritoCerto = new char[8];
		char[] gabaritoAluno = new char[8];

		System.out.println("(Professor) Preencher o gabarito correto");
		for (int i = 0; i < 8; i++) {
			do {
				System.out.printf("Selecione a resposta correta da %d questao:\n", i + 1);
				System.out.println("[a] [b] [c] [d]");
				gabaritoCerto[i] = sc.next().charAt(0);
				gabaritoCerto[i] = Character.toLowerCase(gabaritoCerto[i]);
			} while (gabaritoCerto[i] != 'a' && gabaritoCerto[i] != 'b' && gabaritoCerto[i] != 'c'
					&& gabaritoCerto[i] != 'd');
		}

		System.out.println("--NOTAS DOS ALUNOS--");
		for (int i = 0; i < 3; i++) {
			System.out.printf("Digite o numero do %d aluno", i+1);
			numAluno[i] = sc.nextInt();

			for (int j = 0; j < 8; j++) {
				do {
					System.out.printf("Selecione a resposta da %d questao:\n", j + 1);
					System.out.println("[a] [b] [c] [d]");
					gabaritoAluno[j] = sc.next().charAt(0);
					gabaritoAluno[j] = Character.toLowerCase(gabaritoAluno[j]);
				} while (gabaritoAluno[j] != 'a' && gabaritoAluno[j] != 'b' && gabaritoAluno[j] != 'c'
						&& gabaritoAluno[j] != 'd');
				if (gabaritoAluno[j] == gabaritoCerto[j]) {
					nota++;
				}
			}
			if(nota >= 6) {
				aprovados++;
			}
			notaAlunos[i] = nota;
			nota = 0;
		}
		pctAprovados = (aprovados / 3.0) * 100;
		
		System.out.println("--RESULTADO--");
		for (int i=0; i < 3; i++) {
			System.out.printf("Aluno: %d Nota: %d \n", numAluno[i], notaAlunos[i]);
		}
		System.out.printf("Porcentagem de aprovados: %.2f", pctAprovados);
	}
}

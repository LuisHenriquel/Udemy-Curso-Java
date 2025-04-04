package Exercicios_Estrutura_Sequencia;

import java.util.Scanner;

public class conta_diferenca {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  A, B, C, D;
		System.out.println("Digite o Valor de A");
		A = scan.nextInt();
		System.out.println("Digite o Valor de B");
		B = scan.nextInt();
		System.out.println("Digite o Valor de C");
		C = scan.nextInt();
		System.out.println("Digite o Valor de D");
		D = scan.nextInt();
		scan.close();
		int diferencia = A *B -C*D;
		System.out.printf("A diferencia é de %d",diferencia);
		


		
		

	}

}

package Exercicios_Estruturas_Condicionais;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A;
		int B;
		System.out.println("Digite o primeiro numero");
		A = scan.nextInt();
		System.out.println("Digite o primeiro numero");
		B = scan.nextInt();
		scan.close();
		int resto = A % B;
		if(resto == 0 ) {
			System.out.println("MUTIPLOS");
		}
		else {
			System.out.println("Não SÃO MUTIPLOS");
		}
			
	}
}

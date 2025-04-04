package Exercicios_Estruturas_Condicionais;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int numero;
		System.out.println("Digite o numero");
		numero = scan.nextInt();
		scan.close();
		if(numero % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
	}
}

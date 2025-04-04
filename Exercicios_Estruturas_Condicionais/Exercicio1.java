package Exercicios_Estruturas_Condicionais;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		System.out.println("Digite um numero");
		numero = scan.nextInt();
		scan.close();
		if(numero < 0) {
			System.out.println("NEGATIVO");
			
		}else {
			System.out.println("Não é negativo");
		}
			
	
	}
}

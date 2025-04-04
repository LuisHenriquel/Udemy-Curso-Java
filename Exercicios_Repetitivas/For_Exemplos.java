package Exercicios_Repetitivas;

import java.util.Scanner;

public class For_Exemplos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos numeros deseja somar");
		int num = scan.nextInt();
		int resultado = 0;
		for(int x = 0; x < num; x++) {
			System.out.println("Digite o numero");
			int conta = scan.nextInt();
			resultado += conta;
		}
		System.out.println(resultado);
		scan.close();
	}
	
}

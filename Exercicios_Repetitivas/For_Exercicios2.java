package Exercicios_Repetitivas;

import java.util.Scanner;

public class For_Exercicios2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos numeros quer que verifique");
		int x = scan.nextInt();
		int in = 0; 
		int out = 0;
		for(int i = 1; i <= x; i++) {
			System.out.println("Digite o numero para ver se esta dentro do intervalo");
			int numero = scan.nextInt();
			if(numero >= 10 && numero <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.println(in + " in " );
		System.out.print(out  + " out " );
		scan.close();
	}
}

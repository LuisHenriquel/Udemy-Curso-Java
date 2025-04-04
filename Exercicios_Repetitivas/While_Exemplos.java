package Exercicios_Repetitivas;
import java.util.Scanner;

public class While_Exemplos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Sintaxe
		 While (condição){
		 	comando1
		 	comando2
		 }
		 */
		System.out.println("Digite um numero");
		int  x = scan.nextInt();
		
		int soma = 0;
		while(x != 0) {
			soma += x;
			x = scan.nextInt();
		}
		System.out.println(soma);
		
		
		scan.close();
	}
	;

}

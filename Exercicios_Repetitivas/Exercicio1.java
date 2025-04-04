package Exercicios_Repetitivas;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int senha = 0;
		//senha certar
		
		
		while(senha != 2002) {
			System.out.println("Digite a Senha");
			senha = scan.nextInt();
			if(senha == 2002) {
				System.out.println("Acesso permitido");			
		}else {
			System.out.println("Senha Invalida");
		}

		}
		scan.close();
		
	}
}

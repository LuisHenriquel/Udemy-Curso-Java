package Exercicios_Repetitivas;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		//Achar Coordenadas

		Scanner scan = new Scanner(System.in);
		int X = 2;
		int Y = 3;
		
		while(X != 0 || Y != 0) {
			System.out.println("Digite a coordenada X");
			X = scan.nextInt();
			System.out.println("Digite a coordenada Y");
			Y = scan.nextInt();
			if(X > 0 && Y > 0) {
				System.out.println("Primeiro");
			}
			else if(X < 0 && Y > 0) {
				System.out.println("Segundo");

			}
			else if(X < 0 && Y < 0) {
				System.out.println("Terceiro");
			}
			else if(X > 0 && Y < 0) {
				System.out.println("Quarto");
			}else {
				X =0;
				Y=0;
			}
			
			scan.close();
		}
		
	}
}

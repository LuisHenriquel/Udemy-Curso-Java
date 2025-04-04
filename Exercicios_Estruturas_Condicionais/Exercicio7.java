package Exercicios_Estruturas_Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double X;
		double Y;
		System.out.println("Digite a coordenada X");
		X = scan.nextDouble();
		System.out.println("Digite a coordenada Y");
		Y = scan.nextDouble();
		scan.close();
		if(X > 0 && Y > 0) {
			System.out.println("Q1");
		}
		else if(X < 0 && Y > 0) {
			System.out.println("Q2");
		}
		else if(X < 0 && Y >0) {
			System.out.println("Q3");
		}
		else if(X > 0 && Y < 0) {
			System.out.println("Q4");
		}
		else{
			System.out.println("Origem");
		}
	}
	
}

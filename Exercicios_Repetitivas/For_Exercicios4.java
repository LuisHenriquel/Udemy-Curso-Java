package Exercicios_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class For_Exercicios4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite  quantas divisoes querem fazer");
		int x = scan.nextInt();
		for(int i = 0;i < x; i++) {
			System.out.println("Digite o numerador");
			double numerador =scan.nextDouble();
			System.out.println("Digite o denominador");
			double denominador =scan.nextDouble();
			double divisao = numerador / denominador;
			if(denominador != 0) {
				System.out.println(divisao);
			}
			else
				
				System.out.println("divisao impossivel");
		}
		scan.close();
	}
}

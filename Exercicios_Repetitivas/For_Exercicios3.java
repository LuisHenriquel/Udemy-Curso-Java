package Exercicios_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class For_Exercicios3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double a=0;
		double b=0;
		double c=0;
		double resultado =0;
		System.out.println("Digite o numero de vezes que deseja repetir");
		int x = scan.nextInt();
		for(int i =0; i < x; i++) {
			System.out.println("Digite o primeiro conjunto");
			a = scan.nextDouble();
			System.out.println("Digite o Segundo conjunto"); 
			b = scan.nextDouble();
			System.out.println("Digite o Terceiro conjunto");
			c = scan.nextDouble();
			resultado = (a * 2 + b * 3 + c * 5) / 10;
			System.out.printf(" %.1f%n",resultado);
		}
		scan.close();;
	
	}

}

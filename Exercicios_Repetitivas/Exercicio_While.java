package Exercicios_Repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_While {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		boolean loop = true;
		while(loop) {
			System.out.println("Digite a temperatura em celsius: ");
			double C = scan.nextDouble();
			double F = 9.0 * C /5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir (s/n)?");
			char resp = scan.next().charAt(0);
			if(resp == 'n') {
				loop = false;
			}
			else
				loop = true;
		}
		System.out.println("Fim do sistema");
		scan.close();
	}
}

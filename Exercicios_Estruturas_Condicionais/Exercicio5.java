package Exercicios_Estruturas_Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double CachorroQuente1 = 4.00;
		double XSalada2 = 4.50;
		double XBacon3 = 5.00;
		double TorradaSimples4 = 2.00;
		double Refrigerante5 = 1.50;
		int codigo;
		int quantidade;
		System.out.println("Digite qual codigo você que");
		codigo = scan.nextInt();
		System.out.println("Digite a quantidade");
		quantidade = scan.nextInt();
		scan.close();
		
		if(codigo == 1) {
		double resultado =CachorroQuente1 * quantidade;
		System.out.printf("Total: %.2f%n", resultado);
		}
		else if(codigo == 2) {
			double resultado = XSalada2 * quantidade;
			System.out.printf("Total: %.2f%n", resultado);
		}
		else if(codigo == 3) {
			double resultado = XBacon3 * quantidade;
			System.out.printf("Total: %.2f%n", resultado);
		}
		else if(codigo == 4) {
			double resultado = TorradaSimples4 * quantidade;
			System.out.printf("Total: %.2ff%n", resultado);
		}
		else if(codigo == 5) {
			double resultado = Refrigerante5 * quantidade;
			System.out.printf("Total: %.2ff%n", resultado);
		}
		
	}
}

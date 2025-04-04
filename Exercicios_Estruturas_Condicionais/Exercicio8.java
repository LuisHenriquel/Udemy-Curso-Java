package Exercicios_Estruturas_Condicionais;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double resultado = 0.0;
		double salario;
		System.out.println("Digite sua renda");
		salario = scan.nextDouble();
		scan.close();
		if(salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if(salario <= 3000.00) {
			 resultado = (salario - 2000) * 0.08; 
		}
		else if(salario <= 4500.00) {
			 resultado = 1000.00 * 0.08 + (salario - 3000.00) * 0.18; 
	}
		else {
			 resultado = 1000.00 * 0.08 + 1500.00 * 0.18 + (salario - 4500.00) * 0.28;
		}
		System.out.printf("%.2f%n", resultado );
	}
	
}
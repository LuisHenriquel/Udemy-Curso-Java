package Exercicios_Estrutura_Sequencia;
import java.util.Locale;
import java.util.Scanner;

public class conta_raio {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double tt = 3.14159; 
		System.out.println("Digite o valor do raio");
		double raio = scan.nextDouble();
		double resultado = (tt * (raio * 2));
		System.out.printf("A= %.4f%n",resultado);
		scan.close();
	}

}

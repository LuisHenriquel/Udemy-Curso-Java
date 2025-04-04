package Exercicios_Estrutura_Sequencia;
import java.util.Locale;
import java.util.Scanner;
public class conta_matamaticas {
	public static void main(String[] args) {
		double A, B, C;
		double pi = 3.14159;
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		A = scan.nextDouble();
		System.out.println("Digite o valor de B:");
		B =  scan.nextDouble();
		System.out.println("Digite o valor de C:");
		C = scan.nextDouble();
		
		double Resultado_Triangulo = (A * C) / 2;
		double Resultado_Circulo = pi * (C * C);
		double Resultado_Trapezio = (A + B) * C / 2; 
		double Resultado_Quadrado = B * B;
		double Resultado_Retangulo = A * B;
		
		System.out.printf("Triangulo: %.3f%nCirculo:%.3f%nTrapezio: %.3f%nQuadrado: %.3f%nRetangulo: %.3f%n ", Resultado_Triangulo, Resultado_Circulo, Resultado_Trapezio, Resultado_Quadrado, Resultado_Retangulo );
	}
	
}

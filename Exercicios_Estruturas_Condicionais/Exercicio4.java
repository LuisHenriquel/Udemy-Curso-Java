package Exercicios_Estruturas_Condicionais;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Hora_Inicial;
		int Hora_Final;
		System.out.println("Digite a hora inicial");
		Hora_Inicial = scan.nextInt();
		System.out.println("Digite a hora final");
		Hora_Final = scan.nextInt();
		scan.close();
		if(Hora_Inicial < Hora_Final) {
			int	resultado = Hora_Final - Hora_Inicial;
			System.out.printf("O JOGO DUROU %d HORA(S)", resultado);
		}
		else if(Hora_Inicial > Hora_Final) {
			int resultado = 24 + Hora_Final - Hora_Inicial;
			System.out.printf("O JOGO DUROU %d HORAS(S)",resultado);
		}
		else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
			
	}
}

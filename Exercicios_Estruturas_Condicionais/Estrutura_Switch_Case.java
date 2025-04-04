package Exercicios_Estruturas_Condicionais;

import java.util.Scanner;

public class Estrutura_Switch_Case {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dia;
		System.out.println("Digite o dia ");
		dia = scan.nextInt();
		switch(dia) {
		case 1:{
			System.out.println("Dia da semana:Domingo");
			break;
		}
		case 2:{
			System.out.println("Dia da semana:Segunda");
			break;
		}
		case 3: {
			System.out.println("Dia da semana:Terça");
			break;
		}
		case 4:{
			System.out.println("Dia da semana:Quarta");
			break;
		}
		case 5:{
			System.out.println("Dia da semana:Quinta");
			break;
		}
		case 6:{
			System.out.println("Dia da semana:sexta");
			break;
		}
		case 7:{
			System.out.println("Dia da semana:Sabado");
			break;
		}
		default:{
			System.out.println("Valor inválido");
		}
		}
		scan.close();
		
	}
}

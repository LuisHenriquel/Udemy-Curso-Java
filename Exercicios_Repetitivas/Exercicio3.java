package Exercicios_Repetitivas;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;
		boolean fim = false;
		while(fim != true) {
			System.out.println("Digite o codigo");
			int codigo = scan.nextInt();
			if( codigo == 1) {
				Alcool += 1;
			}
			else if(codigo == 2) {
				Gasolina += 1;
			}
			else if(codigo == 3) {
				Diesel += 1;
			}
			else if(codigo == 4) {
				System.out.printf("MUITO OBRIGADO %nAlcool: %d%nGalosina: %d%nDiesel: %d", Alcool, Gasolina, Diesel);
				fim = true;
			}
			else {
				System.out.println("Digite o codigo valido, ele vai de 1 a 4 ");
			}
			scan.close();
		}
		
	}
}

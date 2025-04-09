package Exercicios_Estrutura_Sequencia;
import java.util.Scanner;

public class conta_peca {

	public static void main(String[] args) {
		double Codigo_Peca, Numero_Peca, Valor_Uni;
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Digite o codigo da peça");
			Codigo_Peca = scan.nextDouble();
			System.out.println("Digite o numero de peças que vai pegar");
			Numero_Peca = scan.nextDouble();
			System.out.println("Valor da peça");
			Valor_Uni = scan.nextDouble();
			double Total_Pagar = Numero_Peca * Valor_Uni;
			System.out.printf("Valor a pagar: %.2f%n", Total_Pagar);
			scan.close();
			
			
		
	}

}

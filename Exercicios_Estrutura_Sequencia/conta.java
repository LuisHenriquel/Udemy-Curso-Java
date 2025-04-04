package Exercicios_Estrutura_Sequencia;
import java.util.Scanner;
public class conta {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Primeira conta");
		System.out.println("Digite o primeiro numero  para a adição");
		int numb1 = scan.nextInt();
		System.out.println("Digite o segundo numero ");
		int numb2 = scan.nextInt();
		int resultado = numb1 + numb2;
		scan.close();
		System.out.printf("A soma %d + %d = %d%n", numb1, numb2, resultado);
	}

}

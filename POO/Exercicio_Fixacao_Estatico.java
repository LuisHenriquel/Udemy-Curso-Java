package POO;

import java.util.Locale;
import java.util.Scanner;

import util_dollar.CurrencyConverter;

public class Exercicio_Fixacao_Estatico {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner  scan = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		CurrencyConverter.dollar = scan.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		CurrencyConverter.amount = scan.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.ConverterDollar());
		
		
		scan.close();
	}

}

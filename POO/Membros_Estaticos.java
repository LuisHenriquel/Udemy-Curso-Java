package POO;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Membros_Estaticos {
	// Se vc quiser com que algum valor vire uma constante e não uma variavel vc acrecenta o final
	// Padrao de nome para constante sempre vai ser em maiusculo 

	
public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = scan.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circuference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n ", Calculator.PI);

		scan.close();
	}
	
	
	
	
}

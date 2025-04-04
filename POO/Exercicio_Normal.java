package POO;



import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Exercicio_Normal {
	public static void main(String[] String) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Triangle X,Y;
		X = new Triangle();
		Y = new Triangle();
		System.out.println("Enter the measures of triangle X: ");
		X.a = scan.nextDouble();
		X.b = scan.nextDouble();
		X.c  = scan.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		Y.a = scan.nextDouble();
		Y.b = scan.nextDouble();
		Y.c = scan.nextDouble();
		//Calculo para Area X
		double areaX = X.area();
		
		//Calculo para Area Y
		double areaY = Y.area();
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX < areaY) {
			System.out.print("Larger area: Y");
		}
		else
			System.out.print("Larger area: X");
		
		scan.close();
	}
}

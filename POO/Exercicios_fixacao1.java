package POO;
import java.util.Locale;
import java.util.Scanner;

import entities_Rectangle.Rectangle;


public class Exercicios_fixacao1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Rectangle Rectangle = new Rectangle();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter rectangle width and height");
		Rectangle.Whidth = scan.nextDouble();
		Rectangle.Height = scan.nextDouble();
		scan.close();
		
		System.out.println(Rectangle);
	}
}	

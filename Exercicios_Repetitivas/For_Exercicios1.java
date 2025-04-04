package Exercicios_Repetitivas;

import java.util.Scanner;

public class For_Exercicios1 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 	System.out.println("Digite o numero");
		    int x = scan.nextInt();
		    for (int i = 1; i <= x; i++) {
		      if (i % 2 != 0) {
		        System.out.println(i);
		      }
		    }
		    scan.close();
	}
}

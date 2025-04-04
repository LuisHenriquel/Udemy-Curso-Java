package POO;

import java.util.Locale;
import java.util.Scanner;

import entities_Products.Product;

public class application_Loja {
	public static void main(String[] args) {
		Product produ = new Product();
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		boolean start = true;
		
		while(start) {
			System.out.println("Select options");
			System.out.println("[1]- View Total Value in Stock");
			System.out.println("[2]- Add Products");
			System.out.println("[3]- Remove Products");
			System.out.println("[4] close system");
			int response = scan.nextInt();
			
			if(response == 1) {
				double value = produ.totalValueInStock();
				System.out.printf("Product data: %s, $ %.2f, %d units, Total: %.2f%n",produ.name, produ.price, produ.quantity, value);
			}
			else if(response == 2){
				System.out.println("Enter the number of products to be added in stock: ");
				int value = scan.nextInt();
				produ.AddProducts(value);
			}
			else if(response == 3){
				System.out.println("Enter the number of products to be removed from stock: ");
				int value = scan.nextInt();
				produ.removeProducts(value);;
			}
			else if(response == 4) {
				start = false;
			}
			else {
				System.out.println("Select a valid option");
			}
		}
		scan.close();
	}
	
}

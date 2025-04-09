package entities_Products;

public class Product {
	public String name = "Tv";
	public double price = 900.00;
	public int quantity = 10;
	public double total;
	
	public double totalValueInStock() {
		 return total = price * quantity;
	 
	}

	public  void AddProducts(int quantity_new) {
		if (quantity_new > 0) {
			this.quantity += quantity_new;
		} else {
			System.out.println("Aquantidade deve ser maior que zero.");
		}
		
	}
	
	public void removeProducts(int quantity_new) {
		this.quantity -= quantity_new;
	}
	
	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
	}
	
}

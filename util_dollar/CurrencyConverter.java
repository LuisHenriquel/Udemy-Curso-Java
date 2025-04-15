package util_dollar;

public class CurrencyConverter {
   
	public static double dollar;
	public static double amount;
	public static final double IOF = 0.06;
	
	public static double ConverterDollar() {
		return  amount * dollar * (1.0 + IOF); 
	}
	
}

import java.util.Locale;

public class Processamento_Dados {

	public static void main(String[] args) {
		
		System.out.println("Exemplo 1 Processamento de Dados ");
		//Exemplo1
		
		int  x, y;
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("----------------------------");
		System.out.println("Exemplo 2");
		//Exemplo2
		
		double b, B, h, area;
		
		b= 6.0;  //quando for float uma boa pratica no final colocar o f
		B = 8.0; // ex: b = 8f;
		h = 5.0;
		
		area = (b+B) / 2.0 * h;
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n%n", area);
		
		
		System.out.println("Exemplo de Casting");
		
		int a, c;
		double resultado;
		
		a=5;
		c=2;
		
		resultado = a / b;
		System.out.printf("%.2f%n", resultado );
		//ou resultado = (double) a / b;
		 
		
		
		

	}

}

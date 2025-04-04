package Exercicios_Estruturas_Condicionais;

public class Expressao_condicional_ternaria {
	public static void main(String[] args) {
		// (condição) ? valor_se_for_verdade : valor_se_for_falso
		
		System.out.println((2 > 4) ? 50 : 80); 
		System.out.println((10 != 3) ? "Maria" : "Alex");
		
		System.out.println("Exemplo 2");
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;
		System.out.println(desconto);
	}

}

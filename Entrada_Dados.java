import java.util.Scanner;

public class Entrada_Dados {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Exemplo de entrada de dados Scanner");
		int x;
		String s1, s2, s3;
		System.out.println("Digite:");
		x = scan.nextInt();
		scan.nextLine();
		s1 = scan.nextLine();
		s2 = scan.nextLine();
		s3 = scan.nextLine();

		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		scan.close();
	}

}

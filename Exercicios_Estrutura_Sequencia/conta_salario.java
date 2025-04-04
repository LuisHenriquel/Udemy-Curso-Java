package Exercicios_Estrutura_Sequencia;
import java.util.Locale;
import java.util.Scanner;
public class conta_salario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Número de funcionario:");
		int Number_Employee =scan.nextInt();
		System.out.println("Horas trabalhando");
		int Hours_Worked = scan.nextInt();
		System.out.println("Salario do trabalhador por horas");
		double  Employee_Salary = scan.nextDouble();
		Employee_Salary = Employee_Salary * Hours_Worked;
		scan.close();
		System.out.printf("Number: %d%n",Number_Employee);
		Locale.setDefault(Locale.US);
		System.out.printf("Salary = U$ %.2f%n", Employee_Salary);
	}

}

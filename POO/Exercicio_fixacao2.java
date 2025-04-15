package POO;

import java.util.Locale;
import java.util.Scanner;

import entities_Employee.Employee;

public class Exercicio_fixacao2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Employee employee = new Employee();
		
		
		
		System.out.println("Digite seu nome");
		employee.name = scan.next();
		scan.next();
		System.out.println("Digite seu salario bruto");
		employee.grossSalary = scan.nextDouble();
		System.out.println("Digite as taxas");
		employee.tax = scan.nextDouble();
		
		System.out.println("Employee: " + employee);	
		
		System.out.println("Wich percentage to increase salary?");
		double percentage = scan.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println("Update data:  " + employee);
		scan.close();
		
	}
}

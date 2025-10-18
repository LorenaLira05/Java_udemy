package exercicios1a7;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorPorHora;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		double salario = valorPorHora * horas;
		
		System.out.printf("Number = %d%n", numero);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		sc.close();
		
	}
	
}

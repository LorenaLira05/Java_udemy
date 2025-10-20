package exercicios1a7;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, codigo2, nPecas1, nPecas2;
		double valor1, valor2, total;
		
		codigo1 = sc.nextInt();
		nPecas1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		nPecas2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = valor1 * nPecas1 + valor2 * nPecas2;
		
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
		
		sc.close();
	}
}

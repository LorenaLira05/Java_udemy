package exercicios1a7;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, DIFERENCA;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		DIFERENCA = a * b - c * d;
		
		System.out.printf("Diferenca = %d", DIFERENCA);
		
		sc.close();
		
	}
}

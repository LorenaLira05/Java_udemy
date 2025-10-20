package estrutura_cond;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Hi = sc.nextInt();
		int Hf = sc.nextInt();
		int total;
		
		if (Hi<Hf) {
			total = Hf - Hi;
		} else {
			total= 24 - Hi + Hf;
		}
		
		System.out.printf("O jogo durou %d hora(s)", total);
		sc.close();
		
		
	}
}

package estrutura_cond;

import java.util.Scanner;
public class Ex1 {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	
	if (x > 0) {
		System.out.println("POSITIVO");
	} else {
		System.out.println("NEGATIVO");
	}
	
	sc.close(); 
	
	}
}

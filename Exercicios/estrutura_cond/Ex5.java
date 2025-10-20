package estrutura_cond;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco;
		
		if(codigo==1) {
			preco = 4.00 * quantidade;
			System.out.printf("Total: R$ %.2f", preco);
		} else if (codigo==2) {
			preco = 4.50 * quantidade;
			System.out.printf("Total: R$ %.2f", preco);
		}else if(codigo==3) {
			preco = 5.00 * quantidade;
			System.out.printf("Total: R$ %.2f", preco);
		} else if (codigo==4) {
			preco = 2.00 * quantidade;
			System.out.printf("Total: R$ %.2f", preco);
		} else if (codigo==5) {
			preco = 1.50 * quantidade;
			System.out.printf("Total: R$ %.2f", preco);
		}
		
		sc.close();
	}
}

package estrutura_cond;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		if (y%2==0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	
		sc.close();
	}
	
}

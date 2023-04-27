package exercicios2;
import java.util.Locale;
import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor=0;
		double x = sc.nextDouble();
		
		if(x >= 0 && x <= 2000)
			System.out.println("Isento");
		else {
			if(x <= 3000)
				valor = (x - 2000) * 0.08;
			else if(x >= 3000.01 && x <= 4500)
				valor = (x - 3000) * 0.18 + 1000 * 0.08;
			else if(x >= 4500)
				valor = (x - 4500) * 0.28 + 1499.99 * 0.18 + 1000 * 0.08;

			System.out.printf("R$ %.2f\n", valor);
	
		}
		
		sc.close();
	}
}

/* 

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor=0;
		double x = sc.nextDouble();
		
		if(x >= 0 && x <= 2000)
			System.out.println("Isento");
		else {
			if(x <= 3000)
				valor = (x - 2000) * 0.08;
			else if(x >= 3000.01 && x <= 4500)
				valor = (x - 3000) * 0.18 + 1000 * 0.08;
			else if(x >= 4500)
				valor = (x - 4500) * 0.28 + 1499.99 * 0.18 + 1000 * 0.08;

			System.out.printf("R$ %.2f\n", valor);
	
		}
		
		sc.close();

   }

}

*/
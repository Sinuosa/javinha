package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class ex04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner x = new Scanner(System.in);
		
		int cod;
		double ht, valor;
		
		cod = x.nextInt();
		ht = x.nextDouble();
		valor = x.nextDouble();
		
		System.out.println("NUMBER = " + cod);
		System.out.printf("SALARY = U$ %.2f\n", ht*valor);
		
		x.close();
		
	}

}

/*

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner x = new Scanner(System.in);
		
		int cod;
		double ht, valor;
		
		cod = x.nextInt();
		ht = x.nextDouble();
		valor = x.nextDouble();
		
		System.out.println("NUMBER = " + cod);
		System.out.printf("SALARY = U$ %.2f\n", ht*valor);
		
		x.close();
 
    }
 
}

*/
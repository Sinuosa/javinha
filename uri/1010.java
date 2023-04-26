package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner x = new Scanner(System.in);
		
		int cod1, qtd1, cod2, qtd2;
		double valor1, valor2;
		
		cod1 = x.nextInt();
		qtd1 = x.nextInt();
		valor1 = x.nextDouble();
		
		cod2 = x.nextInt();
		qtd2 = x.nextInt();
		valor2 = x.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", qtd1*valor1 + qtd2*valor2);
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
		
		int cod1, qtd1, cod2, qtd2;
		double valor1, valor2;
		
		cod1 = x.nextInt();
		qtd1 = x.nextInt();
		valor1 = x.nextDouble();
		
		cod2 = x.nextInt();
		qtd2 = x.nextInt();
		valor2 = x.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", qtd1*valor1 + qtd2*valor2);
 		x.close();
    }
 
}

*/
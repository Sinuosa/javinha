package exercicios2;
import java.util.Scanner;
import java.util.Locale;

public class ex06 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		double valor = 0;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if(cod == 1)
			valor = qtd * 4;
		else if(cod == 2)
			valor = qtd * 4.5;
		else if(cod == 3)
			valor = qtd * 5;
		else if(cod == 4)
			valor = qtd * 2;
		else if(cod == 5)
			valor = qtd * 1.5;
		
		System.out.printf("Total: R$ %.2f\n", valor);
		
		sc.close();
		
	}

}

/* 

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {

   public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		double valor = 0;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if(cod == 1)
			valor = qtd * 4;
		else if(cod == 2)
			valor = qtd * 4.5;
		else if(cod == 3)
			valor = qtd * 5;
		else if(cod == 4)
			valor = qtd * 2;
		else if(cod == 5)
			valor = qtd * 1.5;
		
		System.out.printf("Total: R$ %.2f\n", valor);
		
		sc.close();

   }

}

*/
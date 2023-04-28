package exercicios3;
import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}
}


/*

import java.io.IOException;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
   }

}

*/
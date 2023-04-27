package exercicios2;
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, duracao;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		duracao = y - x;
		
		if(duracao < 0)
			duracao += 24;
		else if(duracao == 0)
			duracao = 24;
		
		
		System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		
		sc.close();
	}
}

/* 

import java.io.IOException;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int x, y, duracao;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		duracao = y - x;
		
		if(duracao < 0)
			duracao += 24;
		else if(duracao == 0)
			duracao = 24;
		
		
		System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		
		sc.close();
   }

}

*/
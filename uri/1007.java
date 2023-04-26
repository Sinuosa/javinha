package exercicios;
import java.util.Scanner;


public class ex03 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int a, b, c, d;
		
		a = x.nextInt();
		b = x.nextInt();
		c = x.nextInt();
		d = x.nextInt();
		
		System.out.println("DIFERENCA = " + (a*b - c*d));
		x.close();
	}

}

/* import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner x = new Scanner(System.in);
		int a, b, c, d;
		
		a = x.nextInt();
		b = x.nextInt();
		c = x.nextInt();
		d = x.nextInt();
		
		System.out.println("DIFERENCA = " + (a*b - c*d));
		x.close();
    }
 
}*/
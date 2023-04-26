package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner x = new Scanner(System.in);
		
		double a, b, c;
		
		a = x.nextDouble();
		b = x.nextDouble();
		c = x.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f\n", a*c/2);
		System.out.printf("CIRCULO: %.3f\n", c*c*3.14159);
		System.out.printf("TRAPEZIO: %.3f\n", (a+b)*c/2);
		System.out.printf("QUADRADO: %.3f\n", b*b);
		System.out.printf("RETANGULO: %.3f\n", a*b);
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
		
		double a, b, c;
		
		a = x.nextDouble();
		b = x.nextDouble();
		c = x.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f\n", a*c/2);
		System.out.printf("CIRCULO: %.3f\n", c*c*3.14159);
		System.out.printf("TRAPEZIO: %.3f\n", (a+b)*c/2);
		System.out.printf("QUADRADO: %.3f\n", b*b);
		System.out.printf("RETANGULO: %.3f\n", a*b);
 		x.close();
    }
 
}

*/
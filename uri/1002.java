package exercicios;
import java.util.Scanner;
import java.util.Locale;


public class ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner x = new Scanner(System.in);
		
		double a;
		
		a = x.nextDouble();
		
		System.out.printf("A=%.4f\n", a*3.14159*a);
		x.close();
	}

}

/* import java.io.IOException;
import java.util.Scanner; 
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		Scanner x = new Scanner(System.in);
		
		double a, b;
		
		a = x.nextDouble();
		
		System.out.printf("A=%.4f\n", a*3.14159*a);
		x.close();
    }
 
}*/
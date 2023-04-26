package exercicios;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		int a, b;
		
		a = x.nextInt();
		b = x.nextInt();
		
		System.out.println("SOMA = " + (a+b));
		
		x.close();
	}

}

/* import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner x = new Scanner(System.in);
		
		int a, b;
		
		a = x.nextInt();
		b = x.nextInt();
		
		System.out.println("SOMA = " + (a+b));
 
 		x.close();
    }
 
}*/
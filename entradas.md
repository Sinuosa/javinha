# Entrada de Dados
* Para fazer entrada de dados, criamos um objeto do tipo "Scanner" da seguinte forma:

      Scanner sc = new Scanner(System.in);
      
  * Scanner é um tipo especial do Java para fazer entrada de dados. Precisamos da biblioteca:

        import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        // faça sc.close() quando não precisar mais do objeto sc
        
* Para ler uma palavra:

      String x;
      x = sc.next();
      
 * **Atalho**: sysout + CTRL + ESPAÇO = System.out.println();



		 import java.util.Scanner;
		 public class Main {

	    public static void main(String[] args) {
	      Scanner variavel = new Scanner(System.in);

	      String aux;
	      aux = variavel.next();
	      System.out.println("Texto: " + aux);

	      variavel.close();
	     }

	   }

* Ler um número inteiro

		import java.util.Scanner;
			public  class Main {
				public  static  void main(String[] args) {
					Scanner variavel = new Scanner(System.in);
					
					int  aux;
					aux = variavel.nextInt();
					System.out.println("Digito: " + aux);
					
					variavel.close();
			}
		}
    
* Ler um número ponto flutuante

	     import java.util.Scanner;
	     //import java.util.Locale;
	      public class Main {

		       public static void main(String[] args) {
		          //Locale.setDefault(Locale.US);

		          Scanner variavel = new Scanner(System.in);
		          double aux;

		          aux = variavel.nextDouble();
		          System.out.println("Digito: " + aux);
              //System.out.printf("Digitado: %.2f%n", x);

		          variavel.close();
        }

      }

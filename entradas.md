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
* Ler um caractere

	     import java.util.Scanner;
	     //import java.util.Locale;
	      public class Main {

		       public static void main(String[] args) {
		          //Locale.setDefault(Locale.US);

		          Scanner variavel = new Scanner(System.in);
		          char aux;

		          aux = variavel.next().charAt(0);
		          System.out.println("Digito: " + aux);

		          variavel.close();
        }

      }
      
* Para ler vários dados na mesma linha


		import java.util.Scanner;
			public  class Main {
				public  static  void main(String[] args) {
					Scanner variavel = new Scanner(System.in);
					String x1;
					int  x2;
					double  x3;
					x1 = variavel.next();
					x2 = variavel.nextInt();
					x3 = variavel.nextDouble();

					System.out.println("Nome: " + x1 + " Idade: " + x2 + " Massa: " + x3);
					variavel.close();
			}
		}
		
* Para ler um texto até a quebra de linha
	* **Atalho:** CTRL + SHIFT + F para auto identação


			import java.util.Scanner;
				public  class Main {
					public  static  void main(String[] args) {
						Scanner variavel = new Scanner(System.in);
						String x1, x2, x3;

						x1 = variavel.nextLine();
						x2 = variavel.nextLine();
						x3 = variavel.nextLine();

						System.out.println(x1);
						System.out.println(x2);
						System.out.println(x3);

						variavel.close();
				}
			}

* Quebra de linha pendente

		import java.util.Scanner;
		public  class Main {
			public  static  void main(String[] args) {
				Scanner variavel = new Scanner(System.in);
				int  x;
				String x1, x2, x3;
				x = variavel.nextInt();
				variavel.nextLine(); //solução! para limpar o buffer de leitura
				x1 = variavel.nextLine();
				x2 = variavel.nextLine();
				x3 = variavel.nextLine();

				System.out.println(x);
				System.out.println(x1);
				System.out.println(x2);
				System.out.println(x3);

				variavel.close();
			}
		}

		//quando  digitamos o 30, digitamos o enter logo  em  seguida. Essa  quebra  de  linha  fica  pendente  na  entrada  padrão

		//assim  quando  chama x1 = variavel.nextLine(); consome a quebra  de  linha  pendente e fica  como string vazia

		//solução é fazer  um nextLine() extra antes  de  fazer o nextLine() de  interesse

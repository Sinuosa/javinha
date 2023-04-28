# WHILE
* **Conceito:** é uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira. Usamos quando não se sabe previamente a quantidade de repetições que será realizada.
* **Estrutura:**

      while ( condição ) {
        comando 1
        comando 2
      }
      
* **Exemplo:** Programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.


      import java.util.Scanner;

      public class Main {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int x = sc.nextInt();

          int soma = 0; 

          while(x!=0) {
            soma += x;
            x = sc.nextInt();
          }

          System.out.println(soma);

          sc.close();
        }
      }
      
* Teste de mesa manual

# FOR
* **Conceito:** é uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores. Usamos quando sabemos previamente a quantidade de repetições, ou o intervalo de valores.
* **Estrutura:**


            for ( inicio ; condicao ; incremento ){
                  comando 1
                  comando 2
            }

* **Exemplo:** Programa que lê um valor N e depois N números inteiros. Ao final, mostra a soma dos N números lidos.

      import java.util.Scanner;

      public class Main {
            public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);

                  int n = sc.nextInt();
                  int x;

                  int soma = 0; 

                  for(int i = 0; i < n; i++) {
                        x = sc.nextInt();
                        soma += x;
                  }

                  System.out.println(soma);

                  sc.close();
            }
      }

* Em vez de incrementar, podemos decrementar.

		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}

* Teste de mesa manual

# DO-WHILE

* **Conceito:** O bloco de comandos executa pelo menos uma vez, pois a condição é executada no final.
* **Estrutura:**

            do {
                  comando 1
                  comando 2
            } while ( condicao );
 
 * **Exemplo:** Programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit. Pergunte se o usuario deseja repetir (s/n). Caso "s", repita o programa. Fórmula: F = (9C/5) + 32

            import java.util.Locale;
            import java.util.Scanner;

            public class Main {
                  public static void main(String[] args) {
                        Locale.setDefault(Locale.US);
                        Scanner sc = new Scanner(System.in);

                        double c, fah;
                        char repete;

                        do {
                              c = sc.nextDouble();
                              fah = (9*c/5)+32;
                              System.out.printf("%.1f\nRepetir?(s\\n)\n", fah);
                              repete = sc.next().charAt(0);
                        } while (repete == 's');


                        sc.close();

                  }
            }

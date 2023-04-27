# WHILE
* É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira. Usamos quando não se sabe previamente a quantidade de repetições que será realizada.
* Estrutura:

      while ( condição ) {
        comando 1
        comando 2
      }
      
* Exemplo: Programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.

      import java.util.Locale;
      import java.util.Scanner;

      public class Main {
        public static void main(String[] args) {
          Locale.setDefault(Locale.US);
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

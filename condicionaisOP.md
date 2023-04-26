# Operadores de atribuição cumulativa
![Operadores de atribuição cumulativa](https://i.ibb.co/VWXd8dY/Sem-t-tulo.png)
# Switch-case
* Conceito: Usada quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável, ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.

* Estrutura:

      switch( expressão ){
        case valor1:
            comando1
            comando2
            break;
        case valor2:
            comando3
            comando4
            break;
        default:
            comando5
            comando6
            break;

![Exemplo](https://i.ibb.co/VYxcBKP/Sem-t-tulo.png)

* Código:

	  import java.util.Scanner;
		  public  class Main {
			  public  static  void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int  x;
                    String dia;
                    x = sc.nextInt();

                    switch(x){
                      case 1:
                          dia = "domingo";
                          break;
                      case 2:
                          dia = "segunda";
                          break;
                      case 3:
                          dia = "terça";
                          break;
                      case 4:
                          dia = "quarta";
                          break;
                      case 5:
                          dia = "quinta";
                          break;
                      case 6:
                          dia = "sexta";
                          break;
                      case 7:
                          dia = "sabado";
                          break;
                      default:
                          dia = "valor invalido";
                          break;
                      }

                    System.out.println(dia);

                    sc.close();
        }
	  }
    
# Expressão condicional ternária

* Estrutura:

      ( condicao ) ? valor_se_verdadeiro : valor_se_falso

* Exemplos
  * (2 > 4) ? 50 : 80  **Resultado:** 80
  * (10!=3) ? "Maria" : "Alex" **Resultado:** "Maria"

# Escopo e inicialização
* Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
* Uma variável não pode ser usada se não for iniciada. 
  * O Java, diferente do C que pega lixo de memória, dá compilation error quando certa variável não é iniciada. Interessante!   

* Código **errado**:

      public  class Main {
        public  static  void main(String[] args) {
          double price = 400.00;

          if(price < 200) {
            double discount = price * 0.1;
          }

          System.out.println(discount);

        }
      }

  * Pois discount aparece apenas no escopo do if. Quando tratamos ele fora,  recebemos um erro!

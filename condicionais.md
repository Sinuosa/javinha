# Expressões Comparativas

* Operadores:
  * <
  * \>
  * <=
  * \>=
  * ==   
  * !=

# Expressões Lógicas

* Operadores:
  * E: &&
  * OU: ||
  * NÃO: ! 

* Tabela Verdade dos operadores
  * E: 

![Tabela Verdade E](https://i.ibb.co/3hxKwCD/tabela-verdade-E.png)

  * OU:

![Tabela Verdade OU](https://i.ibb.co/ykhB3C9/tabela-verdade-OU.png)

  * NÃO:

![Tabela Verdade NÃO](https://i.ibb.co/LdHWsLt/Sem-t-tulo.png)

# Estrutura Condicional

* Conceito: É uma estrutura de controle que permite definir que um certo bloco de comandos somente será executado dependendo de uma condição.
* Estrutura condicional simples:

		if ( <condição>) {
			<comando 1>
			<comando2>
		}

* Identação! Utilize os espaços para indicar que certos comandos estão dentro de uma estrutura.
* Aplicando:


		public  class Main {
			public  static  void main(String[] args) {
				int  x = 5;
				System.out.println("Bom dia");

				if(x < 0) {
					System.out.println("Boa tarde");
				}
				
				System.out.println("Boa noite");
			}
		}
    
 Saída: <br>
 Bom dia <br>
 Boa noite
 
 * Estrutura condicional composta


		if ( <condição> ) {
			<comando 1>
			<comando 2>
		}
		else {
			<comando 3>
			<comando 4>
		}
    
 * Mais de duas possibilidades: ifs aninhados, encadeamento de estruturas condicionais

		if ( <condição 1> ) {
			<comando 1>
			<comando 2>
		}
		else {
			if ( <condição 2> ){
				<comando 3>
				<comando 4>
			}
			else {
				<comando 5>
				<comando 6>
		}
    
    
* Outra opção:

		if ( <condição 1> ) {
			<comando 1>
			<comando 2>
		}
		else if ( <condição 2> ){
				<comando 3>
				<comando 4>
			}
		else {
				<comando 5>
				<comando 6>
		}
    
* Na prática:


      import java.util.Scanner;
        public  class Main {
          public  static  void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int  x;
            x = sc.nextInt();

            if(x < 12) {
              System.out.println("Bom dia");
            }
            else  if(x < 18){
              System.out.println("Boa tarde");
            }
            else {
              System.out.println("Boa noite");
            }
            sc.close();
          }
      }

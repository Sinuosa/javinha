# Casting

	public class Main {
			public static void main(String[] args){
				int x;
				double y;
				x = 5;
				y = 2 * x;
				System.out.println(x);
				System.out.println(y);
			}
	}

Saída: 
5
10.0

* A variável y é do tipo double, então o resultado foi convertido para o tipo double. Assim, por padrão imprime 10.0 em vez de 10.
* Uma boa prática é, para dígitos declarados como double, indicar valores sempre com o ".0"
		
		double b = 6.0;
		
* Para float, usaríamos a terminação f

		float b = 6f;
* No caso da divisão de números do tipo int, a divisão não considera a parte flutuante, como podemos ver a seguir:

		import  java.util.Locale;
			public  class Main {
				public  static  void main(String[] args) {
					int  a, b;
					double  resultado;
					a = 5;
					b = 2;
					resultado = a / b;
					System.out.println(resultado);
				}
		}

Saída: 2.0

* Para isso utilizamos o **casting**.
	
		import  java.util.Locale;
			public  class Main {
				public  static  void main(String[] args) {
					int  a, b;
					double  resultado;
					a = 5;
					b = 2;
					resultado = (double) a / b;
					System.out.println(resultado);
				}
		 }
Saída: 2.5

* Fazemos não só para operações: caso quisermos atribuir um valor de uma variável double a uma variável inteira, é recomendável utilizar o casting para que não percamos nenhuma informação.

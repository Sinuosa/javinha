# Comandinhos: Java
* Classe, ex: public class Main {}
* Funções, ex: public static void main(String[] args){}
* Comando para printar com quebra de linha: System.out.println("eai");
* Comando para printar sem quebra de linha: System.out.print("eai");
* Operadores e precedências: +, -, *, /, %
* Variáveis. Possuem nome, tipo, valor e endereço: byte, short, int, long, float, double, char, boolean, **string** 
	* Não pode começar com dígito, nem ter espaços em branco ou acentos. Recomenda-se Camel Case.


      `<tipo> <nome> = <valor>;`

      `int idade = 25;`

![Variaveis](https://i.ibb.co/5G50b2J/tabela-variavel.png)

* Escrever o conteúdo de uma variável
 ` int y = 32; System.out.println(y); `
* Escrever ponto flutuante
`double x = 10.35784; System.out.printf(x);`
Saída: 10.35784
* Para determinar quantas casas decimais
`double x = 10.35784; System.out.printf("%.2f", x);`
Saída: 10,36
	* printf pega o formato por padrão do computador que estamos usando, por isso a vírgula.  Pega o separador de decimais da língua que estamos utilizando. Para alterar isso:
	`import java.util.Locale; Locale.setDefault(Locale.US);` 
* Concatenação
`System.out.println("Resultado = " + x + " metros");`
* Concatenar vários elementos com o printf
`System.out.printf("Resultado = %.2f metros", x);`
	* %f para ponto flutuante, %d para inteiro, %s para texto
	`System.out.printf("%s tem %d anos e corre %f km por dia", nome, idade, x);`
* Quebras de linha:
`System.out.printf("Resultado = %.2f metros\n", x);`
`System.out.printf("Resultado = %.2f metros%n", x);`

Código praticando após o vídeo:

	import java.util.Locale;
 	public  class Main {
		public  static  void main(String[] args) {
			String nome = "Gabi";
			int  idade = 24;
			double  x = 10.35784;
			
			Locale.setDefault(Locale.US);
			System.out.println(x);
			System.out.printf("%.2f\n", x);
			//System.out.printf("Resultado = %.2f metros", x);
			System.out.printf("%s tem %d anos e corre %f por dia", nome, idade, x);
		}
	}
  
  [Exercício 00](https://github.com/Sinuosa/javinha/blob/main/ex00.md)

# Restrições para nomes
* Uma variável não pode começar com dígito. Use letras ou _
* Não use acentos ou til em variáveis 
* Não use espaços em branco em variáveis
* Como recomendação, utilize nomes que tenham significado
* Por convenção, Camel Case é uma opção para pacotes, atributos, métodos, variáveis e parâmetros. Ex: idadeDaMae
* Por convenção, Pascal Case é uma opção para classes. Ex: ProductService

# Operadores bitwise


| Operador | Significado |
|--|--|
| & | operação "E" bit a bit |
| \| | operação "OU" bit a bit |
| ^ | Operação "OU-exclusivo" bit a bit |

* Na prática:

![exemplo](https://i.ibb.co/5cw0gN6/Sem-t-tulo.png)

* Aplicações: programação de baixo nível, microcontrolador, programação de interface com rede, arduíno...
    * Exemplo: Temos que programar uma interface de rede e verificar um bit do endereço da rede
      * Criação de máscaras: zero em todos os bits exceto pelo bit a ser testado    

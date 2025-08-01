public class MyClass {
  public static void main(String args[]) {

    //variaveis
    int idade = 24; //numeros inteiros
    double salario = 1.75; //numeros quebrados
    char letra = 'j'; //letra ou simbolo
    boolean estudante = true; //verdadeiro ou falso
    //true or false
    String nome = "akane"; //texto
    
    System.out.println(idade);
    System.out.println("minha idade é " + idade);
    System.out.println("o salaro é " + salario);
    System.out.println("a letra é " + letra);
    System.out.println("estuda? " + estudante);
    System.out.println("Eu amo o " + nome);
    
    //operadores aritmeticos
    int num1 = 5;
    int num2 = 3;
    int soma = num1 + num2;
    int sub = num1 - num2;
    int mult = num1 * num2;
    double div = num1 / num2;
    System.out.println("soma " + soma);
    System.out.println("subtração " + sub);
    System.out.println("divisão " + div);
    System.out.println("multiplicação " + mult);
    
    /*calculo de area de um retangulo*/
    /*largura * comprimento*/
    double largura = 7.5;
    double comprimento = 3.0;
    double area = largura * comprimento;
    System.out.println("Area: " + area);
    
    //calculo do desconto 
    double valor = 100;
    double desconto = 15;
    double valordisc = valor * ( desconto / 100);
    double valorfinal = valor - valordisc;
    System.out.println("a pagar " + valorfinal);
  }
}
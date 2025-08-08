package primeiroProjeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		System.out.println("akane");
		
		//declaração de variavel
		int idade = 24;
		double salario = 2000.50;
		char letra = 'j';
		String nome = "juliana";
		boolean chuva = false;
		
		System.out.println(idade);
		System.out.println("o salário é: " + salario);
		System.out.println("letra: " + letra);
		System.out.println("o nome é: " + nome);
		System.out.println(chuva);
		
		//operadores
		int num1 = 10;
		int num2 = 3;
		double soma = num1 + num2;
				double sub = num1 - num2;
				double div = num1 / num2;
				double multi = num1 * num2;
				double resto = num1 % num2;
				
				System.out.println("soma: "+ soma);
				System.out.println("subtração: "+ sub);
				System.out.println("divisão: "+ div);
				System.out.println("mutiplicação: "+ multi);
				System.out.println("resto: "+ resto);
				
				//entrada de dados
				Scanner scanner = new Scanner(System.in);
				System.out.println("qual é o seu nome? ");
				String nome1 = scanner.nextLine();
				System.out.println("ola "+ nome1);
				
				//soma de dois numeros
				int numero1;
				int numero02;
				System.out.println("informe um número: ");
				numero1 = scanner.nextInt();
				System.out.println("informe outro número: ");
				numero02 = scanner.nextInt();
				int soma1 = numero1 + numero02;
				System.out.println("o resultado é: " +soma1);
				
				/*peça o ano de nascimento do usuario e mostre quantos anos ele tem*/
				int data;
				int ano = 2025;
				System.out.println("informe seu ano de nascimento: ");
				data = scanner.nextInt();
				double idd = ano - data;
				System.out.println("você tem " + idd + "anos!");
	}

}

package primeiroProjeto;

import java.util.Scanner;

public class suitcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("escolha um numero e veja uma cor: ");
		int numero = scanner.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("vermelho");
			break;
		case 2:
			System.out.println("azul");
			break;
			default:
				System.out.println("valor incorreto");
		}
		
		
		
		System.out.println("qual categoria você pertence?");
		String categoria = scanner.next();
		switch(categoria.toUpperCase()) {
		case "A":
			System.out.println("infantil");
			break;
		case "B":
		System.out.println("juvenil");
		default:
			System.out.println("categoria incorreta");
		}
		
		//---------------------------------------------------------------//
		
		System.out.println("escolha a operação matematica de dois numeros");
		String operacao = scanner.next();
		switch(operacao) {
		case "+":
			int adicao = 5+5;
			System.out.println(adicao);
			break;
		case "-":
			int subtracao = 5-5;
			System.out.println(subtracao);
		break;
		case "*":
			int mult = 5-5;
			System.out.println(mult);
		break;
		case "/":
			int div = 5-5;
			System.out.println(div);
		break;
		default:
		System.out.println("operação icorreta");
		break;
		}
	}

}

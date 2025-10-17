package primeiroProjeto;

import java.util.Scanner;

public class aulinha {

	public static void main(String[] args) {
		mensagem();
		linha();
		linha();
		linha();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("qual sua idade");
		int idade = sc.nextInt();
		classificacao(idade);
		
		// TODO Auto-generated method stub

	}
	public static void mensagem() {
		System.out.println("função sem retorno");
	}
	public static void linha() {
		System.out.println("----------------------");
	}
	public static void contagem() {
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
	}
	public static void classificacao(int idade) {
		if(idade >= 18) {
			System.out.println("maior de idade");
		}else {
			System.out.println("menor de idade");
		}
	}

}

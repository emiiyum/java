package primeiroProjeto;

import java.util.Scanner;

public class nsei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("informe uma palavra: ");
		String resposta = scanner.next();
		
		if(resposta.equalsIgnoreCase("Java"));{
		System.out.println("acertou");
		}
		
		System.out.print("informe uma cor: ");
		String cor = scanner.next();
		if(cor.equalsIgnoreCase("verde")) {
			System.out.println("cor verde");
		} else if (cor.equalsIgnoreCase("vermelho")) {
			System.out.println("cor vermelha");
		} else {
			System.out.println("cor errada");
		}

	}

}

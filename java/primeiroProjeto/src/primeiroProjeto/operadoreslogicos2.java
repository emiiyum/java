package primeiroProjeto;

import java.util.Scanner;

public class operadoreslogicos2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("qual sua idade?");
		int idade = scanner.nextInt();
		System.out.println("tem titulo de eleitor?");
		String resposta = scanner.next();
		
		if(idade >= 16 && resposta.equalsIgnoreCase("sim")) {
			System.out.println("pode votar");
		}else {
			System.out.println("não pode votar");
		}
		
		int numero; 
		System.out.println("informe um numero");
		
		/*para participar de um workshop precisa ter idade entre 20 e 40 anos
		 * e possuir experiencia. se as informações forem verdadeiras exiba
		 * "inscrição aceita", senão "inscrição rejeitada" */
		System.out.println("qual sua idade? ");
		int idad = scanner.nextInt();
		System.out.println("você tem experiencia?");
		String mano = scanner.next();
		if((idad > 20 && idad < 40) && mano.equalsIgnoreCase("sim")) {
			System.out.println("inscrição aceita");
		}else { 
			System.out.println("inscrição negada");
		}
		

	}

}

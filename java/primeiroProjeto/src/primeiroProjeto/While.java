package primeiroProjeto;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int numero = 1;
		while(numero <= 5) {
			System.out.println(numero);
			numero++; //+1
		}
		
		int numero2 = 5;
		while(numero2 >= 1) {
			System.out.println(numero2);
			numero2--; //-1
		}
		
		
		int soma = 0;
		int valor;
		int contador = 1;
		
		System.out.println("digite 3 numeros: ");
		while(contador <= 3) {
			valor = scanner.nextInt();
			soma += valor; 
			contador+=1;
		}
		System.out.println("a soma dos numeros é "+ soma);
		
		System.out.println("digite sair para sair do sistema");
		String resposta = scanner.next();
		
		while(!resposta.equalsIgnoreCase("sair")) {
			System.out.println("tente novamente");
			resposta = scanner.next();
		}
		System.out.println("você conseguiu sair");
		
		
		//------------------------------------------------------//
		
		System.out.println("digite um valor ");
		int valor2 = scanner.nextInt();
		int aux = 1;
		while(aux <= valor2) {
			System.out.println(aux);
			aux++;
			
			//-------------------------------------------------------//
			System.out.println("digite um numero");
			int sete = scanner.nextInt();
			while(sete != 7) {
				System.out.println("tente outro número");
				sete = scanner.nextInt();
			}
			System.out.println("sete");
		}
		
		
	}

}

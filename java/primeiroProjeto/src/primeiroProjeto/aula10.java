package primeiroProjeto;

import java.util.Scanner;

public class aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int num1 = 10;
		do {
			System.out.println(num1);
			num1++;
		}while(num1<=30);
		
		int num2;
		do {
			System.out.println("me diga um numero");
			num2 = scanner.nextInt();
		}while(num2 != 5);
		
		int pesomala;
		System.out.println("qual o peso da mala?");
		pesomala = scanner.nextInt();
		do {
			System.out.println("peso excedido, tente novamente");
			pesomala =scanner.nextInt();
		}while(pesomala > 23);
		System.out.println("pode passar.");
		
		int livropag;
		int dias = 0;
		int total = 0;
		do {
		System.out.println("quantas paginas vc leu hoje?");
		livropag = scanner.nextInt();
		dias +=1;
		total += livropag;
		}while(dias<= 7);
		System.out.println(total);
		
		int senha = 666;
		System.out.println("digite a senha:");
		int tentativadesenha = scanner.nextInt();
		do {
			System.out.println("senha incorreta tente novamente: ");
			tentativadesenha = scanner.nextInt();
		}while(tentativadesenha !=senha);
	}
}

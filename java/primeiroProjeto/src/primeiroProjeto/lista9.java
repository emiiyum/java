package primeiroProjeto;

import java.util.Scanner;

public class lista9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		//1-contador
		
		int numero = 1;
		while (numero <=10) {
			System.out.println(numero);
			numero++;
		}
		
		//2-contagem regressiva
		
		int numer = 10;
		while(numer >= 1) {
			System.out.println(numer);
			numer--;
		}
		
		//3-sequencia numerica
		
		int nume = 0;
		while(nume <= 100) {
			System.out.println(nume);
			nume += 5;
		}
		
		//4-mostrando mensagem
		int socorro = 1;
		while(socorro<=5) {
			System.out.println("eu gosto do java vei");
			socorro++;
		}
		
		//5-soma de numeros digitados
		
		int soma = 0;
		int valor;
		int contador = 1;
		
		System.out.println("digite 5 numeros: ");
		while(contador <= 5) {
			valor = scanner.nextInt();
			soma += valor; 
			contador+=1;
		}
		System.out.println("a soma é " + soma);
		
		//6-validação de senha
		System.out.println("digite a senha");
		String senha = scanner.next();
		
		while(!senha.equalsIgnoreCase("1234")) {
			System.out.println("tente novamente");
			senha = scanner.next();
		}
		System.out.println("senha correta");
			
		
		//7- contagem regressiva
		
		int conta = 1;
		System.out.println("fala um numero");
		int num = scanner.nextInt();
		while(num >= conta) {
			num-=1;
		}
		
}
}
package primeiroProjeto;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int cont = 1; cont <= 10; cont++) {
		System.out.println(cont);	
		}
		System.out.println("------------------------");
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("ate que numero você quer que eu conte?");
		int numero = scanner.nextInt();
		for(int vez = 1; vez <= numero; vez++) {
			System.out.println(vez);
		}
		
		System.out.println("------------------------");
		for(int i = 0; i <=5; i++) {
			System.out.println("escolha umnumero: ");
			int numero2 = scanner.nextInt();
			int div = numero2 % 2;
			if(div ==0) {
				System.out.println("o numero é par");
			}else {
				System.out.println("o numero é impar");
			}
			
			System.out.println("------------------------");
			int soma = 0;
			for(int ii = 1; ii <=3; ii++) {
				System.out.println("informe um valor: ");
				int valor = scanner.nextInt();
				soma = soma + valor;
			}
			System.out.println("a soma é: " + soma);
		}
		
		
	}

}

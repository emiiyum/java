package primeiroProjeto;

import java.util.Scanner;

public class lista11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		int contagem = 1;
		do {
			System.out.println(contagem);
			contagem = contagem +2;
		}while (contagem <= 31);
		
		
		int teste;
		do {
			System.out.println("escreva numero");
			teste = scanner.nextInt();
		}while (teste <= 100);
		
		int jair;
		do {
			System.out.println("1- continuar 2-encerrar");
			jair = scanner.nextInt();
			if (jair == 1) {
				System.out.println("Você escolheu continuar!");
				System.out.println("1- continuar 2-encerrar");
				jair = scanner.nextInt();
			}else if(jair == 2) {
				System.out.println("encerrado");
			}else {
				System.out.println("invalido");
			}
		}while (jair == 1);
		
		
		int cont = 1;
		int nao;
		
		do {
			System.out.println("digita numero ai");
			nao = scanner.nextInt();
			if(nao <= 10) {
				System.out.println("tipo A");
			}if(nao <= 20) {
				System.out.println("tipo B");
			}else {
				System.out.println("fora da categoria");
			} cont++;
		}while (cont <=5);
	}
	
	
	    int aaa;
	    do{
	    	System.out.println("qual a temperatura do forno?");
	    
	    	aaa= scanner. 
	    			
	    }
	    }
	    

}

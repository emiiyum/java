package primeiroProjeto;

import java.util.Scanner;

public class lista12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// exercicio 1
				int conta = 10;
				do{
				    System.out.println(conta);
				    conta = conta + 1;
				}while(conta <= 30);
				
				//exercicio 2
				int numero;
				do{
				    System.out.println("me diga um numero");
				    numero = scanner.nextInt();
				}while(numero != 5);
				
				//exercicio 3
				
				int pesomala;
				do{
				    System.out.println("qual o peso da mala ");
				    pesomala = scanner.nextInt();
				    System.out.println("peso excedido");
				}while(pesomala > 23 );
				
				//exercicio 4
				
				int leitura = 1;
				int paginas;
				int pagpdia = 0;
				do{
				    System.out.println("quantas paginas foram lidas hoje");
				    paginas = scanner.nextInt();
				    
				    pagpdia = pagpdia + paginas;
				    leitura++;
				}while(leitura <=7 );
				System.out.println(pagpdia);
				
				//exercicio 5
				
				int senha;
				do{
				    System.out.println("digite a senha (3 digitos) ");
				    senha = scanner.nextInt();
				    System.out.println("senha incorreta");
				}while( senha != 321);
				
				//exercicio 6
				
				int combustivel;
				do{
				    System.out.println("quantos litros de combustivel");
				    combustivel = scanner.nextInt();
				    if(combustivel <= 10){
				    System.out.println("quantidade insuficiente");
				    }
				}while(combustivel <= 10 );
				if(combustivel > 10){
				    System.out.println("combustivel suficiente");
				}
				
				//exercicio 7 meu braço ja ta doendo
				
				int km;
				int kmpercorrido = 0;
				do {
					System.out.println("quantos km ja foram percorridos");
						km = scanner.nextInt();
					kmpercorrido = kmpercorrido + km;
				}while(km <=0);
				System.out.println("A kilometragem final foi "+ kmpercorrido);


	}

}

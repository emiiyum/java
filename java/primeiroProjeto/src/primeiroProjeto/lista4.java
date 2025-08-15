package primeiroProjeto;

import java.util.Scanner;

public class lista4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//licao 1 
		int idad;
		System.out.println("qual a idade? ");
		idad = scanner.nextInt();
		if (idad >= 18) {
			System.out.println("tens [" + idad +"] e és maior de idade:");
		}else{
			System.out.println("tens [" + idad + "] e és menor de idade:");
		}
		
		//licao 2
		int num1;
		int num2;
		System.out.println("insiras um número inteiro: ");
		num1 = scanner.nextInt();
		System.out.println("insiras outro número inteiro: ");
		num2 = scanner.nextInt();
		if( num1 > num2 ) {
			System.out.println("o primeiro número é maior.");
		} else {
			System.out.println("o primeiro número ´menor.");
		}
		
		//licao 3
		double nota;
		System.out.println("insiras uma nota: ");
		nota = scanner.nextDouble();
		if (nota > 7) {
			System.out.println("aprovado: sua nota foi [" + nota + "]");
		} else {
			System.out.println("reprovado: sua nota foi [" + nota + "]");
		}
		
		//licao 4
		int nhumh;
		System.out.println("me diga um numero: ");
		nhumh = scanner.nextInt();
		if(nhumh > 0) {
			System.out.println("o numero é positivo");
		} else {
			System.out.println("o numero é negativo");
		}
		
		//licao 5
		double km;
		System.out.println("quantos km? ");
		km = scanner.nextDouble();
		if(km < 50) {
			System.out.println("o frete é R$[10,00]");
		} else {
			System.out.println("o frete é R$[" + (km * 0.5) + "]");
		}
		
		//licao 6
		int sera;
		System.out.println("tenta um numero: ");
		sera = scanner.nextInt();
		if(sera == 10) {
			System.out.println("o numero é 10 :D ");
		} else {
			System.out.println("o numero não é 10 :( ");
		}
		
		//licao 7
		String nope;
		System.out.println("tu é associado? ");
		nope = scanner.next();
		if(nope != "blalbla") {
			System.out.println("você tem desconto.");
		}
		
	}

}

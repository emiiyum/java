package primeiroProjeto;

import java.util.Scanner;

public class lista6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//exercicio 1
		System.out.println("fala um numero: ");
		int numero = scanner.nextInt();
		if(numero >= 10 && numero <= 20) {
			System.out.println("numero dentro do intervalo");
		} else {
			System.out.println("numero fora do intervalo");
		}
		
		//exercicio 2 
		System.out.println("me diga a sua idade");
		int idade = scanner.nextInt();
		System.out.println("você tem convite? (sim/não) ");
		String convite = scanner.next();
		if(idade >= 18 && convite.equalsIgnoreCase("sim") ) {
			System.out.println("pode entrar.");
		}else {
			System.out.println("não vai entra não");
		}
		
		//exercicio 3
		System.out.println("me diga sua idade: ");
		int idad = scanner.nextInt();
		if(idad <=12 && idad >= 60) {
			System.out.println("categoria especial.");
		}else {
			System.out.println("categoria normal.");
		}
		
		//exercicio 4
		System.out.println("diga o valor do prouto: ");
		int valor = scanner.nextInt();
		System.out.println("qual será a forma de pagamento? (cartão/avista) ");
		String metodo = scanner.next();
		if(valor > 100 && metodo.equalsIgnoreCase("avista")) {
			System.out.println("você recebeu 10% de desconto");
		}else {
			System.out.println("nõ haverá desconto");
		}
		
		//exercicio 5
		System.out.println("qual a temperatura? ");
		double temperatura = scanner.nextDouble();
		System.out.println("tem algum sintoma? (sim/não)");
		String sintoma = scanner.next();
		if(temperatura >= 38 && sintoma.equalsIgnoreCase("sim")) {
			System.out.println("recomenda-se procurar um médico");
		}else {
			System.out.println("sem sinais preocupantes");
		}
		
		//exercicio 6 
		System.out.println("qual sua idade? ");
		int ida = scanner.nextInt();
		System.out.println("você é brasileiro? (sim/não");
		String br = scanner.next();
		if(ida >= 16 && br.equalsIgnoreCase("sim") ) {
			System.out.println("pode votar");
		}else { 
			System.out.println("não pode votar");
		}
		
		//exercicio 7
		System.out.println("qual a quantidade de horas? ");
		int horas = scanner.nextInt();
		System.out.println("quantos dias de falta?");
		int dias = scanner.nextInt();
		if(horas > 20 && dias < 5) {
			System.out.println("ganhará bônus");
		}else {
			System.out.println("não ganhará bonus");
		}
		
		//exercicio 8
		System.out.println("qual sua idade? ");
		int id = scanner.nextInt();
		System.out.println("tem carteira de motorista?(sim/não)");
		String carta = scanner.next();
		if(id >= 18 && carta.equalsIgnoreCase("sim")) {
			System.out.println("pode dirigir");
		}else {
			System.out.println("não pode dirigir");
		}
		
		//exercicio 9
		System.out.println("qual sua nota media?(0-10) ");
		int nota = scanner.nextInt();
		System.out.println("qual a sua frequencia? ");
		int frequencia = scanner.nextInt();
		if(nota >= 8 && frequencia >= 80) {
			System.out.println("recebe bolsa");
		}else {
			System.out.println("não recebe bolsa");
		}
		
		//exercicio 10
		System.out.println("qual a temperatura?");
		int temp = scanner.nextInt();
		System.out.println("e a humidade? ");
		int humidade = scanner.nextInt();
		if(temp < 18  && temp <26 && humidade >= 60) {
			System.out.println("necessaria");
		} else {
			System.out.println("climatização não necessari");
		}
		
	}

}

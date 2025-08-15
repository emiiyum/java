package primeiroProjeto;

import java.util.Scanner;

public class lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//exercicio 1
		int numero1;
		int numero2;
		System.out.println("informe um numero: ");
		numero1 = scanner.nextInt();
		System.out.println("informe outro numero: ");
		numero2 = scanner.nextInt();
		int soma = numero1 + numero2;
		int sub = numero1 - numero2;
		int multi = numero1 * numero2;
		int div = numero1 / numero2;
		System.out.println("a soma deles é: " + soma);
		System.out.println("a subtração deles é: " + sub);
		System.out.println("a multiplicação deles é; " + multi);
		System.out.println("a divisão deles é: " + div);
		
		//exercicio 2
		int ceusioursomanco;
		System.out.println("quantos graus em Celsius estão? ");
		ceusioursomanco = scanner.nextInt();
		double fahrendfgdf = (ceusioursomanco * 1.8) + 32;
		System.out.println("a temperatura em fahrenheit é: " + fahrendfgdf);
		
		//exercicio3
		double money;
		System.out.println("informe um valor em dolares: ");
		money = scanner.nextDouble();
		double dindin = 5.70 / money;
		System.out.println("o valor do dolar em reais será: " + dindin);
		
		//exercicio 4
		double altura;
		System.out.println("me diga a altura para seu retangulo: ");
		altura = scanner.nextDouble();
		double base;
		System.out.println("agora me informe a base: ");
		base = scanner.nextDouble();
		double area = base * altura;
		System.out.println("a area do retangulo é: " + area);
		
		//exercicio 5
		int idad;
		System.out.println("quantos anos você tem? ");
		idad = scanner.nextInt();
		int meis = idad / 12;
		System.out.println("sua idade em meses é: " + meis);
		
		//exercicio 6
		double minus;
		System.out.println("quantos minutos? ");
		minus = scanner.nextDouble();
		double secun = minus / 60;
		System.out.println("os minutos em segundos é: " + secun);
		
		//exercicio 7
		double preco;
		System.out.println("preço do produto: ");
		preco = scanner.nextDouble();
		int products;
		products = scanner.nextInt();
		double all = products * preco;
		System.out.println("o preço total é de: " + all);
		
		//exercicio 8
		double totaldaconta ;
		System.out.println("qual o valor total da conta? ");
		totaldaconta = scanner.nextDouble();
		int dinheironeh;
		System.out.println("qual a quantidade comprada? ");
		dinheironeh = scanner.nextInt();
		double tudin = totaldaconta / dinheironeh;
		System.out.println("o valor a ser pago por cada um é: " + tudin);
		
		//exercicio 9
		double comprar;
		System.out.println("valor da compra: ");
		comprar = scanner.nextDouble();
		double valorpago;
		System.out.println("valor pago: ");
		valorpago = scanner.nextDouble();
		double troco = comprar - valorpago;
		System.out.println("valor troco: " + troco);
		
	}
}

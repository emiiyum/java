package primeiroProjeto;

import java.util.Scanner;

public class lista3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		double numero;
		double numer;
		System.out.println("digite um numero");
		numero = scanner.nextDouble();
		System.out.println("digite outro numero");
		numer = scanner.nextDouble();
		double soma = numero + numer;
		System.out.println("a soma é " + soma);
		
		
		double mano;
		double mann;
		System.out.println("digite numero");
		mano = scanner.nextDouble();
		System.out.println("fala outro numero");
		mann = scanner.nextDouble();
		double div = mano / mann;
		double resto = mano % mann;
		System.out.println("a divisão é " + div + " e o resto é " + resto);
		
		
		double avenidabrasil;
		double xiquexiquebahia;
		double caminnhaodogas;
		System.out.println(" digita um numero ");
		avenidabrasil = scanner.nextDouble();
		System.out.println("digita outro ");
		xiquexiquebahia = scanner.nextDouble();
		System.out.println("ultimo prometo ");
		caminnhaodogas = scanner.nextDouble();
		double perimetro = avenidabrasil + xiquexiquebahia + caminnhaodogas;
		System.out.println("o perimetro é " + perimetro );
		
		double conta;
		double perc;
		System.out.println("qual o valor da conta: ");
		conta = scanner.nextDouble();
		System.out.println("qual a porcentagem da gorjeta? ");
		perc = scanner.nextDouble();
		double gorjeta = conta*(perc/100);
		double total = gorjeta + conta;
		System.out.println("o valor final é R$" + total);
		
		
		
		double ray;
		System.out.println("qual o raio do seu circulo ");
		ray = scanner.nextDouble();
		double area = 3.14159*(ray*ray);
		System.out.println("a area do circulo é " + area);
		
		
		int ano;
		int mes;
		int dia;
		System.out.println("quantos anos vc tem ");
		ano = scanner.nextInt();
		System.out.println("quantos meses vc tem");
		mes = scanner.nextInt();
		System.out.println("uantos dias vc tem");
		dia = scanner.nextInt();
		int valor = (ano*365) + (mes*30) + dia;
		System.out.println("sua idade em dias é" + valor);
		
		
		double trabalho;
		double valor_hora = 20;
		double desconto = 0.10;
		System.out.println("quantas horas de trabalho?");
		trabalho = scanner.nextDouble();
		double salario_bruto = trabalho * valor_hora;
		double imposto = salario_bruto * desconto;
		double saladaliquida = salario_bruto - imposto;
		System.out.println("o total recebido é " + saladaliquida);
	}
}

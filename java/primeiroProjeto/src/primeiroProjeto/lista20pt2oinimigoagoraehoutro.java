package primeiroProjeto;

import java.util.Scanner;

public class lista20pt2oinimigoagoraehoutro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		int cinco = scanner.nextInt();
		divisivel(cinco);
		System.out.println("DIGITE O SEU NOME:");
		String voutar = scanner.next();
		thiau(voutar);
		System.out.println("Digite o seu nome:");
		String sonic = scanner.next();
		System.out.println("Digite o seu sobrenome");
		String mauro = scanner.next();
		emon(sonic, mauro);
		System.out.println("Escreva um numero: ");
		int varificar = scanner.nextInt();
		virificacao(varificar);
		System.out.println("Há quantos kilometros por hora você esta?  ");
		int velocimetro = scanner.nextInt();
		veloicidade(velocimetro);
		System.out.println("Qual e o dia da semana: ");
		String homencalendario = scanner.next();
		semanal(homencalendario);
		System.out.println("Qual a situação do estoque: ");		
		int ssssss = scanner.nextInt();
		estoque(ssssss);
		
	}public static void divisivel(int num){
		if (num%5 ==0) {
			System.out.println((num/5));
		}else {
			System.out.println("Não e divisivel por cinco");
		}
	}public static void thiau(String nome) {
		System.out.println("Até logo "+ nome);
	}public static void emon(String no,String me) {
		System.out.println(no+" " +me);
	}public static void virificacao(int cem) {
		if(cem > 100) {
			System.out.println("É maior que cem!!");
		}else {
			System.out.println("É menor que cem");
		}
	}public static void veloicidade(int veloz) {
		if (veloz <40) {
			System.out.println("Lenta"); 
		}else if(veloz >40 && veloz <80) {
			System.out.println("Normal");
		}else {
			System.out.println("Rapida");
		}
	}public static void semanal(String semana) {
		System.out.println("Tenha um ótima "+semana);
	}public static void estoque(int estocado) {
		if(estocado >=10) {
			System.out.println("Estoque suficiente.");
		}else if(estocado < 10 && estocado >5) {
			System.out.println("Estoque baixo");
		}else {
			System.out.println("estoque critico.");
		}
	}
	}
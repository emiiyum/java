package primeiroProjeto;

import java.util.Scanner;

public class lista5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//exercicio 1
		int idad;
		System.out.println("informe sua idade: ");
		idad = scanner.nextInt();
		if(idad < 12) {
			System.out.println("criança");
		}else if (idad < 17) {
			System.out.println("adolescente");
		}else if (idad < 59) {
			System.out.println("adulto");
		}else if(idad >= 60) {
			System.out.println("idoso");
		}
		
		//exercicio 2
		int temp;
		System.out.println("qual a temperatura em celsiu? ");
		temp = scanner.nextInt();
		if(temp < 10) {
			System.out.println("muito frio");
		}else if (temp < 20) {
			System.out.println("frio");
		}else if(temp < 30) {
			System.out.println("agradável");
		}else if(temp > 30) {
			System.out.println("muito quente");
		}
		
		//exercicio 3
		double nota;
		System.out.println("informe sua nota: ");
		nota = scanner.nextDouble();
		if(nota > 90) {
			System.out.println("A");
		}else if(nota > 80) {
			System.out.println("B");
		}else if(nota > 70) {
			System.out.println("C");
		}else if(nota > 60) {
			System.out.println("D");
		}else if(nota < 60) {
			System.out.println("F");
		}
		
		//exercicio 4
		System.out.println("digite uma senha: ");
		String senha = scanner.next();
		if(senha.equals("admin")) {
			System.out.println("acesso permitido");
		}else {
			System.out.println("acesso negado");
		}
		
		//exercicio 5
		System.out.println("fala um nome aí: ");
		String noe1 = scanner.next();
		System.out.println("fala outro nome aí: ");
		String noe2 = scanner.next();
		if(noe1.equalsIgnoreCase(noe2)) {
			System.out.println("os nomes são inguais");
		}else {
			System.out.println("os nomes não são inguais");
		}
		
		//exercicio 6 
		System.out.println("me diz uma cor aí: ");
		String cor = scanner.next();
		if(cor.equalsIgnoreCase("azul")) {
			System.out.println("boa escolha!");
		}else if(cor.equalsIgnoreCase("vermelho")) {
			System.out.println("cor vibrante!");
		} else if(cor.equalsIgnoreCase("verde")) {
			System.out.println("cor da natureza!");
		}else { 
			System.out.println("cor não cadastrada.");
		}
		
		//exercicio 7
		System.out.println("informe uma letra: ");
		String letra = scanner.next();
		
		if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") 
				|| letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
			System.out.println("vogal");
		} else {
			System.out.println("consoante");
		}
	}

}

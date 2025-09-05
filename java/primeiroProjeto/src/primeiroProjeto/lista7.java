package primeiroProjeto;

import java.util.Scanner;

public class lista7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		//atividade 1
		System.out.println("me diga sua idade: ");
		int idade = scanner.nextInt();
		if(idade < 16 && idade > 70) {
			System.out.println("classificação especial");
		}else {
			System.out.println("classificação regular");
		}
		
		//atividade 2
		System.out.println("valor do produto: ");
		int valor = scanner.nextInt();
		System.out.println("qual a quantidade comprada: ");
		int quantidade = scanner.nextInt(valor);
		if(valor * quantidade > 200 && quantidade > 5) {
		System.out.println("você recebeu 15% de desconto");
		}else {
			System.out.println("sem desconto");
		}
		
		//exercicio 3
		System.out.println("qual sua frequencia cardiaca? ");
		int frequencia = scanner.nextInt();
		System.out.println("sente tonturas?");
		String tontura = scanner.next();
		if(frequencia >= 100 || tontura.equalsIgnoreCase("sim")) {
			System.out.println("procure um médico");
		}else {
			System.out.println("sem sinais de alerta");
		}
		
		//exercicio 4
		System.out.println("idade:");
		int idad = scanner.nextInt();
		System.out.println("é residente do estado? ");
		String residente = scanner.next();
		if((idad > 18 && idad < 30) && residente.equalsIgnoreCase("sim")) {
			System.out.println("elegivel para o concurso");
		}else {
			System.out.println("não elegivel para o concurso");
		}
		
		//exercicio 5
	    System.out.println("numero de projetos concluidos: ");
	    int projetos = scanner.nextInt();
	    System.out.println("numero de erros reportados: ");
	    int erros = scanner.nextInt();
	    if (projetos > 10 && erros < 3) {
	    	System.out.println("recompensa concedida");
	    }else {
	    	System.out.println("sem recompensa");
	    }
	    
	    //exercicio 6
	    System.out.println("idade: ");
	    int ida = scanner.nextInt();
	    System.out.println("possui passaporte?");
	    String passaporte = scanner.next();
	    if(ida >= 18 && passaporte.equalsIgnoreCase("sim")) {
	    	System.out.println("viagem autorizada");
	    }else {
	    	System.out.println("viagem não autorizada");
	    }
	    
	    //exercicio 7
	    System.out.println("nota final: ");
	    int nota = scanner.nextInt();
	    System.out.println("aulas assistidas: ");
	    int aulas = scanner.nextInt();
	    if(nota >= 70 && aulas >= 40) {
	    	System.out.println("aprovado");
	    }else {
	    	System.out.println("reprovado");
	    }
	    
	    //exercicio 8
	    System.out.println("umidade do solo: ");
	    int umidade = scanner.nextInt();
	    System.out.println("temperatura: ");
	    int temperatura = scanner.nextInt();
	    if(umidade < 30 && temperatura > 30) {
	    	System.out.println("irrigação necessaria");
	    }else {
	    	System.out.println("irrigação não necessaria");
	    }
	    
	    //exercicio 9
	    System.out.println("qual a idade:");
		int id = scanner.nextInt();
		System.out.println("possui experiencia previa? ");
		String experiencia = scanner.next();
		if((id>20 && id<40) && experiencia.equalsIgnoreCase("sim")) {
			System.out.println("incrição aceita");
		}else {
			System.out.println("inscrição negada");
		}
		
		
		
     }

}

package primeiroProjeto;

import java.util.Scanner;

public class auka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
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

package primeiroProjeto;

import java.util.Scanner;

public class lista15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] fruits = new String[5];
		for(int mano = 0; mano < 5; mano++) {
			System.out.println("diga uma fruta [" +mano+"]");
			fruits[mano] = scanner.next();
		}for(int onam = 0; onam < 5; onam++) {
			System.out.println(fruits[onam]);
		}
		
		int[] numeros = new int[10];
		for(int discordia = 0; discordia < 10; discordia++) {
			System.out.println("digite seu numero [" + discordia + "]");
			numeros[discordia] = scanner.nextInt();
		}for(int polyester = 0; polyester < 10; polyester++) {
			System.out.println(numeros[polyester]);
		}
		
		int[] valores = new int[7];
		for(int polyurethane = 0; polyurethane < 7; polyurethane++) {
			System.out.println("me diga numerios [" +polyurethane+"]");
			valores[polyurethane] = scanner.nextInt();
		}
		for(int n = 6; n >= 0; n--) {
			System.out.println(valores[n]);
		}

	}

}

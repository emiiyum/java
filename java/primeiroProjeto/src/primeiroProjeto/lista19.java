package primeiroProjeto;

import java.util.Scanner;

public class lista19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int valoisx = scanner.nextInt();
		valois(valoisx);
		int indanda = scanner.nextInt();
		indand(indanda);
		String scorro = scanner.next();
		wlcom(scorro);
		int tboan = scanner.nextInt();
		tabk(tboan);
		String promeu = scanner.next();
		String mano = scanner.next();
		palio(promeu, mano);
		
	}
	
	public static void valois(int valois2) {
		if(valois2 < 0) {
			System.out.println("negativo");
		}else if(valois2 == 0) {
			System.out.println("zero");
		}else {
			System.out.println("positivo");
		}
	}
	
	public static void indand(int indand2) {
		if(indand2 >= 18) {
			System.out.println("maior de idade");
		}else {
			System.out.println("menor de idade");
		}
	}
	
	public static void wlcom(String scorr) {
		System.out.println("bem vindo(a)"+ scorr);
	}
	
	public static void tabk(int taboa) {
		for(int i = 0; i<=10; i++) {
			System.out.println((taboa * i));
		}
	}
	
	public static void palio(String aerofolio, String mano) {
		System.out.println(aerofolio + mano);
	}
	
	public static void 

}

package primeiroProjeto;

import java.util.Scanner;

public class lista16array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		//1
		String[] everythingisblue = new String[6];
				for(int i=0; i<6; i++) {
					System.out.println("me diga uma cor");
					everythingisblue[i] = scanner.next();
				}
				for(int i=0; i<6; i++) {
					System.out.println(everythingisblue[i]);
				}
				
				
		//2
		double[] doubletrouble = new double[8];
		for(int i=0; i<8; i++) {
			System.out.println("me diga numeros decimais.");
			doubletrouble[i] = scanner.nextDouble();
		}
		for(int i=0; i<8; i++) {
			System.out.println(doubletrouble[i]);
		}
		
		
		//3
		int[] theperfectpair = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("fale um numero inteiro");
			theperfectpair[i] = scanner.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			int div = theperfectpair[i] % 2;
			if (div == 0){
				System.out.println(theperfectpair[i]);
			}
		}
		
		
		//4
		int[] tomaaquios50reais = new int[12];
		for(int i=0; i<12; i++) {
			System.out.println("fale um numero");
			tomaaquios50reais[i] = scanner.nextInt();
		}
		for(int i = 0; i <12; i++) {
			if(tomaaquios50reais[i]<50) {
				System.out.println(tomaaquios50reais[i]);
			}
		}
		
	
		
	}

}

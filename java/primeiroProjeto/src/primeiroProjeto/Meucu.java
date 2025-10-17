package primeiroProjeto;

import java.util.Scanner;

public class Meucu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		
		// 3
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

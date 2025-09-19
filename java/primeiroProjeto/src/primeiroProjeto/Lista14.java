package primeiroProjeto;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Lista14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		for(int num = 1; num <= 10; num++) {
		System.out.println(num);
		}
		
		System.out.println("------------------------");
		int meh = 0;
		for(int num2 = 1; num2 <=100; num2++){
			meh = num2 + meh;
			System.out.println(meh);
		}
		
		System.out.println("------------------------");
		System.out.println("1");
		for(int num3 = 1; num3 <= 20; num3++ ) {
			if(num3%2 ==0){
			System.out.println(num3);
			}
	}
		
		
		System.out.println("------------------------");
		System.out.println("me diga um numero inteiro");
		int numero = scanner.nextInt();
		for(int num4=1; num4 <= 10; num4++ ) {
			int mult = numero * num4;
			System.out.println(mult);
		}
		
		
		System.out.println("------------------------");
		int manosocorro = 0;
		for(int num5 = 1; num5 <= 50; num5++) {
			if(num5%3 == 0) {
				System.out.println(num5);
			}
		}
		
		System.out.println("------------------------");
		System.out.println("me diga um numero: ");
		int mano = scanner.nextInt();
		for(int num6 = 1; num6 <= mano; num6++) {
			if(num6%2 != 0) {
				System.out.println(num6);
			}
		}
		
		System.out.println("------------------------");
		int discordia;
		int mullt= 1;
		for(int num7 = 0; num7 <= 5; num7++) {
			System.out.println("fala um numero ae");
			discordia = scanner.nextInt();
			mullt = discordia*mullt;
		}System.out.println(mullt);
		
		System.out.println("------------------------");
		for(int num8 = 0; num8 <= 10; num8++) {
			System.out.println("quantos anos vc tem de empresa?");
			int data = scanner.nextInt();
			if(data > 10) {
				
				System.out.println("parabens, vc recebera o premio!!");
			}else { System.out.println("ainda não");
		}
		}
	
	
	}
}

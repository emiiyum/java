package primeiroProjeto;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int contador = 10;
		while(contador <= 30) {
			System.out.println(contador);
			contador++;
		}
		
		int num1 = 1;
		int num2 = 0;
		while (num1 <= 3) {
		System.out.println("diga um numero");
		int total = scanner.nextInt();
		num2 = total + num2;
		num1++;
		}System.out.println("o total é " + num2 );
		
		
		
		int num4 = 1;
		int num5 = 1;
		while(num4 <= 5) {
			System.out.println("diga um numero ");
			int odeioessamerda = scanner.nextInt();
			num5= odeioessamerda * num5;
			num4++;	
		}System.out.println("o resultado é " + num5);
		
		
		 int nao = 1;
		 System.out.println("fala um numero ");
		 int sla = scanner.nextInt();
		 while(sla >= nao) {
			 System.out.println(nao);
			 nao++;
		 }
		 
		 int nnnnk = 1;
		 int aaaaa = 1;
		 int chega = 0;
		 while(nnnnk <= 5) {
		 aaaaa = chega + aaaaa;
		 System.out.println(aaaaa);
		 nnnnk++;
		 aaaaa++;
		 
		 }
		 
		
		 int desgraca = 1;
		 int manoo;
		 int cabo;
		 System.out.println("diga um numero ");
		 manoo = scanner.nextInt();
		 while (desgraca <= 10) {
			 cabo = manoo * desgraca;
			 System.out.println(cabo);
			 desgraca++;
		 }
		
	}

}

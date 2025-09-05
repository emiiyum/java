package primeiroProjeto;

import java.util.Scanner;

public class lista8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("escolha um numero de 1 a 7(cada um será um dia da semana)");
		int numdia = scanner.nextInt();
		
		switch (numdia) {
		case 1:
			System.out.println("fim de semana");
			break;
		case 2:
			System.out.println("dia util");
			break;
		case 3:
			System.out.println("dia util");
			break;
		case 4:
			System.out.println("dia util");
			break;
		case 5:
			System.out.println("dia util");
			break;
		case 6:
			System.out.println("dia util");
			break;
		case 7: 
			System.out.println("fim de semana");
			break;
	    default:
	    	System.out.println("dia invalido");
		}
		
		//------------------------------------------------------------//
		
		System.out.println("codigo da bebida (1 = Café, 2 = Chá, 3 = Suco, 4 = Refrigerante): ");
		int bebidas = scanner.nextInt();
		
		switch (bebidas) {
		case 1:
			System.out.println("R$5,00");
			break;
		case 2:
			System.out.println("R$3,50");
			break;
		case 3:
			System.out.println("R$4,00");
			break;
		case 4:
			System.out.println("R$4,50");
			default:
				System.out.println("codigo invalido");
				break;
		}
		
		//----------------------------------------------------------------//
		
		System.out.println("codigo do veiculo ((1 = Carro, 2 = Moto, 3 = Caminhão): ");
		int veiculo = scanner.nextInt();
		
		switch (veiculo) {
		case 1:
			System.out.println("leve");
			break;
		case 2:
			System.out.println("motocicleta");
			break;
		case 3:
			System.out.println("pesado");
			break;
			default:
				System.out.println("veiculo invalido");
		break;
		}
		
		//----------------------------------------------------------------------//
		
		System.out.println("codigo do  plano (1 = Básico, 2 = Intermediário, 3 = Premium): ");
		int plano = scanner.nextInt();
		
		switch (plano) {
		case 1:
			System.out.println("Acesso limitado");
			break;
		case 2:
			System.out.println("Acesso padrão + suporte");
			break;
		case 3:
			System.out.println("Acesso total + suporte prioritário");
			break;
			default:
				System.out.println("plano invalido");
		break;
		}
		
		//------------------------------------------------------------------//
		
		
		System.out.println("escolha um mês em numeros: ");
		int nummes = scanner.nextInt();
		
		switch (nummes) {
		case 1:
			System.out.println("Verão");
			break;
		case 2:
			System.out.println("Verão");
			break;
		case 3:
			System.out.println("Outono");
			break;
		case 4:
			System.out.println("Outono");
			break;
		case 5:
			System.out.println("Outono");
			break;
		case 6:
			System.out.println("Inverno");
			break;
		case 7: 
			System.out.println("Inverno");
			break;
		case 8: 
			System.out.println("Inverno");
			break;
		case 9: 
			System.out.println("Primavera");
			break;
		case 10: 
			System.out.println("Primavera");
			break;
		case 11: 
			System.out.println("Primavera");
			break;
		case 12: 
			System.out.println("Verão");
			break;
	    default:
	    	System.out.println("mes invalido");
	    	break;
		}
		
		//------------------------------------------------------------------//
		
		System.out.println("qual o tipo de entrada? (1 = inteira, 2 = meia, 3 = VIP): ");
		int ingresso = scanner.nextInt();
		
		switch (ingresso) {
		case 1:
			System.out.println("R$50,00");
			break;
		case 2:
			System.out.println("R$25,00");
			break;
		case 3:
			System.out.println("R$100,00");
			break;
			default:
				System.out.println("ingresso invalido");
		break;
		}
		
		//----------------------------------------------------------------//
		
		System.out.println("codigo do  idioma (1 = Português, 2 = Inglês, 3 = Espanhol): ");
		int idioma = scanner.nextInt();
		
		switch (idioma) {
		case 1:
			System.out.println("Olá");
			break;
		case 2:
			System.out.println("Hello");
			break;
		case 3:
			System.out.println("Hola");
			break;
			default:
				System.out.println("idioma invalido");
		break;
		}
		
		//-------------------------------------------------------------------//
		
		System.out.println("codigo de nivel (1 = Usuário, 2 = Moderador, 3 = Administrador): ");
		int acesso = scanner.nextInt();
		
		switch (acesso) {
		case 1:
			System.out.println("acesso basico");
			break;
		case 2:
			System.out.println("acesso basico + edição");
			break;
		case 3:
			System.out.println("acesso total");
			break;
			default:
				System.out.println("acesso invalido");
		break;
		}
		
		//--------------------------------------------------------------------//
		
		System.out.println("codigo de pagamento (1 = Dinheiro, 2 = Cartão de Crédito, 3 = Pix): ");
		int pagamento = scanner.nextInt();
		
		switch (pagamento) {
		case 1:
			System.out.println("Pagamento em dinheiro confirmado");
			break;
		case 2:
			System.out.println("Pagamento com cartão processado");
			break;
		case 3:
			System.out.println("Pagamento via Pix realizado");
			break;
			default:
				System.out.println("metodo invalido");
		break;
		}
	}

}

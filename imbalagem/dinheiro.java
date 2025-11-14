package imbalagem;

public class dinheiro extends pagamento {
	
	@Override
	public void processarpagamento() {
		System.out.println("pagamento via dinheiro concluido");
	}
}

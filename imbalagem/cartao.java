package imbalagem;

public class cartao extends pagamento {

	@Override
	public void processarpagamento() {
		System.out.println("pagamento via cartao concluido");
	}
}

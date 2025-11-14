package imbalagem;

public class pix extends pagamento {
	
	@Override
	public void processarpagamento() {
		System.out.println("pagamento via pix concluido");
	}
}

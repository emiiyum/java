package imbalagem;

public class paga {

	public static void main(String[] args) {

		pagamento pagamento = new pagamento();
		pagamento pix = new pix();
		pagamento cartao = new cartao();
		pagamento dinheiro = new dinheiro();
		
		pagamento.processarpagamento();
		pix.processarpagamento();
		cartao.processarpagamento();
		dinheiro.processarpagamento();
	}

}

package imbalagem;

public class Padaria {

	public static void main(String[] args) {
		ProdutoPadaria pao = new Pao();
		ProdutoPadaria bolo = new bolo();
		ProdutoPadaria torta = new torta();
		ProdutoPadaria pro = new ProdutoPadaria();
		
		pro.preparar();
		pao.preparar();
		bolo.preparar();
		torta.preparar();
	}

}

package imbalagem;

public class come {

	public static void main(String[] args) {

		prato preco = new prato();
		prato piz = new pizza();
		prato las = new lasanha();
		prato sal = new salada();
		
		preco.calcularpreco();
		piz.calcularpreco();
		las.calcularpreco();
		sal.calcularpreco();
	}

}

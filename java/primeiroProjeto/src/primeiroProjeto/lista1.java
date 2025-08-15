package primeiroProjeto;

public class lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// exercicio 1
		int instalacao = 300;
		int limpeza = 150;
		double manutencao = 499.99;
		double custo = instalacao + limpeza + manutencao;
		System.out.println(custo);
		
		//exercicio 2
		int horas = 35;
		int trabaleo = 8;
		int encerramento = horas * trabaleo;
		System.out.println(encerramento);
		
		//exercicio 3
		int caixa = 27;
		int quantidade = 16;
		int bombom = caixa * quantidade;
		System.out.println(bombom);
		
		//exercicio 4
		int agua = 300;
		int caixas = 16;
		int caixinhas = agua * caixas;
		System.out.println(caixinhas);
		
		//exercicio 5
		int compras = 120;
		int venda = 80;
		int custos = 30;
		int comprinhas = 50;
		int faturamento = (compras + comprinhas) * custos;
		int camisas = compras - venda + comprinhas;
		System.out.println(faturamento + " e " + camisas);
		
		//exercicios 6
		int variavel = 67;
		int dobro = variavel * 2;
		int metade = variavel / 2;
		System.out.println(dobro + " e " + metade);
	}

}

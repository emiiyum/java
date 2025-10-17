package primeiroProjeto;

public class lista20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saldacao();
		retangulo();
		cinco();
		oito();
		meses();
	}
	public static void saldacao() {
		for(int i=0; i< 5; i++) {
			System.out.println("bom dia!");
		}
	}
	
	public static void retangulo() {
		for(int i=0; i <3; i++) {
			System.out.println("*****");
		}
	}
	
	public static void cinco() {
		for(int i=1; i <= 5; i++) {
			int cincao = i * 5;
			System.out.println(cincao);
		}
	}
	
	public static void oito() {
		for(int i=1; i <= 8; i++) {
			System.out.println(i);
		}System.out.println("pronto!");
	}
	
	public static void meses() {
		System.out.println("janeiro");
		System.out.println("fevereiro");
		System.out.println("março");
		System.out.println("abril");
		System.out.println("maio");
		System.out.println("junho");
	}

}

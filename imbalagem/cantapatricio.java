package imbalagem;

public class cantapatricio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		intrumento patricio = new intrumento();
		intrumento violso = new violao();
		intrumento bateria = new bateria();
		intrumento piano = new piano();
		
		patricio.tocar();
		violso.tocar();
		bateria.tocar();
		piano.tocar();
	}

}

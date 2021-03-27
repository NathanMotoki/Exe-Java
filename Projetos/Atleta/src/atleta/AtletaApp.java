package atleta;

public class AtletaApp {

	public static void main(String[] args) {
		Atleta n1 = new Atleta("Nathan", 65, 1.72);
		System.out.println("Nome: " + n1.getNome());
		System.out.println("Peso: " + n1.getPeso());
		System.out.println("Altura: " + n1.getAltura());
	}

}

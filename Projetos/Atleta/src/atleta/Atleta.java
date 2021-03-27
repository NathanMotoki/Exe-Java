package atleta;

public class Atleta {

	String nome;
	double peso, altura, imc;

	public Atleta(String nome, double peso, double altura) {
		setNome(nome);
		setPeso(peso);
		setAltura(altura);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String no) {
		if (!no.isEmpty()) {
			nome = no;
		}
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double pe) {
		if (pe > 0) {
			peso = pe;
		}
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double alt) {
		if (alt > 0) {
			altura = alt;
		}
	}
}

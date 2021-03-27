package aluno.java;

public class Aluno {
	String matricula, nome, genero;
	double cr;

	public void setMatricula(String m){

		if(!m.isEmpty()) {

			matricula = m;

		}

	}

	public String getMatricula(){

		return matricula;

	}

	public void setNome(String n){

		if(!n.isEmpty()) { 

			nome = n; 

		}

	}

	public String getNome(){

		return nome; 

	}

	public void setCr(double c){

		if (c >=0 && c<=10){ 

			cr = c;

		}

	}

	public double getCr(){

		return cr;

	}
	
	public void setGenero(String g) {
		if (!g.isEmpty()) {
			genero = g;
		}
	}
	
	public String getGenero() {
		
		return genero;
	}

	public void imprimir() {

		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome : " + nome);
		System.out.println("CR : " + cr);
		System.out.println("Genero : " + genero);

	}

}
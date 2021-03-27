package aluno.java;

public class AppAluno {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();

		aluno1.setMatricula( "1001" );
		aluno1.setNome( "Andre" );
		aluno1.setCr( 6.7 );
		aluno1.setGenero("Masculino");

		aluno2.setMatricula("1002");
		aluno2.setNome("Carlos");
		aluno2.setCr(7.6);
		aluno2.setGenero("Masculino");

		aluno3.setMatricula("1003");
		aluno3.setNome("Thais");
		aluno3.setCr(7.6);
		aluno3.setGenero("Feminino");

		aluno1.imprimir();
		aluno2.imprimir();
		aluno3.imprimir();
	}

}

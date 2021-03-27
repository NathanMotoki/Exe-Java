package login;

public class AppLogin {

	public static void main(String[] args) {
		
		Login lg1 = new Login("NathanMotoki", "naruto12");
		System.out.println("O seu NOME é: " + lg1.getNome());
		System.out.println( "O seu nivel de acesso é: " + lg1.getNivelAcesso() );

		Login lg2 = new Login( "kkk" , "000000" );
		System.out.println( "O seu nome é: " + lg2.getNome() );
		System.out.println( "O seu nivel de acesso é: " + lg2.getNivelAcesso() );
		
		Login lg3 = new Login( "pereira" , "246810" , 2000 );
		System.out.println( "O seu nome é: " + lg3.getNome());
		System.out.println( "O seu nivel de acesso é: " + lg3.getNivelAcesso() );
	}

}

package login;

public class Login {

	String nome, nomeLogin, senha;
	int nivelAcesso;

	public Login(String nomelg, String key) {

		setNivelAcesso(verificaLogin(nomelg, key));

	}

	public Login(String nl, String s, int token) {

		setNivelAcesso(verificaLogin(nl, s, token));

	}

	public int verificaLogin(String nolog, String sen, int tk) {

		int na = 0;

		if (nolog.equals("pereira") && sen.equals("246810") &&

				verificarToken(tk)) {

			na = 8;

			setNome("Maria");

		}

		else {

			na = 0;

		}

		return na;

	}

	public boolean verificarToken(int tk) {

		if (tk == 1000 || tk == 2000 || tk == 3000) {

			return true;

		}

		else {

			return false;

		}
	}

	public int verificaLogin(String nolog, String sem) {
		int na = 0;
		if (nolog.equals("NathanMotoki") && sem.equals("naruto12")) {

			na = 10;
			setNome("Nathan");

		} else {

			na = 0;

		}

		return na;
	}

	public String getNome() {

		return nome;

	}

	public void setNome(String no) {

		if (!no.isEmpty()) {
			nome = no;
		}

	}

	public String getNomeLogin() {

		return nomeLogin;

	}

	public void setNomeLogin(String nl) {

		if (!nl.isEmpty()) {
			nomeLogin = nl;
		}

	}

	public String getSenha() {

		return senha;

	}

	public void setSenha(String sen) {

		if (!sen.isEmpty()) {
			senha = sen;

		}
	}

	public int getNivelAcesso() {

		return nivelAcesso;

	}

	public void setNivelAcesso(int na) {

		if (na >= 0) {

			nivelAcesso = na;

		}

	}
}

package projeto.aprendendo.gerenciador.expetion;

public class ErroAutenticacao extends RuntimeException {

	public ErroAutenticacao(String msg) {
		super(msg);
	}

}

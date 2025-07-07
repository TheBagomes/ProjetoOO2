package excecoes;

public class DiasExcedidosException {
	private String mensagem;

    public DiasExcedidosException() {
        this.mensagem = "O número de dias excede o permitido para este usuário.";
    }

    public String getMensagem() {
        return mensagem;
    }

}

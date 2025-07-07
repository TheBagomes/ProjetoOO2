package excecoes;

public class HorarioIndisponivelException {
	private String mensagem;

    public HorarioIndisponivelException() {
        this.mensagem = "O espaço físico já está reservado nesse horário.";
    }

    public String getMensagem() {
        return mensagem;
    }
    
    

}

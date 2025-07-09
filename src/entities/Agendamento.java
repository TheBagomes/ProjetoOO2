package entities;

public class Agendamento {
    private String sala;
    private String data;  // Formato: DD/MM/AAAA
    private String horario;  // Formato: HH:MM
    private String usuario;  // Matrícula ou nome

    // Construtor
    public Agendamento(String sala, String data, String horario, String usuario) {
        this.sala = sala;
        this.data = data;
        this.horario = horario;
        this.usuario = usuario;
    }

    // Getters (para visualização)
    public String getSala() {
    	return sala;
    	}
    
    public String getData() { 
    	return data;
    	}
    
    public String getHorario() {
    	return horario;
    	}
    
    public String getUsuario() { 
    	return usuario;
    	}

    @Override
    public String toString() {
        return "Sala: " + sala + " | Data: " + data + " | Horário: " + horario + " | Responsável: " + usuario;
    }
    
    
    
}
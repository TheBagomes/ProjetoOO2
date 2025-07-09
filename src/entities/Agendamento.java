package entities;

public class Agendamento {
	 private String sala;
	    private String data;  // Formato DD/MM/AAAA
	    private String horarioInicio;  // Formato HH:MM
	    private String horarioFim;
	    private String usuario;

	    public Agendamento(String sala, String data, String horarioInicio, String horarioFim, String usuario) {
	        this.sala = sala;
	        this.data = data;
	        this.horarioInicio = horarioInicio;
	        this.horarioFim = horarioFim;
	        this.usuario = usuario;
	    }

	    // Getters
	    public String getSala() { return sala; }
	    public String getData() { return data; }
	    public String getHorarioInicio() { return horarioInicio; }
	    public String getHorarioFim() { return horarioFim; }
	    public String getUsuario() { return usuario; }

	    @Override
	    public String toString() {
	        return "Sala: " + sala + " | Data: " + data + " | Horário: " + horarioInicio + " às " + horarioFim + " | Responsável: " + usuario;
	    }
}
package entities;

import Cadastros.CadastroEspacoFisico.CadastroEspacoFisico;

public class EspacoFisico extends CadastroEspacoFisico {
	
	protected String sala;
	protected String tipo;
	protected String capacidade;
	protected String localizacao;
	protected String equipamentos;
	
	public String getTipo() {
		return null;
	}
	
	public EspacoFisico(String sala, String tipo, String capacidade, String localizacao, String equipamentos) {
		super(sala, tipo, capacidade, localizacao, equipamentos);
		this.sala = sala;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.localizacao = localizacao;
		this.equipamentos = equipamentos;
	}
	
	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(String equipamentos) {
		this.equipamentos = equipamentos;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String toString(){
		String resposta = super.toString();
		resposta += '\n';
		resposta += "LOCALIZAÇÃO: " + localizacao + '\n';
		resposta += "SALA: " + sala + '\n';
		resposta += "TIPO: " + tipo + '\n';
	
		return resposta;
	}

	public String getatriculaServ() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getatriculaServ'");
	}

	/*  Q isso?
	 * 
	@Override
    public String toString() {
        return String.format("[%s] %s - Capacidade: %d, Local: %s",
                             getTipo(), tipo, capacidade, localizacao);
    }
    */
	
}

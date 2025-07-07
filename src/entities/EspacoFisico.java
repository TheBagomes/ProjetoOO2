package entities;

import Cadastros.CadastroEspacoFisico.CadastroEspacoFisico;

public class EspacoFisico extends CadastroEspacoFisico {
	
	String sala1;
	String tipo1;
	String capacidade1;
	String localizacao1;
	String equipamentos1;
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
		this.sala1 = sala;
		this.tipo1 = tipo;
		this.capacidade1 = capacidade;
		this.localizacao1 = localizacao;
		this.equipamentos1 = equipamentos;
	}
	
	public String getSala() {
		return sala1;
	}

	public void setSala(String sala) {
		this.sala1 = sala;
	}

	public String getCapacidade() {
		return capacidade1;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade1 = capacidade;
	}

	public String getLocalizacao() {
		return localizacao1;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao1 = localizacao;
	}

	public String getEquipamentos() {
		return equipamentos1;
	}

	public void setEquipamentos(String equipamentos) {
		this.equipamentos1 = equipamentos;
	}

	public void setTipo(String tipo) {
		this.tipo1 = tipo;
	}

	public String toString(){
		String resposta = super.toString();
		resposta += '\n';
		resposta += "LOCALIZAÇÃO: " + localizacao1 + '\n';
		resposta += "SALA: " + sala1 + '\n';
		resposta += "TIPO: " + tipo1 + '\n';
	
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

package entities;

import Cadastros.CadastroEspacoFisico.CadastroEspacoFisico;

public class EspacoFisico extends CadastroEspacoFisico {
	

	String sala;
	String tipo;
	int capacidade;
	String localizacao;
	String equipamentos;

	String sala11;
	String tipo11;
	String capacidade11;
	String localizacao11;
	String equipamentos11;


	protected String sala1;
	protected String tipo1;
	protected String capacidade1;
	protected String localizacao1;
	protected String equipamentos1;
 
	
	public String getTipo() {
		return null;
	}
	
	public EspacoFisico(String sala, String tipo, String capacidade, String localizacao, String equipamentos) {
		super(sala, tipo, capacidade, localizacao, equipamentos);
		this.sala11 = sala;
		this.tipo11 = tipo;
		this.capacidade11 = capacidade;
		this.localizacao11 = localizacao;
		this.equipamentos11 = equipamentos;
	}
	
	public String getSala() {
		return sala11;
	}

	public void setSala(String sala) {
		this.sala11 = sala;
	}

	public String getCapacidade() {
		return capacidade11;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade11 = capacidade;
	}

	public String getLocalizacao() {
		return localizacao11;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao11 = localizacao;
	}

	public String getEquipamentos() {
		return equipamentos11;
	}

	public void setEquipamentos(String equipamentos) {
		this.equipamentos11 = equipamentos;
	}

	public void setTipo(String tipo) {
		this.tipo11 = tipo;
	}

	public String toString(){
		String resposta = super.toString();
		resposta += '\n';
		resposta += "LOCALIZAÇÃO: " + localizacao11 + '\n';
		resposta += "SALA: " + sala11 + '\n';
		resposta += "TIPO: " + tipo11 + '\n';
	
		return resposta;
	}
}


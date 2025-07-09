package entities;

import java.util.List;

public class EspacoFisico {
    public String sala;
    public String tipo;
    public String capacidade;
    public String localizacao;
    public List<String> equipamentos;

    // Construtor
    public EspacoFisico(String sala, String tipo, String capacidade, String localizacao, List<String> equipamentos) {
        this.sala = sala;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
        this.equipamentos = equipamentos;
    }

    // Getters e Setters

    public String getSala() {
		return sala;
	}
    
    public String getTipo() {
		
		return tipo;
	}

    public List<String> getEquipamentos1() {
        return equipamentos;
    }

    public void adicionarEquipamento(String equipamento) {
        this.equipamentos.add(equipamento);
    }

	public String getLocalizacao() {
		return localizacao;
	}

	public List<String> getEquipamentos() {
		return equipamentos;
	}
	
	  public void adicionarEquipamento1(String equipamento) {
	        this.equipamentos.add(equipamento);
	    }

	@Override
    public String toString() {
        String resposta = super.toString();
        resposta += '\n';
        resposta += "Numero da Sala :" + sala + '\n';
        resposta += "Tipo de Sala : " + tipo + '\n';
        resposta += "Quais São os Equipamentos : " + equipamentos + '\n';

        return resposta;
    }

	
}
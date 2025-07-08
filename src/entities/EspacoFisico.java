package entities;

import java.util.ArrayList;
import java.util.List;
import Cadastros.CadastroEspacoFisico.Equipamentos;


public class EspacoFisico { 
	public String sala;
    public String tipo;
    public String capacidade;
    public String localizacao;
    public List<Equipamentos> equipamentos;  // Agora é uma lista de objetos!

    // Construtor
    public EspacoFisico(String sala, String tipo, String capacidade, String localizacao, String equipamentos) {
        this.sala = sala;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
        this.equipamentos = new ArrayList<>();  
    }

    // Getters e Setters
    public String getNome() {
        return sala;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Equipamentos> getEquipamentos() {
        return equipamentos;
    }

    public void adicionarEquipamento(Equipamentos equipamento) {
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
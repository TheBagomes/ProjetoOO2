package entities;

import java.util.ArrayList;
import java.util.List;
import Cadastros.CadastroEspacoFisico.Equipamentos;

public abstract class EspacoFisico { 
    protected String sala;
    protected String tipo;
    protected String capacidade;
    protected String localizacao;
    protected List<Equipamentos> equipamentos;  

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
        return "NOME: " + sala + "\n" +
               "TIPO: " + tipo + "\n" +
               "CAPACIDADE: " + capacidade + "\n" +
               "LOCALIZAÇÃO: " + localizacao;
    }
}
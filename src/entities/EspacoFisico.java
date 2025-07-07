package entities;

import java.util.ArrayList;
import java.util.List;
import Cadastros.CadastroEspacoFisico.Equipamentos;

public abstract class EspacoFisico {  // Classe abstrata (não pode ser instanciada diretamente)
    protected String nome;
    protected String tipo;
    protected String capacidade;
    protected String localizacao;
    protected List<Equipamentos> equipamentos;  // Agora é uma lista de objetos!

    // Construtor
    public EspacoFisico(String nome, String tipo, String capacidade, String localizacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
        this.equipamentos = new ArrayList<>();  // Inicializa a lista vazia
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Equipamentos> getEquipamentos() {
        return equipamentos;
    }

    // Adiciona um equipamento à lista
    public void adicionarEquipamento(Equipamentos equipamento) {
        this.equipamentos.add(equipamento);
    }

    @Override
    public String toString() {
        return "NOME: " + nome + "\n" +
               "TIPO: " + tipo + "\n" +
               "CAPACIDADE: " + capacidade + "\n" +
               "LOCALIZAÇÃO: " + localizacao;
    }
}
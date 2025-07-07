package entities;

import java.util.ArrayList;
import java.util.List;
import Cadastros.CadastroEspacoFisico.Equipamentos;

<<<<<<< HEAD
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

>>>>>>> refs/remotes/origin/main

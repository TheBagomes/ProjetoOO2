package entities;

import java.util.ArrayList;
import java.util.List;
import Cadastros.CadastroEspacoFisico.Equipamentos;

public class EspacoFisico {  // Classe abstrata (não pode ser instanciada diretamente)
	public String nome;
    public String tipo;
    public String capacidade;
    public String localizacao;
    public List<Equipamentos> equipamentos;  // Agora é uma lista de objetos!

    // Construtor
    public EspacoFisico(String nome, String tipo, String capacidade, String localizacao, String equipamentos) {
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
        this.equipamentos = new ArrayList<>();  // Inicializa a lista vazia
    }

 
    public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
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


	public List<Equipamentos> getEquipamentos() {
		return equipamentos;
	}


	public void setEquipamentos(List<Equipamentos> equipamentos) {
		this.equipamentos = equipamentos;
	}
	
	protected void destruidor() throws Throwable{
		System.out.println("Destruindo Objeto: " + this);
	}
	
	public String toString(){
		String resposta = super.toString();
		resposta += '\n';
		resposta += "NOME: " + nome + '\n';
		resposta += "CURSO: " + tipo + '\n';
		resposta += "SEMESTRE INICIAL: " + capacidade + '\n';
		resposta += "MATRICULA: " + localizacao + '\n';
	
		return resposta;
	}

	
}



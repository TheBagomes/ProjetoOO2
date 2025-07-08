package entities;

import java.util.ArrayList;
import java.util.List;
import Cadastros.CadastroEspacoFisico.Equipamentos;

<<<<<<< HEAD
public abstract class EspacoFisico { 
    protected String sala;
    protected String tipo;
    protected String capacidade;
    protected String localizacao;
    protected List<Equipamentos> equipamentos;  
=======
public class EspacoFisico {  // Classe abstrata (não pode ser instanciada diretamente)
	public String nome;
    public String tipo;
    public String capacidade;
    public String localizacao;
    public List<Equipamentos> equipamentos;  // Agora é uma lista de objetos!
>>>>>>> 2d16a118a3d9f22161e882012a282f79ee715b17

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
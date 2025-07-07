package Cadastros;

import entities.EspacoFisico;
import java.util.List;

public class Auditorio extends EspacoFisico {

    public Auditorio(String nome,
                     int capacidade,
                     String localizacao,
                     String equipamentos) {
        super(nome, capacidade, localizacao, equipamentos);
    }

    @Override
    public String getTipo() {
        return "Auditorio";
    }

    @Override
    public String toString() {
        String resposta = super.toString();
        resposta += '\n';
        resposta += "TIPO: " + getTipo() + '\n';
        resposta += "NOME: " + nome + '\n';
        resposta += "CAPACIDADE: " + capacidade + '\n';
        resposta += "LOCALIZAÇÃO: " + localizacao + '\n';
        resposta += "EQUIPAMENTOS: " + equipamentos + '\n';
        return resposta;
    }

    protected void destruidor() throws Throwable {
        System.out.println("Destruindo Objeto: " + this);
    }
}

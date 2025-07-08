package Cadastros;

import entities.EspacoFisico;

public class Auditorio extends EspacoFisico {

    public Auditorio(
    		String sala,
    		String tipo,
    		String capacidade,
    		String localizacao,
    		String equipamentos) {
        super(sala, tipo, capacidade, localizacao, equipamentos);
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
        resposta += "NOME: " + sala + '\n';
        resposta += "CAPACIDADE: " + capacidade + '\n';
        resposta += "LOCALIZAÇÃO: " + localizacao + '\n';
        resposta += "EQUIPAMENTOS: " + equipamentos + '\n';
        return resposta;
    }

    protected void destruidor() throws Throwable {
        System.out.println("Destruindo Objeto: " + this);
    }
}

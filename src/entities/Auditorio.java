package entities;


import java.util.List;


public class Auditorio extends EspacoFisico {

    public Auditorio(String nome,
		String tipo,
        String capacidade,
        String localizacao,
        String equipamentos) {
        super(nome,tipo, capacidade, localizacao, equipamentos);
    }

    @Override
    public String getTipo() {
        return "Auditorio";
    }

    
    /*@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TIPO: ").append(getTipo()).append('\n');
        sb.append("NOME: ").append(nome).append('\n');
        sb.append("CAPACIDADE: ").append(capacidade).append('\n');
        sb.append("LOCALIZAÇÃO: ").append(localizacao).append('\n');
        sb.append("EQUIPAMENTOS: ").append(equipamentos).append('\n');
        return sb.toString();
    }*/

    public String toString(){
		String resposta = super.toString();
		resposta += '\n';
		resposta += "Qual o Nome/Numero da sala: " + sala + '\n';
		resposta += "Qual a capacidade " + capacidade + '\n';
		resposta += "Qual a Localizaçâo: " + localizacao + '\n';
		resposta += "Quais são os equipamentos: " + equipamentos + '\n';
		return resposta;
	}

    
    protected void destruidor() throws Throwable {
        System.out.println("Destruindo Objeto: " + this);
    }
}
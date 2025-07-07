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

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TIPO: ").append(getTipo()).append('\n');
        sb.append("NOME: ").append(nome).append('\n');
        sb.append("CAPACIDADE: ").append(capacidade).append('\n');
        sb.append("LOCALIZAÇÃO: ").append(localizacao).append('\n');
        sb.append("EQUIPAMENTOS: ").append(equipamentos).append('\n');
        return sb.toString();
    }

    
    protected void destruidor() throws Throwable {
        System.out.println("Destruindo Objeto: " + this);
    }
}
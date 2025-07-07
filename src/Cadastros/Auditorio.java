package Cadastros;

import entities.EspacoFisico;
import java.util.List;

public class Auditorio extends EspacoFisico{
	
	public Auditorio(String nome, int capacidade, String localizacao, List<String> equipamentos) {
		super(nome, capacidade, localizacao, equipamentos);
	}

	@Override
	public String getTipo() {
		return "Auditorio";
	}

}

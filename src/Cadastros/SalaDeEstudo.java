package Cadastros;

import entities.EspacoFisico;
import java.util.List;

public class SalaDeEstudo extends EspacoFisico{

	public SalaDeEstudo(String nome, int capacidade, String localizacao, List<String> equipamentos) {
		super(nome, capacidade, localizacao, equipamentos);
	}

	@Override
	public String getTipo() {
		return "Sala de Estudo";
	}
	
}

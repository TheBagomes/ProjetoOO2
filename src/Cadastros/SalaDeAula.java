package Cadastros;

import entities.EspacoFisico;
import java.util.List;

public class SalaDeAula extends EspacoFisico{

	public SalaDeAula(String tipo , String nome, String capacidade, String localizacao, String equipamentos) {
		super( nome, tipo, capacidade, localizacao, equipamentos);
	}

	@Override
	public String getTipo() {
		return "Sala de Aula";
	}
	
}

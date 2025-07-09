package entities;

import java.util.List;

//import java.util.List;

public class SalaDeEstudo extends EspacoFisico{

	public SalaDeEstudo(String sala, String tipo, String capacidade, String localizacao,  List<String> equipamentos) {
		super(sala, tipo,  capacidade, localizacao, equipamentos);
	}

	@Override
	public String getTipo() {
		return "Sala de Estudo";
	}
	
}

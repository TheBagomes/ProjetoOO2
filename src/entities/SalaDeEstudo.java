package entities;

//import java.util.List;

public class SalaDeEstudo extends EspacoFisico{

	public SalaDeEstudo(String nome, String tipo, String capacidade, String localizacao, String equipamentos) {
		super(nome, tipo,  capacidade, localizacao, equipamentos);
	}

	@Override
	public String getTipo() {
		return "Sala de Estudo";
	}
	
}

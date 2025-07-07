package entities;

//import java.util.List;

public class Laboratorio extends EspacoFisico{

	public Laboratorio(String nome, String tipo, String capacidade, String localizacao, String equipamentos) {
		super(nome, tipo, capacidade, localizacao, equipamentos);
	}

	@Override
	public String getTipo() {
		return "Laboratorio";
	}

}

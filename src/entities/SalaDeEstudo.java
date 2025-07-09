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

	public String toString(){
		String resposta = super.toString();
		resposta += '\n';
		resposta += "Qual o Nome/Numero da sala: " + sala + '\n';
		resposta += "Qual a capacidade " + capacidade + '\n';
		resposta += "Qual a Localizaçâo: " + localizacao + '\n';
		resposta += "Quais são os equipamentos: " + equipamentos + '\n';
		return resposta;
	}

	public String getIdentificador() {
		return null;
	}
	
}

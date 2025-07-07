package entities;

//import java.util.List;

public class SalaDeAula extends EspacoFisico{

	public SalaDeAula(String sala,String tipo, String capacidade, String localizacao, String equipamentos) {
		super(sala, tipo, capacidade, localizacao, equipamentos);
	}


	@Override
	public String getTipo() {
		return "Sala de Aula";
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
}


package Cadastros.CadastroEspacoFisico;

import java.util.ArrayList;
import java.util.List;


import entities.EspacoFisico;

public class CadastroEspacoFisico {

	 int nEspacoFisico;
	 	//Estava tentando algo aqui
	    private List<EspacoFisico> EspacoFisico;
		private List<equipamentos> Equipamentos;

	    public CadastroEspacoFisico(String sala, String tipo, String capacidade, String localizacao, String equipamentos){
	        nEspacoFisico = 0;
	        EspacoFisico = new ArrayList<EspacoFisico>();
			Equipamentos = new ArrayList<equipamentos>(equipamentos);
	    }

	    public int cadastroEspacoFisico(EspacoFisico ok){
	        boolean cadastrou = EspacoFisico.add(ok);
	        if(cadastrou){
	            nEspacoFisico = EspacoFisico.size();
	        }
	        return nEspacoFisico;
	    }


}

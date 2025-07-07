package Cadastros.CadastroEspacoFisico;

import java.util.ArrayList;

import java.util.List;


import entities.EspacoFisico;

public class CadastroEspacoFisico {

	 int nEspacoFisico;
	 	//Estava tentando algo aqui
	    private List<EspacoFisico> EspacoFisico;
		private List<equipamento> equipamentos;

	    public CadastroEspacoFisico(String sala, String tipo, String capacidade, String localizacao, String equipamentos){
	        nEspacoFisico = 0;
	        EspacoFisico = new ArrayList<EspacoFisico>();
	    }

	    public int cadastroEspacoFisico(EspacoFisico ok){
	        boolean cadastrou = EspacoFisico.add(ok);
	        if(cadastrou){
	            nEspacoFisico = EspacoFisico.size();
	        }
	        return nEspacoFisico;
	    }

		public int cadastroDeEquipamentos(equipamento)

	    public EspacoFisico pesquisarEspacoFisico(String matriculaEspacoFisico){
	        for(EspacoFisico ok: EspacoFisico){
	            if(ok.getatriculaServ().equalsIgnoreCase(matriculaEspacoFisico)){
	                return ok;
	            }
	        }
	        return null;
	    }
		
	    /*public boolean removerEspacoFisico(String sala, EspacoFisico ok){
	        boolean removeu = false;
	        if (EspacoFisico.contains(ok)){
	            removeu = EspacoFisico.remove(ok);
	        }
	        return removeu;
	    }*/

	    /*public boolean atualizarServidor(String sala, entities.EspacoFisico ok){
	         boolean resposta = false;
	         EspacoFisico remover = pesquisarEspacoFisico(sala);
	        if(remover != null){
	        	EspacoFisico.remove(remover);
	            resposta = EspacoFisico.add(ok);
	        }
	        return resposta;
	    }*/


}

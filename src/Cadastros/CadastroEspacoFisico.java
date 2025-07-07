package Cadastros;

import java.util.ArrayList;
import java.util.List;

import entities.Servidor;

public class CadastroEspacoFisico {

	 int nEspacoFisico;
	    private List<EspacoFisico> EspacoFisico;

	    public CadastroEspacoFisico(){
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

	    public EspacoFisico pesquisarEspacoFisico(String matriculaEspacoFisico){
	        for(EspacoFisico ok: EspacoFisico){
	            if(ok.getMatriculaServ().equalsIgnoreCase(matriculaEspacoFisico)){
	                return ok;
	            }
	        }
	        return null;
	    }

	    public boolean removerEspacoFisico(String sala, EspacoFisico ok){
	        boolean removeu = false;
	        if (EspacoFisico.contains(ok)){
	            removeu = EspacoFisico.remove(ok);
	        }
	        return removeu;
	    }

	    public boolean atualizarServidor(String sala, Servidor ok){
	         boolean resposta = false;
	         EspacoFisico remover = pesquisarEspacoFisico(sala);
	        if(remover != null){
	        	EspacoFisico.remove(remover);
	            resposta = EspacoFisico.add(ok);
	        }
	        return resposta;
	    }


}

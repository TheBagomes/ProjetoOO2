package Cadastros.CadastroEspacoFisico;

import java.util.ArrayList;
import java.util.List;
import entities.EspacoFisico;

public class CadastroEspacoFisico {
	int nEspacoFisico;
    private List<EspacoFisico> espacos;

    public CadastroEspacoFisico() {
        espacos = new ArrayList<EspacoFisico>();
    }

	    public int cadastroEspacoFisico(EspacoFisico ok){
	        boolean cadastrou = espacos.add(ok);
			if(cadastrou){
	            nEspacoFisico = espacos.size();
	        }
	        return nEspacoFisico;
	    }
	    
	    public EspacoFisico pesquisarEspacoFisico(String matriculaEspacoFisico){
	        for(EspacoFisico ok: espacos){
	            if(ok.getNome().equalsIgnoreCase(matriculaEspacoFisico)){
	                return ok;
	            }
	        }
	        return null;
	    }
	    
	    
		public boolean atualizarEspacoFisico(String sala, EspacoFisico ok) {
			boolean resposta = false; 
			EspacoFisico remover = pesquisarEspacoFisico(sala); 
			if(remover != null){
				espacos.remove(remover);
				resposta = espacos.add(ok);
			}
			return resposta;
		}
		
		public boolean removerEspacoFisico(EspacoFisico ok) {
			boolean removeu = false;
			if(espacos.contains(ok)) {
				removeu = espacos.remove(ok);
			}
			return removeu;
		}
		
}


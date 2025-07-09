package Cadastros.CadastroEspacoFisico;

import java.util.ArrayList;

import java.util.List;
import entities.EspacoFisico;

public class CadastroEspacoFisico {
	int nEspacoFisico;
    private List<EspacoFisico> espacos;
	//private List<Equipamentos> equipamentosGeral;

    public CadastroEspacoFisico() {
        espacos = new ArrayList<>();
		//equipamentosGeral = new ArrayList<>();
    }
    
	public int cadastroEspacoFisico(EspacoFisico ok) {
		boolean cadastrou = espacos.add(ok);
        if(cadastrou){
            nEspacoFisico = espacos.size();
        }
        return nEspacoFisico;
	}

	public int cadastroEspacoFisico1(EspacoFisico ok){
	        boolean cadastrou = espacos.add(ok);
			if(cadastrou){
	            nEspacoFisico = espacos.size();
	        }
	        return nEspacoFisico;
	}
	    
	public EspacoFisico pesquisarEspacoFisico(String matriculaEspacoFisico){
	        for(EspacoFisico ok: espacos){
	            if(ok.getSala().equalsIgnoreCase(matriculaEspacoFisico)){
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
	
	public boolean removerEspacoFisico(EspacoFisico remover) {
		boolean removeu = false;
			if(espacos.contains(remover)) {
				removeu = espacos.remove(remover);
			}
			return removeu;
	}

    public boolean agendarEspacoFisico(String sala, String data, String horario) {
            throw new UnsupportedOperationException("Unimplemented method 'agendarEspacoFisico'");
        }
		
}


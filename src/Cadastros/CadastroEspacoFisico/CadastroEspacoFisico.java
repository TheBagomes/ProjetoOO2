package Cadastros.CadastroEspacoFisico;

import java.util.ArrayList;

import java.util.List;
import entities.EspacoFisico;

public class CadastroEspacoFisico {
    private List<EspacoFisico> espacos;

    public CadastroEspacoFisico() {
        this.espacos = new ArrayList<>();
    }

    public void cadastrarEspaco(EspacoFisico espaco) {
        espacos.add(espaco);
    }

	    public int cadastroEspacoFisico(EspacoFisico ok){
	        boolean cadastrou = EspacoFisico.add(ok);
	        Object nEspacoFisico;
			if(cadastrou){
	            nEspacoFisico = EspacoFisico.size();
	        }
	        return nEspacoFisico;
	    }

	    public EspacoFisico pesquisarEspacoFisico(String matriculaEspacoFisico){
	        for(EspacoFisico ok: EspacoFisico){
	            if(ok.getmatriculaServ().equalsIgnoreCase(matriculaEspacoFisico)){
	                return ok;
	            }
	        }
	        return null;
	    }
		
}


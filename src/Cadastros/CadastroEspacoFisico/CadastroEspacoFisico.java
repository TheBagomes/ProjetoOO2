package Cadastros.CadastroEspacoFisico;

import java.util.ArrayList;
import java.util.List;
import entities.EspacoFisico;

public class CadastroEspacoFisico {
	int nEspacoFisico;
    private List<EspacoFisico> espacos;
	private List<Equipamentos> equipamentosGeral;

    public CadastroEspacoFisico() {
        espacos = new ArrayList<>();
		equipamentosGeral = new ArrayList<>();
    }


	// Esse e oque tinha antes 

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
		
<<<<<<< HEAD
	public boolean removerEspacoFisico(EspacoFisico ok) {
=======
		public boolean removerEspacoFisico(EspacoFisico remover) {
>>>>>>> bec59f6dc74caa7cc4c865bbc5d9ffc30e1b49a5
			boolean removeu = false;
			if(espacos.contains(remover)) {
				removeu = espacos.remove(remover);
			}
			return removeu;
<<<<<<< HEAD
	}
=======
		}

        public boolean agendarEspacoFisico(String sala, String data, String horario) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'agendarEspacoFisico'");
        }
>>>>>>> bec59f6dc74caa7cc4c865bbc5d9ffc30e1b49a5
		
}


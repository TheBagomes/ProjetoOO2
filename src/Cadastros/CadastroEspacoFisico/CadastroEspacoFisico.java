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


		public boolean atualizarEspacoFisico(String sala, EspacoFisico novoCadastro) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException("Unimplemented method 'atualizarEspacoFisico'");
		}

        public boolean removerEspacoFisico(String sala, EspacoFisico remover) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'removerEspacoFisico'");
        }  

}

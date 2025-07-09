package Cadastros.CadastroEspacoFisico;

import entities.SalaDeAula;
import java.util.ArrayList;
import java.util.List;

public class CadastroSalaDeAula {
    private List<SalaDeAula> salas;
   // private List<Equipamentos> Equipamentos; // Lista compartilhada (ou pode ser por sala) /*Vitor: Estão declarando mas não estão ultilizando*/

    public CadastroSalaDeAula() {
        salas = new ArrayList<>();
        //Equipamentos = new ArrayList<>(); // Inicializa a lista /*Vitor: Estão declarando mas não estão ultilizando*/
    }

    // Método para adicionar equipamento à sala
    public boolean adicionarEquipamento(String identificadorSala, String equipamento) {
        SalaDeAula sala = pesquisarSala(identificadorSala);
        if (sala != null) {
            return sala.getEquipamentos().add(equipamento); // Assume que SalaDeAula tem uma lista de equipamentos
        }
        return false;
    }
    
    public SalaDeAula pesquisarSala(String identificadorSala) {
    for (SalaDeAula sala : salas) {
        if (sala.getIdentificador().equalsIgnoreCase(identificadorSala)) {      
            return sala;
        }               
    }
    return null;

}

    public int cadastrarSala(SalaDeAula sala) {
        boolean cadastrou = salas.add(sala);
        if (cadastrou) {
            return salas.size();
        }
        return -1; // Retorna -1 se não conseguiu cadastrar
    }

    public boolean removerSala(SalaDeAula sala) {
        return salas.remove(sala);
    }

    public SalaDeAula pesquisarSalaPorNome(String nomeSala) {
        for (SalaDeAula sala : salas) {
            if (sala.getSala().equalsIgnoreCase(nomeSala)) {
                return sala;
            }
        }
        return null; // Retorna null se não encontrar
    }


    public boolean atualizarSala(String nomeSala, SalaDeAula salaAtualizada) {
        SalaDeAula salaExistente = pesquisarSalaPorNome(nomeSala);
        if (salaExistente != null) {
            salas.remove(salaExistente);
            return salas.add(salaAtualizada);
        }
        return false; // Retorna false se não conseguiu atualizar
    }

	public boolean agendarSala(String sala, String data, String horario) {
	
		return false;
	}


}       


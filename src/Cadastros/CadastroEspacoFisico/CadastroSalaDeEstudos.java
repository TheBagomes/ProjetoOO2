package Cadastros.CadastroEspacoFisico;

import java.util.ArrayList;

import java.util.List;

import entities.SalaDeAula;
import entities.SalaDeEstudo;

public class CadastroSalaDeEstudos {

    int nSalas;
    private List<SalaDeEstudo> salas;

    public CadastroSalaDeEstudos() {
        nSalas = 0;
        salas = new ArrayList<SalaDeEstudo>();
    }

    public int cadastrarSalaDeEstudos(SalaDeEstudo pos) {
        boolean cadastrou = salas.add(pos);
        if (cadastrou) {
            nSalas = salas.size();
        }
        return nSalas;
    }

    public SalaDeEstudo pesquisarSala(String nomeSala) {
        for (SalaDeEstudo pos : salas) {
            
            if (pos.getSala().equalsIgnoreCase(nomeSala)) {
                return pos;
            }
        }
        return null;
    }

    public boolean removerSala(SalaDeEstudo pos) {
        boolean removeu = false;
        if (salas.contains(pos)) {
            removeu = salas.remove(pos);
        }
        return removeu;
    }

    public boolean atualizarSala(String nomeSala, SalaDeEstudo pos) {
        boolean resposta = false;
        SalaDeEstudo remover = pesquisarSala(nomeSala);
        if (remover != null) {
            salas.remove(remover);
            resposta = salas.add(pos);
        }
        return resposta;
    }
    
    public SalaDeEstudo pesquisarSalaPorNome(String nomeSala) {
        for (SalaDeEstudo sala : salas) {
            if (sala.getSala().equalsIgnoreCase(nomeSala)) {
                return sala;
            }
        }
        return null; // Retorna null se não encontrar
    }
    
    public boolean agendarSala(String sala, String data, String horario) {
    	
		return false;
	}
}

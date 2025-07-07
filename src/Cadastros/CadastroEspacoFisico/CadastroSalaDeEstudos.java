package Cadastros.CadastroEspacoFisico;

import entities.SalaDeEstudos;  

import java.util.ArrayList;
import java.util.List;


public class CadastroSalaDeEstudos {

    int nSalas;
    private List<SalaDeEstudos> salas;

    public CadastroSalaDeEstudos() {
        nSalas = 0;
        salas = new ArrayList<SalaDeEstudos>();
    }

    public int cadastrarSala(SalaDeEstudos pos) {
        boolean cadastrou = salas.add(pos);
        if (cadastrou) {
            nSalas = salas.size();
        }
        return nSalas;
    }

    public SalaDeEstudos pesquisarSala(String nomeSala) {
        for (SalaDeEstudos pos : salas) {
            
            if (pos.getNome().equalsIgnoreCase(nomeSala)) {
                return pos;
            }
        }
        return null;
    }

    public boolean removerSala(SalaDeEstudos pos) {
        boolean removeu = false;
        if (salas.contains(pos)) {
            removeu = salas.remove(pos);
        }
        return removeu;
    }

    public boolean atualizarSala(String nomeSala, SalaDeEstudos pos) {
        boolean resposta = false;
        SalaDeEstudos remover = pesquisarSala(nomeSala);
        if (remover != null) {
            salas.remove(remover);
            resposta = salas.add(pos);
        }
        return resposta;
    }
}

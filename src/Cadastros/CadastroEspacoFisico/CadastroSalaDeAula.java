package Cadastros.CadastroEspacoFisico;

import entities.SalaDeAula;

import java.util.ArrayList;
import java.util.List;

public class CadastroSalaDeAula {

    private int nSalas;
    private List<SalaDeAula> salas;

    public CadastroSalaDeAula() {
        nSalas = 0;
        salas = new ArrayList<>();
    }

    public int cadastrarSala(SalaDeAula novaSala) {
        if (salas.add(novaSala)) {
            nSalas = salas.size();
        }
        return nSalas;
    }

    public SalaDeAula pesquisarSala(String identificador) {
        for (SalaDeAula sala : salas) {
            if (sala.getNome().equalsIgnoreCase(identificador)) {
                return sala;
            }
        }
        return null;
    }

    public boolean removerSala(SalaDeAula sala) {
        return salas.remove(sala);
    }

    public boolean atualizarSala(String identificador, SalaDeAula novaSala) {
        SalaDeAula antiga = pesquisarSala(identificador);
        if (antiga != null) {
            salas.remove(antiga);
            return salas.add(novaSala);
        }
        return false;
    }

    public int getNumeroSalas() {
        return nSalas;
    }

    public List<SalaDeAula> listarSalas() {
        return new ArrayList<>(salas);
    }
}

package Cadastros.CadastroEspacoFisico;

import entities.Laboratorio;

import java.util.ArrayList;
import java.util.List;

public class CadastroLaboratorio {

    private int nLaboratorios;
    private List<Laboratorio> laboratorios;

    public CadastroLaboratorio() {
        nLaboratorios = 0;
        laboratorios = new ArrayList<>();
    }

    public int cadastrarLaboratorio(Laboratorio novoLab) {
        if (laboratorios.add(novoLab)) {
            nLaboratorios = laboratorios.size();
        }
        return nLaboratorios;
    }

    public Laboratorio pesquisarLaboratorio(String identificador) {
        for (Laboratorio lab : laboratorios) {
            if (lab.getSala().equalsIgnoreCase(identificador)) {
                return lab;
            }
        }
        return null;
    }

    public boolean removerLaboratorio(Laboratorio lab) {
        return laboratorios.remove(lab);
    }

    public boolean atualizarLaboratorio(String identificador, Laboratorio novoLab) {
        Laboratorio antigo = pesquisarLaboratorio(identificador);
        if (antigo != null) {
            laboratorios.remove(antigo);
            return laboratorios.add(novoLab);
        }
        return false;
    }

    public int getNumeroLaboratorios() {
        return nLaboratorios;
    }

    public List<Laboratorio> listarLaboratorios() {
        return new ArrayList<>(laboratorios);
    }
}


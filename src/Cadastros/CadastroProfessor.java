package Cadastros;

import entities.Professor;
//import entities.PessoaFisica;

import java.util.ArrayList;
import java.util.List;

public class CadastroProfessor {
    int nProfessor;
    private List<Professor> professores;

    public CadastroProfessor(){
        nProfessor = 0;
        professores = new ArrayList<Professor>();
    }

    public int cadastrarProfessor(Professor pos){
        boolean cadastrou = professores.add(pos);
        if(cadastrou){
            nProfessor = professores.size();
        }
        return nProfessor;
    }


    public Professor pesquisaProfessor(String matriculaProfessor){
        for(Professor pos: professores){
            if(pos.getMatriculaProf().equalsIgnoreCase(matriculaProfessor)){
                return pos;
            }
        }
        return null;
    }

    public boolean removerProfessor(Professor pos){
        boolean removeu = false;
        if(professores.contains(pos)) {
            removeu = professores.remove(pos);
        }
        return removeu;
    }

    public boolean atualizarProfessor(String matricula, Professor pos){
        boolean resposta = false;
        Professor remover = pesquisaProfessor(matricula);
        if(remover != null){
            professores.remove(remover);
            resposta = professores.add(pos);
        }
        return resposta;
    }
}
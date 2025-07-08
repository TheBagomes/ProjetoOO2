package Cadastros.CadastoPessoaFisica;

import entities.Aluno;  

import java.util.ArrayList;
import java.util.List;

public class CadastroAluno {
    int nAlunos;
    private List<Aluno> alunos;

    public CadastroAluno(){
        
        alunos = new ArrayList<Aluno>();
    }

    public int cadastrarAluno(Aluno pos){
        boolean cadastrou = alunos.add(pos);
        if(cadastrou){
            nAlunos = alunos.size();
        }
        return nAlunos;
    }

    public Aluno pesquisarAluno(String matriculaAluno){
        for(Aluno pos: alunos){
            if(pos.getMatricula().equalsIgnoreCase(matriculaAluno)){
                return pos;
            }
        }
        return null;

    }

    public boolean removerAluno(Aluno pos) {
		boolean removeu = false; 
		if (alunos.contains(pos)) {
			removeu = alunos.remove(pos);
		}
		return removeu;
	}

    public boolean atualizarAluno(String matricula, Aluno pos){
        boolean resposta = false;
        Aluno remover = pesquisarAluno(matricula);
        if(remover != null){
            alunos.remove(remover);
            resposta = alunos.add(pos);
        }
        return resposta;
    }
}

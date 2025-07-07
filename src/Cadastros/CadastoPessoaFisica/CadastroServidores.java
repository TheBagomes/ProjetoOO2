package Cadastros.CadastoPessoaFisica;

import entities.Servidor;

import java.util.ArrayList;
import java.util.List;

public class CadastroServidores {
    int nServidores;
    private List<Servidor> servidores;

    public CadastroServidores(){
        nServidores = 0;
        servidores = new ArrayList<Servidor>();
    }

    public int cadastroServidores(Servidor ok){
        boolean cadastrou = servidores.add(ok);
        if(cadastrou){
            nServidores = servidores.size();
        }
        return nServidores;
    }

    public Servidor pesquisarServidor(String matriculaServidor){
        for(Servidor ok: servidores){
            if(ok.getMatriculaServ().equalsIgnoreCase(matriculaServidor)){
                return ok;
            }
        }
        return null;
    }

    public boolean removerServidor(String matricula, Servidor ok){
        boolean removeu = false;
        if (servidores.contains(ok)){
            removeu = servidores.remove(ok);
        }
        return removeu;
    }

    public boolean atualizarServidor(String matricula, Servidor ok){
         boolean resposta = false;
        Servidor remover = pesquisarServidor(matricula);
        if(remover != null){
            servidores.remove(remover);
            resposta = servidores.add(ok);
        }
        return resposta;
    }


}
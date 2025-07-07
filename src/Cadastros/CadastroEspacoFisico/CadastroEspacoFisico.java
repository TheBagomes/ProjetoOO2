package Cadastros.CadastroEspacoFisico;

import java.util.ArrayList;
import java.util.List;
import entities.EspacoFisico;

public class CadastroEspacoFisico {
    private List<EspacoFisico> espacos;

    public CadastroEspacoFisico() {
        this.espacos = new ArrayList<>();
    }

    public void cadastrarEspaco(EspacoFisico espaco) {
        espacos.add(espaco);
    }

}
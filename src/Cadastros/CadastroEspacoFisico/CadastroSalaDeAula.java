package Cadastros.CadastroEspacoFisico;
import entities.SalaDeAula;

import java.util.ArrayList;
import java.util.List;

public class CadastroSalaDeAula {
    private List<SalaDeAula> salas;
    private List<Equipamentos> equipamentos; // Lista compartilhada (ou pode ser por sala)

    public CadastroSalaDeAula() {
        salas = new ArrayList<>();
        Equipamentos = new ArrayList<>(); // Inicializa a lista
    }

    // Método para adicionar equipamento à sala
    public boolean adicionarEquipamento(String identificadorSala, Equipamentos equipamento) {
        SalaDeAula sala = pesquisarSala(identificadorSala);
        if (sala != null) {
            return sala.getEquipamentos().add(equipamento); // Assume que SalaDeAula tem uma lista de equipamentos
        }
        return false;
    }
    



    private SalaDeAula pesquisarSala(String identificadorSala) {
    for (SalaDeAula sala : salas) {
        if (sala.getIdentificador().equalsIgnoreCase(identificadorSala)) {      
            return sala;
        }               
        throw new UnsupportedOperationException("Unimplemented method 'pesquisarSala'");
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
            if (sala.getNome().equalsIgnoreCase(nomeSala)) {
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
}       
>>>>>>> 2d16a118a3d9f22161e882012a282f79ee715b17

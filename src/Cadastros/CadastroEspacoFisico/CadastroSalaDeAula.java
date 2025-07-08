package Cadastros.CadastroEspacoFisico;
import entities.SalaDeAula;

import java.util.ArrayList;
import java.util.List;

import entities.SalaDeAula;

public class CadastroSalaDeAula {
    private List<SalaDeAula> salas;
    private List<Equipamentos> equipamentos; // Lista compartilhada (ou pode ser por sala)

    public CadastroSalaDeAula() {
        salas = new ArrayList<>();
        equipamentos = new ArrayList<>(); // Inicializa a lista
    }

    // Método para adicionar equipamento à sala
    public boolean adicionarEquipamento(String identificadorSala, Equipamentos equipamento) {
        SalaDeAula sala = pesquisarSala(identificadorSala);
        if (sala != null) {
            return sala.getEquipamentos().add(equipamento); // Assume que SalaDeAula tem uma lista de equipamentos
        }
        return false;
    }
    

}
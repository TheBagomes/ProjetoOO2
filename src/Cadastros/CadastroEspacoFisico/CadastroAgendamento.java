package Cadastros.CadastroEspacoFisico;

import entities.Agendamento;
import java.util.ArrayList;
import java.util.List;

public class CadastroAgendamento {
    private static List<Agendamento> agendamentos = new ArrayList<>();

    // Adiciona um agendamento à lista
    public static boolean adicionarAgendamento(String sala, String data, String horario, String usuario) {
        try {
            Agendamento novoAgendamento = new Agendamento(sala, data, horario, usuario);
            agendamentos.add(novoAgendamento);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Retorna todos os agendamentos
    public static List<Agendamento> listarAgendamentos() {
        return new ArrayList<>(agendamentos); // Retorna uma cópia para evitar modificações externas
    }
}

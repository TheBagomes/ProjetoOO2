package Cadastros.CadastroEspacoFisico;

import entities.Agendamento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroAgendamento {
    private static List<Agendamento> agendamentos = new ArrayList<>();

    public static boolean adicionarAgendamento(String sala, String data, String horarioInicio, String horarioFim, String usuario) {
        try {
            // Verifica sobreposição
            if (temSobreposicao(sala, data, horarioInicio, horarioFim)) {
                JOptionPane.showMessageDialog(null, 
                    "Conflito de agendamento! Já existe uma reserva neste horário.", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Verifica horário comercial (8h-18h)
            if (!isHorarioValido(horarioInicio, horarioFim)) {
                JOptionPane.showMessageDialog(null, 
                    "❌ Horário fora do período comercial (8h-18h)!", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            Agendamento novoAgendamento = new Agendamento(sala, data, horarioInicio, horarioFim, usuario);
            agendamentos.add(novoAgendamento);
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Formato inválido! Use DD/MM/AAAA para data e HH:MM para horário.", 
                "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private static boolean temSobreposicao(String sala, String data, String novoInicio, String novoFim) {
        for (Agendamento ag : agendamentos) {
            if (ag.getSala().equals(sala) && ag.getData().equals(data)) {
                boolean conflito = !(novoFim.compareTo(ag.getHorarioInicio()) <= 0) ||
                                  !(novoInicio.compareTo(ag.getHorarioFim()) >= 0);
                if (conflito) return true;
            }
        }
        return false;
    }

    private static boolean isHorarioValido(String inicio, String fim) {
        // Verifica se está entre 8h e 18h
        return inicio.compareTo("08:00") >= 0 && fim.compareTo("18:00") <= 0;
    }

    public static List<Agendamento> listarAgendamentos() {
        return new ArrayList<>(agendamentos);
    }
}
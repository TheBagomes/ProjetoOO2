package Front;

import javax.swing.JOptionPane;
import Cadastros.CadastroEspacoFisico.CadastroAgendamento;
import entities.Agendamento;
import java.util.List;

public class MenuAgendamento {

    private static String lerSala() {
        return JOptionPane.showInputDialog("Nome da sala:");
    }

    private static String lerData() {
        return JOptionPane.showInputDialog("Data (DD/MM/AAAA):");
    }

    private static String lerHorario() {
        return JOptionPane.showInputDialog("Horário (HH:MM):");
    }
    
    private static String lerHorarioFim() {
        return JOptionPane.showInputDialog("Horário final (HH:MM):");
    }

    private static String lerUsuario() {
        return JOptionPane.showInputDialog("Matrícula/Nome:");
    }

    public static void mostrarMenu() {
        String texto = "=== Menu Agendamento ===\n"
                     + "1 - Novo Agendamento\n"
                     + "2 - Listar Agendamentos\n"
                     + "0 - Voltar";

        int escolha;
        do {
            String strEscolha = JOptionPane.showInputDialog(texto);
            if (strEscolha == null) break; // Se o usuário cancelar

            try {
                escolha = Integer.parseInt(strEscolha);

                switch (escolha) {
                    case 1:
                        String sala = lerSala();
                        String data = lerData();
                        String horario = lerHorario();
                        String horarioFim = lerHorarioFim();
                        String usuario = lerUsuario();

                        boolean sucesso = CadastroAgendamento.adicionarAgendamento(sala, data, horario, horarioFim, usuario);
                        JOptionPane.showMessageDialog(null, sucesso ? "Agendamento salvo!" : "Erro ao salvar.");
                        break;

                    case 2:
                        List<Agendamento> agendamentos = CadastroAgendamento.listarAgendamentos();
                        StringBuilder lista = new StringBuilder("=== Agendamentos ===\n");
                        if (agendamentos.isEmpty()) {
                            lista.append("Nenhum agendamento cadastrado.");
                        } else {
                            for (Agendamento ag : agendamentos) {
                                lista.append(ag.toString()).append("\n");
                            }
                        }
                        JOptionPane.showMessageDialog(null, lista.toString());
                        break;

                    case 0:
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
            }
        } while (true);
    }
   
}
package Front.MenuEspacoFisico;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

import Cadastros.CadastroEspacoFisico.CadastroSalaDeAula;
import Cadastros.CadastroEspacoFisico.CadastroSalaDeEstudos;

import entities.SalaDeEstudo;


public class MenuSalaDeEstudos{
     private static String lerSala(){
         return JOptionPane.showInputDialog("Informe o nome da sala: ");

    }
	
	 private static String lerTipo(){
         return JOptionPane.showInputDialog("Informe o tipo da sala: ");

    }
	 
	 private static String lerCapacidade(){
         return JOptionPane.showInputDialog("Informe a capacidade da sala: ");

    }
	 
	 private static String lerLocalizacao(){
         return JOptionPane.showInputDialog("Informe a localização da sala: ");

    }
	private static List<String> lerEquipamentos(){
		List<String> equipamentos = new ArrayList<>();
        String equipamento;
        do {
            equipamento = JOptionPane.showInputDialog("Informe um equipamento (ou deixe em branco para finalizar): ");
            if (equipamento != null && !equipamento.trim().isEmpty()) {
                equipamentos.add(equipamento.trim());
            }
        } while (equipamento != null && !equipamento.trim().isEmpty());
        return equipamentos;
    }
	 
	public static SalaDeEstudo dadosNovoSalaDeEstudos(){
	        String sala = lerSala();
	        String tipo = lerTipo();
	        String capacidade = lerCapacidade();
	        String localizacao = lerLocalizacao();
	        List<String> equipamentos = lerEquipamentos();
	     
	        return new SalaDeEstudo( sala, tipo,  capacidade, localizacao, equipamentos);
	    }
	    
	    public static void frontSalaDeEstudo(CadastroSalaDeEstudos cadSalaDeEstudo) {
    String texto = "=== Menu de Sala de aula === \n"
            + "1 - Cadastrar sala de estudos\n"
            + "2 - Pesquisar sala de estudos\n"
            + "3 - Atualizar sala de estudos\n"
            + "4 - Agendar sala de estudos\n"      // NOVA OPÇÃO
            + "5 - Remover sala de estudos\n"      // ANTIGO CASO 4 MOVIDO PARA AQUI
            + "0 - Voltar";

    int escolha = -1;
    do {
        String strEscolha = JOptionPane.showInputDialog(texto);
        if (strEscolha == null) { // Se o usuário clicar em "Cancelar"
            escolha = 0;
            continue;
        }

        try {
            escolha = Integer.parseInt(strEscolha);

            switch (escolha) {
                case 1:
	                	SalaDeEstudo novoSalaDeEstudo = dadosNovoSalaDeEstudos();
	                    cadSalaDeEstudo.cadastrarSalaDeEstudos((novoSalaDeEstudo));
	                    break;

                case 2:
                    String sala = lerSala();
                    if (sala != null) {
                        SalaDeEstudo encontrado = cadSalaDeEstudo.pesquisarSala(sala);
                        JOptionPane.showMessageDialog(null, 
                            encontrado != null ? encontrado.toString() : "Sala não encontrada.");
                    }
                    break;

                case 3:
                    sala = lerSala();
                    if (sala != null) {
                        SalaDeEstudo atualizado = dadosNovoSalaDeEstudos();
                        if (atualizado != null) {
                            boolean sucesso = cadSalaDeEstudo.atualizarSala(sala, atualizado);
                            JOptionPane.showMessageDialog(null, 
                                sucesso ? "Sala atualizada!" : "Falha ao atualizar.");
                        }
                    }
                    break;

                case 4:  // NOVO CASO - AGENDAR SALA
                    sala = lerSala();
                    if (sala != null) {
                        String data = JOptionPane.showInputDialog("Informe a data do agendamento (DD/MM/AAAA):");
                        String horario = JOptionPane.showInputDialog("Informe o horário (HH:MM):");
                        
                        // Aqui você pode chamar um método de agendamento no CadastroEspacoFisico
                        boolean agendado = cadSalaDeEstudo.agendarSala(sala, data, horario);
                        JOptionPane.showMessageDialog(null, 
                            agendado ? "Sala agendada com sucesso!" : "Falha ao agendar.");
                    }
                    break;

                case 5:
	                    sala = lerSala();
	                    SalaDeEstudo remover = cadSalaDeEstudo.pesquisarSalaPorNome(sala);
					boolean removido = cadSalaDeEstudo.removerSala(remover);
					if (removido) {
						JOptionPane.showMessageDialog(null, "Sala removida do cadastro");
						System.gc();
					}
                    break;

                case 0:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
        }
    } while (escolha != 0);
	}

		@Override
	public String toString() {
		return "MenuEspaçoFisico []";
	}
	

	public static void menuAgendamento(CadastroSalaDeAula cadSalaDeEstudo) {
    String texto = "=== Agendamento de Sala === \n"
            + "1 - Agendar sala\n"
            + "0 - Voltar";

    int escolha = -1;
    do {
        String strEscolha = JOptionPane.showInputDialog(texto);
        if (strEscolha == null) { // Se o usuário cancelar
            escolha = 0;
            continue;
        }

        try {
            escolha = Integer.parseInt(strEscolha);

            switch (escolha) {
                case 1:
                    String sala = lerSala();
                    if (sala != null) {
                        String data = JOptionPane.showInputDialog("Informe a data (DD/MM/AAAA):");
                        String horario = JOptionPane.showInputDialog("Informe o horário (HH:MM):");
                        
                        boolean agendado = cadSalaDeEstudo.agendarSala(sala, data, horario);
                        JOptionPane.showMessageDialog(null, 
                            agendado ? "Agendamento realizado!" : "Erro: sala não encontrada ou já reservada.");
                    }
                    break;

                case 0:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
        }
    } while (escolha != 0);
}
}

package Front;

import javax.swing.JOptionPane;

import Cadastros.CadastroEspacoFisico.CadastroSalaDeAula;
import entities.SalaDeAula;


public class MenuSalaDeAula{
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
	private static String lerEquipamentos(){
        return JOptionPane.showInputDialog("Informe os equipamentos da sala: ");

    }
		
	 
	 
	public static SalaDeAula dadosNovoEspacoFisico(){
	        String sala = lerSala();
	        String tipo = lerTipo();
	        String capacidade = lerCapacidade();
	        String localizacao = lerLocalizacao();
	        String equipamentos = lerEquipamentos();
	     
	        return new SalaDeAula( sala, tipo,  capacidade, localizacao, equipamentos);
	    }
	    
	    public static void frontEspacoFisico(CadastroSalaDeAula cadSalaDeAula) {
    String texto = "=== Menu de Espaço Físico === \n"
            + "1 - Cadastrar sala\n"
            + "2 - Pesquisar sala\n"
            + "3 - Atualizar sala\n"
            + "4 - Agendar sala\n"      // NOVA OPÇÃO
            + "5 - Remover sala\n"      // ANTIGO CASO 4 MOVIDO PARA AQUI
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
	                	SalaDeAula novoSalaDeAula = dadosNovoSalaDeAula();
	                    cadSalaDeAula.CadastroSalaDeAula((novoSalaDeAula));
	                    break;

                case 2:
                    String sala = lerSala();
                    if (sala != null) {
                        SalaDeAula encontrado = cadSalaDeAula.pesquisarEspacoFisico(sala);
                        JOptionPane.showMessageDialog(null, 
                            encontrado != null ? encontrado.toString() : "Sala não encontrada.");
                    }
                    break;

                case 3:
                    sala = lerSala();
                    if (sala != null) {
                        SalaDeAula atualizado = dadosNovoEspacoFisico();
                        if (atualizado != null) {
                            boolean sucesso = cadSalaDeAula.atualizarEspacoFisico(sala, atualizado);
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
                        boolean agendado = cadSalaDeAula.agendarEspacoFisico(sala, data, horario);
                        JOptionPane.showMessageDialog(null, 
                            agendado ? "Sala agendada com sucesso!" : "Falha ao agendar.");
                    }
                    break;

                case 5:
	                    sala = lerSala();
	                    SalaDeAula remover = cadSalaDeAula.pesquisarEspacoFisico(sala);
					boolean removido = cadSalaDeAula.removerEspacoFisico(remover);
					if (removido) {
						JOptionPane.showMessageDialog(null, "Sala removida do cadastro");
						System.gc();
					};

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

		
	    
	

	public static void menuAgendamento(CadastroSalaDeAula cadSalaDeAula) {
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
                        
                        boolean agendado = cadEspacoFisico.agendarEspacoFisico(sala, data, horario);
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

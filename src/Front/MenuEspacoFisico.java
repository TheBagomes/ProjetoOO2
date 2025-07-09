package Front;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import Cadastros.CadastroEspacoFisico.CadastroEspacoFisico;
import entities.EspacoFisico;

public class MenuEspacoFisico {

	 protected static String lerSala(){
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
	 
	 private static List<String> lerEquipamentos() {
		    List<String> equipamentos = new ArrayList<>();
		    String input = JOptionPane.showInputDialog(
		        "Informe os equipamentos SEPARADOS POR VÍRGULA:\n" +
		        "Ex: Projetor, Ar condicionado, Quadro branco"
		    );
		    
		    if (input != null && !input.trim().isEmpty()) {
		        String[] itens = input.split(",");
		        for (String item : itens) {
		            equipamentos.add(item.trim());
		        }
		    }
		    return equipamentos;
		}
		
	 
	 
	public static EspacoFisico dadosNovoEspacoFisico(){
	        String sala = lerSala();
	        String tipo = lerTipo();
	        String capacidade = lerCapacidade();
	        String localizacao = lerLocalizacao();
	        List<String> equipamentos = lerEquipamentos();
	        return new EspacoFisico( sala, tipo,  capacidade, localizacao, equipamentos);
	    }
	    
	    public static void frontEspacoFisico(CadastroEspacoFisico cadEspacoFisico) {
    String texto = "=== Menu de Espaço Físico === \n"
            + "1 - Cadastrar sala\n"
            + "2 - Pesquisar sala\n"
            + "3 - Atualizar sala\n"
            + "4 - Agendar sala\n"     
            + "5 - Remover sala\n"      
            + "0 - Voltar";

    int escolha = -1;
    do {
        String strEscolha = JOptionPane.showInputDialog(texto);
        escolha = Integer.parseInt(strEscolha);
        
        switch (escolha) {
        	case 1:
	        	EspacoFisico novoEspacoFisico = dadosNovoEspacoFisico();
	        	cadEspacoFisico.cadastroEspacoFisico((novoEspacoFisico));
	        	break;

        	case 2:
            	String sala = lerSala();
            	if (sala != null) {
            	EspacoFisico encontrado = cadEspacoFisico.pesquisarEspacoFisico(sala);
            	JOptionPane.showMessageDialog(null, 
                	encontrado != null ? encontrado.toString() : "Sala não encontrada.");
                    }
                break;

            case 3:
            	sala = lerSala();
            	if (sala != null) {
                	EspacoFisico atualizado = dadosNovoEspacoFisico();
                	if (atualizado != null) {
                    	boolean sucesso = cadEspacoFisico.atualizarEspacoFisico(sala, atualizado);
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
                        boolean agendado = cadEspacoFisico.agendarEspacoFisico(sala, data, horario);
                        JOptionPane.showMessageDialog(null, 
                            agendado ? "Sala agendada com sucesso!" : "Falha ao agendar.");
                    }
                    break;

                case 5:
	                    sala = lerSala();
	                    EspacoFisico remover = cadEspacoFisico.pesquisarEspacoFisico(sala);
					boolean removido = cadEspacoFisico.removerEspacoFisico(remover);
					if (removido) {
						JOptionPane.showMessageDialog(null, "Sala removida do cadastro");
						System.gc();
					};

                case 0:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        
    	} while (escolha != 0);
	}
		@Override
		public String toString() {
			return "MenuEspaçoFisico []";
		}

	public static void menuAgendamento(CadastroEspacoFisico cadEspacoFisico) {
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

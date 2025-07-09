package Front.MenuEspacoFisico;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import Cadastros.CadastroEspacoFisico.CadastroLaboratorio;
import entities.Laboratorio;

public class MenuLaboratorio {
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

    public static Laboratorio dadosNovoLaboratorio(){
        String sala = lerSala();
        String tipo = lerTipo();
	    String capacidade = lerCapacidade();
	    String localizacao = lerLocalizacao();
	    List<String> equipamentos = lerEquipamentos();
	     
	    return new Laboratorio( sala, tipo,  capacidade, localizacao, equipamentos);
    }

    public static void frontLaboratorio(CadastroLaboratorio cadLaboratorio){
        String texto = "=== Menu de Sala de aula === \n"
            + "1 - Cadastrar Laboratorio\n"
            + "2 - Pesquisar Laboratorio\n"
            + "3 - Atualizar Laboratorio\n"
            + "4 - Agendar Laboratorio\n"  
            + "5 - Remover Laboratorio\n"      
            + "0 - Voltar";

            int escolha = -1;
            do{
                String strEscolha = JOptionPane.showInputDialog(texto);
                if(strEscolha == null){
                    escolha = 0;
                    continue;
                }

                try{
                    escolha = Integer.parseInt(strEscolha);

                    switch (escolha) {
                        case 1:
                            Laboratorio novLaboratorio = dadosNovoLaboratorio();
                            cadLaboratorio.cadastrarLaboratorio(novLaboratorio);
                            break;
                        

                        case 2:
                            String sala = lerSala();
                            if(sala != null){
                                Laboratorio encontrado = cadLaboratorio.pesquisarLaboratorio(sala);
                                JOptionPane.showMessageDialog(null, encontrado != null ? encontrado.toString() : "Sala não encontrada.");
                            }
                            break;

                        case 3:
                            sala = lerSala();
                            if(sala != null){
                                Laboratorio atualizado = dadosNovoLaboratorio();
                                if(atualizado != null){
                                    boolean sucesso = cadLaboratorio.atualizarLaboratorio(sala, atualizado);
                                JOptionPane.showMessageDialog(null, sucesso ? "Laboratorio atualizado!" : "Falha ao atualizar.");
                                }
                            }
                            break;

                        case 4:
                            sala = lerSala();
                            if(sala != null){
                                String data = JOptionPane.showInputDialog("Informe a data do agendamento (DD/MM/AAAA):");
                                String horario = JOptionPane.showInputDialog("Informe o horário (HH:MM):");

                                boolean agendado = cadLaboratorio.agendarSala(sala, data, horario);
                                JOptionPane.showMessageDialog(null, agendado ? "Sala agendada com sucesso!" : "Falha ao agendar.");
                            } 

                        case 5:
                            sala = lerSala();
                            Laboratorio remover = cadLaboratorio.pesquisarLaboratorio(sala);
                            boolean removido = cadLaboratorio.removerLaboratorio(remover);
                            if(removido){
                                JOptionPane.showMessageDialog(null, "Sala removido do cadastro");
                                System.gc();
                            }
                            break;

                        case 0:
                            break;

                        default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                        
                    }

                }catch(NumberFormatException w){
                    JOptionPane.showMessageDialog(null, "Digite um número válido!");
                }
            } while(escolha != 0);
    }

    @Override
    public String toString(){
        return "Menu Laboratorio []";
    }

    public static void menuAgendamento(CadastroLaboratorio cadLaboratorio) {
    String texto = "=== Agendamento de Laboratorio === \n"
            + "1 - Agendar sala\n"
            + "0 - Voltar";

    int escolha = -1;

    do{
        String strEscolha = JOptionPane.showInputDialog(texto);
        if(strEscolha == null){
            escolha = 0;
            continue;
        }

        try{
            escolha = Integer.parseInt(strEscolha);

            switch (escolha) {
                case 1:
                    String sala = lerSala();
                    if (sala != null) {
                        String data = JOptionPane.showInputDialog("Informe a data (DD/MM/AAAA):");
                        String horario = JOptionPane.showInputDialog("Informe o horário (HH:MM):");

                        boolean agendado = cadLaboratorio.agendarSala(sala, data, horario);
                        JOptionPane.showInputDialog(null, agendado ? "Agendamento realizado!" : "Erro: Laboratorio não encontrado ou já reservado.");
        
                    }    
                    break;
                
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um número válido!");

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
        }
    }while (escolha != 0);
    }
}

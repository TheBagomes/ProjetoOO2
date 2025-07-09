package Front.MenuPessoaFisica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Cadastros.CadastroEspacoFisico.CadastroAgendamento;
import entities.Agendamento;
import entities.Servidor;

public class MenuServidor2{
	static ImageIcon icon = new ImageIcon(MenuServidor2.class.getResource("/resources/iconeServidor.png"));

    private static String lerNome(){
         return JOptionPane.showInputDialog("Informe o nome do(a) servidor(a): ");

    }
    private static String lerEmail(){
        return JOptionPane.showInputDialog("Informe o Email do(a) servidor(a): ");

    }
    private static String lerMatriculaServ(){
        return JOptionPane.showInputDialog("Informe a matricula do(a) servidor(a): ");
    }

    private static String lerTelefone(){
        return JOptionPane.showInputDialog("Informe o telefone do(a) servidor(a): ");

    }
    private static String lerSenha(){
        return JOptionPane.showInputDialog("Informe a senha do(a) servidor(a): ");
    }
    private static String lerCargoSer(){
        return JOptionPane.showInputDialog("Informe o cargo do(a) servidor(a): ");
    }
    private static String lerDepartamento(){
        return JOptionPane.showInputDialog("Informe o Departamento do(a) servidor(a): ");
    }
    private static String lerfuncao(){
        return JOptionPane.showInputDialog("Informe a função do(a) servidor(a): ");
    }
    
    
    public static Servidor dadosNovoServidor(){
        String nome = lerNome();
        String email = lerEmail();
        String matricula = lerMatriculaServ();
        String telefone = lerTelefone();
        String senha = lerSenha();
        String cargo = lerCargoSer();
        String departamento = lerDepartamento();
        String funcao = lerfuncao();
        return new Servidor(nome, email, matricula, telefone, senha, cargo, departamento, funcao); 
    }
    
    public static void frontServidor(Cadastros.CadastoPessoaFisica.CadastroServidores cadServidor){
        String texto = "=== Menu de Servidor === \n"
                    + "1 - Fazer cadastro\n"
                    + "2 - Pesquisar Servidor\n"
                    + "3 - Atualizar Servidor\n"
                    + "4 - Remover Servidor\n"
                    + "5 - Agendar Espaços Físicos\n"  
                    + "0 - Voltar para menu anterior";
        
        int escolha = -1;
        do{
        	String strEscolha = (String) JOptionPane.showInputDialog(
            		null,
            		texto,
            		"Menu Servidor",
    	            JOptionPane.QUESTION_MESSAGE,
    	            icon,
    	            null,
    	            null
            		);

            escolha = Integer.parseInt(strEscolha);

            switch (escolha){
                case 1:
                    Servidor novoServidor = dadosNovoServidor();
                    cadServidor.cadastroServidores((novoServidor));
                    break;

                case 2:
                    String matricula = lerMatriculaServ();
                    Servidor pos = cadServidor.pesquisarServidor(matricula);
                    if(pos != null){
                        JOptionPane.showMessageDialog(null, pos.toString());
                    }
                    break;

                case 3:
                    matricula = lerMatriculaServ();
                    Servidor novoCadastro = dadosNovoServidor();
                    boolean atualizado = cadServidor.atualizarServidor(matricula, novoCadastro);
                    if(atualizado){
                        JOptionPane.showMessageDialog(null, "Cadastro do Servidor(a) atualizado");
                    }
                    break;

                case 4:
                    matricula = lerMatriculaServ();
				Servidor remover = cadServidor.pesquisarServidor(matricula);
				boolean removido = cadServidor.removerServidor(matricula, remover);
				if (removido) {
					JOptionPane.showMessageDialog(null, "Servidor(a) removido do cadastro");
					System.gc();
				}
                case 5:  // NOVO CASO - ABRE O MENU DE ESPAÇO FÍSICO
                	 while (true) {
                         String opcao = JOptionPane.showInputDialog(
                             " Sistema de Agendamento de Salas\n\n" +
                             "1. Novo Agendamento\n" +
                             "2. Listar Agendamentos\n" +
                             "0. Sair\n\n" +
                             "Digite sua opção:");

                         if (opcao == null || opcao.equals("0")) break;

                         switch (opcao) {
                             case "1":
                                 String sala = JOptionPane.showInputDialog("Sala:");
                                 String data = JOptionPane.showInputDialog("Data (DD/MM/AAAA):");
                                 String inicio = JOptionPane.showInputDialog("Horário de Início (HH:MM):");
                                 String fim = JOptionPane.showInputDialog("Horário de Término (HH:MM):");
                                 String usuario = JOptionPane.showInputDialog("Responsável:");

                                 boolean sucesso = CadastroAgendamento.adicionarAgendamento(sala, data, inicio, fim, usuario);
                                 if (sucesso) {
                                     JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso!");
                                 }
                                 break;

                             case "2":
                                 StringBuilder lista = new StringBuilder(" Agendamentos:\n\n");
                                 for (Agendamento ag : CadastroAgendamento.listarAgendamentos()) {
                                     lista.append(ag.toString()).append("\n\n");
                                 }
                                 JOptionPane.showMessageDialog(null, lista.toString());
                                 break;

                             default:
                                 JOptionPane.showMessageDialog(null, " Opção inválida!");
                         }
                     }
                    break;

			    default:
				    break;
                

            }

        } while (escolha != 0); 
        return;
    }
    
}
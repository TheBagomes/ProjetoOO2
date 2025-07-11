package Front.MenuPessoaFisica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Cadastros.CadastroEspacoFisico.CadastroAgendamento;
import entities.Agendamento;
import entities.Aluno;

public class MenuAluno {
	static ImageIcon icon = new ImageIcon(MenuAluno.class.getResource("/resources/iconeAluno.png"));

    private static String lerCurso(){
        return JOptionPane.showInputDialog("Informe o curso do(a) aluno(a): ");
    }
    private static String lerEmail() {
		return JOptionPane.showInputDialog("Informe o email do(a) aluno(a): ");
	}

	private static String lerTelefone() {
		return JOptionPane.showInputDialog("Informe o telefone de contato do(a) aluno(a): ");
	}

	private static String lerNome() {
		return JOptionPane.showInputDialog("Informe o nome do(a) aluno(a): ");
	}

	private static String lerMatricula() {
		return JOptionPane.showInputDialog("Informe a matricula do(a) aluno(a): ");
	}

    private static String lerSenha(){
        return JOptionPane.showInputDialog("Digite a senha(a): ");
    }
    
    private static String lerSemestreInicial(){
        return JOptionPane.showInputDialog("Informe o semestre inicial do(a) aluno(a): ");
    }


    public static Aluno dadosNovoAlunos(){
        String nome = lerNome();
        String email = lerEmail();
        String telefone = lerTelefone();
        String senha = lerSenha();
        String curso = lerCurso();
        String matricula = lerMatricula();
        String semestreInicial = lerSemestreInicial();
        return new Aluno(nome, email, telefone, senha, curso, matricula, semestreInicial); 
    }
    
    public static void frontAluno(Cadastros.CadastoPessoaFisica.CadastroAluno cadAluno){
        String texto = "=== Menu de Aluno === \n"
            + "1 - Fazer cadastro\n"
            + "2 - Pesquisar aluno\n"
            + "3 - Atualizar aluno\n"
            + "4 - Remover aluno\n"
            + "5 - Agendar Espaços Físicos\n"
            + "0 - Voltar para menu anterior";

        int escolha = -1;
        do{
            String strEscolha = (String) JOptionPane.showInputDialog(
            		null,
            		texto,
            		"Menu Aluno",
    	            JOptionPane.QUESTION_MESSAGE,
    	            icon,
    	            null,
    	            null
            		);
            escolha = Integer.parseInt(strEscolha);

            switch (escolha){
                case 1:
                    Aluno novoAluno = dadosNovoAlunos();
                    cadAluno.cadastrarAluno((novoAluno));
                    break;

                case 2:
                    String matricula = lerMatricula();
                    Aluno pos = cadAluno.pesquisarAluno(matricula);
                    if(pos != null){
                        JOptionPane.showMessageDialog(null, pos.toString());
                    }
                    break;

                case 3:
                    matricula = lerMatricula();
                    Aluno novoCadastro = dadosNovoAlunos();
                    boolean atualizado = cadAluno.atualizarAluno(matricula, novoCadastro);
                    if(atualizado){
                        JOptionPane.showMessageDialog(null, "Cadastro do aluno atualizado");
                    }
                    break;

                case 4:
                    matricula = lerMatricula();
				Aluno remover = cadAluno.pesquisarAluno(matricula);
				boolean removido = cadAluno.removerAluno(remover);
				if (removido) {
					JOptionPane.showMessageDialog(null, "Aluno removido do cadastro");
					System.gc();
				}
				break;

                case 5:
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
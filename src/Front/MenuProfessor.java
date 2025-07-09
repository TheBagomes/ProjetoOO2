package Front;

import javax.swing.JOptionPane;

//import Cadastros.CadastroEspacoFisico.CadastroEspacoFisico;
//import Cadastros.CadastoPessoaFisica.CadastroProfessor;

import entities.Professor;

public class MenuProfessor {
    private static String lerNome() {
		return JOptionPane.showInputDialog("Informe o nome do(a) professor(a): ");
	}

    private static String lerCurso(){
        return JOptionPane.showInputDialog("Informe o curso do(a) professor(a): ");
    }
    private static String lerEmail() {
		return JOptionPane.showInputDialog("Informe o email do(a) professor(a): ");
	}

	private static String lerTelefone() {
		return JOptionPane.showInputDialog("Informe o telefone de contato do(a) professor(a): ");
	}

	private static String LerMatriculaProf() {
		return JOptionPane.showInputDialog("Informe a matricula do(a) professor(a): ");
	}

    private static String lerSenha(){
        return JOptionPane.showInputDialog("Digite a senha do(a) professor(a): ");
    }
    
    private static String lerCargoAcademico(){
        return JOptionPane.showInputDialog("Informe o cargo academico do(a) professor(a): ");
    }


    public static Professor dadosNovoProfessor(){
        String nome = lerNome();
        String email = lerEmail();
        String telefone = lerTelefone();
        String senha = lerSenha();
        String curso = lerCurso();
        String matriculaProf = LerMatriculaProf();
        String cargoAcademico = lerCargoAcademico();
        return new Professor(nome, email, telefone, senha, matriculaProf, curso, cargoAcademico); 
    }
    
    public static void frontProfessor(Cadastros.CadastoPessoaFisica.CadastroProfessor cadProfessor){
        String texto = "=== Menu de Professor === \n"
                    + "1 - Fazer cadastro\n"
                    + "2 - Pesquisar professor\n"
                    + "3 - Atualizar professor\n"
                    + "4 - Remover professor\n"
                    + "5 - Gerenciar Espaços Físicos\n"  // NOVA OPÇÃO
                    + "0 - Voltar para menu anterior";

        
        int escolha = -1;
        do{
            String strEscolha = JOptionPane.showInputDialog(texto);
            escolha = Integer.parseInt(strEscolha);

            switch (escolha){
                case 1:
                    Professor novoProfessor = dadosNovoProfessor();
                    cadProfessor.cadastrarProfessor(novoProfessor);
                    break;

                case 2:
                    String matriculaProf = LerMatriculaProf();
                    Professor pos = cadProfessor.pesquisaProfessor(matriculaProf);
                    if(pos != null){
                        JOptionPane.showMessageDialog(null, pos.toString());
                    }
                    break;

                case 3:
                    matriculaProf = LerMatriculaProf();
                    Professor novoCadastro = dadosNovoProfessor();
                    boolean atualizado = cadProfessor.atualizarProfessor(matriculaProf, novoCadastro);
                    if(atualizado){
                        JOptionPane.showMessageDialog(null, "Cadastro do professor atualizado");
                    }
                    break;

                case 4:
                    matriculaProf = LerMatriculaProf();
				Professor remover = cadProfessor.pesquisaProfessor(matriculaProf);
				boolean removido = cadProfessor.removerProfessor(remover);
				if (removido) {
					JOptionPane.showMessageDialog(null, "Professor removido do cadastro");
					System.gc();
				}

                case 5:  // NOVO CASO - ABRE O MENU DE ESPAÇO FÍSICO
                    MenuTipos.EscolherTipo();
                    break;

			    default:
				    break;
            }

        } while (escolha != 0); 
        return;
    }
}

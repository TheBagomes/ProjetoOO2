package Front;

import javax.swing.JOptionPane;

import Cadastros.CadastroPessoaFisica.CadastroAluno;
import entities.Aluno;

public class MenuAluno {

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

    public static void frontAluno(CadastroAluno cadAluno){
        String texto = "=== Menu de Aluno === \n"
                    + "1 - Fazer cadastro\n"
                    + "2 - Pesquisar aluno\n"
                    + "3 - Atualizar aluno\n"
                    + "4 - Remover aluno\n"
                    + "0 - Voltar para menu anterior";
        
        int escolha = -1;
        do{
            String strEscolha = JOptionPane.showInputDialog(texto);
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

			    default:
				    break;
                

            }

        } while (escolha != 0); 
        return;
    }
    

}

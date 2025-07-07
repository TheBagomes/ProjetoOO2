package Front;

import javax.swing.JOptionPane;

import entities.Servidor;
import Cadastros.CadastroServidores;

public class MenuServidor2{

    private static String lerNome(){
         return JOptionPane.showInputDialog("Informe o nome do servidor: ");

    }
    private static String lerEmail(){
        return JOptionPane.showInputDialog("Informe o Email do Servidor: ");

    }
    private static String lerMatriculaServ(){
        return JOptionPane.showInputDialog("Informe a matricula do servidor: ");
    }

    private static String lerTelefone(){
        return JOptionPane.showInputDialog("Informe o telefone do servidor: ");

    }
    private static String lerSenha(){
        return JOptionPane.showInputDialog("Informe a senha do servidor: ");
    }
    private static String lerCargoSer(){
        return JOptionPane.showInputDialog("Informe o cargo do servidor: ");
    }
    private static String lerDepartamento(){
        return JOptionPane.showInputDialog("Informe o Departamento do servidor: ");
    }
    private static String lerfuncao(){
        return JOptionPane.showInputDialog("Informe a função do servidor: ");
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
    
    public static void frontServidor(CadastroServidores cadServidor){
        String texto = "=== Menu de Servidor === \n"
                    + "1 - Fazer cadastro\n"
                    + "2 - Pesquisar Servidor\n"
                    + "3 - Atualizar Servidor\n"
                    + "4 - Remover Servidor\n"
                    + "0 - Voltar para menu anterior";
        
        int escolha = -1;
        do{
            String strEscolha = JOptionPane.showInputDialog(texto);
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

			    default:
				    break;
                

            }

        } while (escolha != 0); 
        return;
    }
    
}

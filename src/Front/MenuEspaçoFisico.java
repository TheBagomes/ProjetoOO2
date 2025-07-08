package Front;

import javax.swing.JOptionPane;
import Cadastros.CadastroEspacoFisico.CadastroEspacoFisico;
import entities.EspacoFisico;

public class MenuEspaçoFisico {

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
		
	 
	 
	public static EspacoFisico dadosNovoEspacoFisico(){
	        String sala = lerSala();
	        String tipo = lerTipo();
	        String capacidade = lerCapacidade();
	        String localizacao = lerLocalizacao();
	        String equipamentos = lerEquipamentos();
	     
	        return new EspacoFisico( sala, tipo,  capacidade, localizacao, equipamentos);
	    }
	    
	    public static void frontEspacoFisico(CadastroEspacoFisico cadEspacoFisico){
	        String texto = "=== Menu de Espaço Fisico === \n"
	                    + "1 - Fazer cadastro\n"
	                    + "2 - Pesquisar Espaço Fisico\n"
	                    + "3 - Atualizar Espaço Fisico\n"
	                    + "4 - Remover Espaço Fisico\n"
	                    + "0 - Voltar para menu anterior";
	        
	        int escolha = -1;
	        do{
	            String strEscolha = JOptionPane.showInputDialog(texto);
	            escolha = Integer.parseInt(strEscolha);

	            switch (escolha){
	                case 1:
	                	EspacoFisico novoEspacoFisico = dadosNovoEspacoFisico();
	                    cadEspacoFisico.cadastroEspacoFisico((novoEspacoFisico));
	                    break;

	                case 2:
	                    String sala = lerSala();
	                    EspacoFisico pos = cadEspacoFisico.pesquisarEspacoFisico(sala);
	                    if(pos != null){
	                        JOptionPane.showMessageDialog(null, pos.toString());
	                    }
	                    break;

	                case 3:
	                    sala = lerSala();
	                    EspacoFisico novoCadastro = dadosNovoEspacoFisico();
	                    boolean atualizado = cadEspacoFisico.atualizarEspacoFisico(sala, novoCadastro);
	                    if(atualizado){
	                        JOptionPane.showMessageDialog(null, "Cadastro do Servidor(a) atualizado");
	                    }
	                    break;

	                case 4:
	                    sala = lerSala();
	                    EspacoFisico remover = cadEspacoFisico.pesquisarEspacoFisico(sala);
					boolean removido = cadEspacoFisico.removerEspacoFisico(remover);
					if (removido) {
						JOptionPane.showMessageDialog(null, "Sala removida do cadastro");
						System.gc();
					}

				    default:
					    break;
	               
	            }

	        } while (escolha != 0); 
	        return;
	    }

		@Override
		public String toString() {
			return "MenuEspaçoFisico []";
		}

		
	    
	
}

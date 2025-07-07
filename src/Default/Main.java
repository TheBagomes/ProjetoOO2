package Default;

import javax.swing.JOptionPane;


import Front.MenuServidor2;
import Cadastros.CadastroPessoaFisica.CadastroAluno;
import Cadastros.CadastroPessoaFisica.CadastroProfessor;
import Cadastros.CadastroPessoaFisica.CadastroServidores;
import Front.MenuAluno;
import Front.MenuPadrao;
import Front.MenuProfessor;

public class Main {
    static CadastroAluno cadAluno;
    static CadastroProfessor cadProfessor;
    static CadastroServidores cadServidor;
	
	public static void main(String[] args) {
		cadAluno = new CadastroAluno();
		cadProfessor = new CadastroProfessor();
		cadServidor = new CadastroServidores();
		
		int escolha = 0; 
		
		do {
			escolha = MenuPadrao.menuOpcoes(); 
			switch (escolha) {
				case 1: 
					MenuAluno.frontAluno(cadAluno); 
				break;
				case 2: 
                    MenuProfessor.frontProfessor(cadProfessor);
				break;
				case 3: 
					MenuServidor2.frontServidor(cadServidor);
				break;
				case 4: 
					JOptionPane.showMessageDialog(null, "Cadastro de turmas a ser implementado");
				break;
				case 0: 
				break;
				default: 
					JOptionPane.showMessageDialog(null, "Opcao invalida");
					escolha = -1;
				break;
			}
		} while (escolha != 0);
		return;
	}

}

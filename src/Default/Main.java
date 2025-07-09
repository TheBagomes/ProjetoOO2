package Default;

import javax.swing.JOptionPane;
import Front.MenuPadrao;
import Front.MenuTipos;
import Front.MenuPessoaFisica.MenuAluno;
import Front.MenuPessoaFisica.MenuProfessor;
import Front.MenuPessoaFisica.MenuServidor2;

public class Main {
    static Cadastros.CadastoPessoaFisica.CadastroAluno cadAluno;
    static Cadastros.CadastoPessoaFisica.CadastroProfessor cadProfessor;
    static Cadastros.CadastoPessoaFisica.CadastroServidores cadServidor;
    static Cadastros.CadastroEspacoFisico.CadastroEspacoFisico cadEspacoFisico;
	
	public static void main(String[] args) {
		cadAluno = new Cadastros.CadastoPessoaFisica.CadastroAluno();
		cadProfessor = new Cadastros.CadastoPessoaFisica.CadastroProfessor();
		cadServidor = new Cadastros.CadastoPessoaFisica.CadastroServidores();
		cadEspacoFisico = new Cadastros.CadastroEspacoFisico.CadastroEspacoFisico();
		
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
					MenuTipos.EscolherTipo(tipoe);
					break;
				case 0: 
					break;
				default: 
					JOptionPane.showMessageDialog(null, "Opcao inválida");
					escolha = -1;
				break;
			}
		} while (escolha != 0);
		return;
	}

}

package Front;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Front.MenuPessoaFisica.MenuAluno;

public class MenuPadrao {
	static ImageIcon icon = new ImageIcon(MenuPadrao.class.getResource("/resources/iconeMenus.png"));

    public static int menuOpcoes() {
		String opcoes = " === Menu === \n" + "1 - Abrir Menu de Alunos \n"
				      + "2 - Abrir Menu de Professores \n"
				      + "3 - Abrir Menu de Servidores \n"
				      + "4 - Abrir Menu  de Espaço Fisíco \n"
				      + "5 - Emitir relatório de utilização \n"
				      + "0 - Sair";
	
		String strOpcao = (String) JOptionPane.showInputDialog(
        		null,
        		opcoes,
        		"Menu Aluno",
	            JOptionPane.QUESTION_MESSAGE,
	            icon,
	            null,
	            null
        		);
		
		int opcao = Integer.parseInt(strOpcao);
	
		return opcao;
	}
}

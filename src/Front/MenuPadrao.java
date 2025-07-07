package Front;

import javax.swing.JOptionPane;

public class MenuPadrao {
    public static int menuOpcoes() {
		String opcoes = " === Menu === \n" + "1 - Abrir Menu de Alunos \n"
				      + "2 - Abrir Menu de Professores \n"
				      + "3 - Abrir Menu de Servidores \n"
				      + "4 - Abrir Menu  de Espaço Fisíco \n"
				      + "0 - Sair";
	
		String strOpcao = JOptionPane.showInputDialog(opcoes);
		int opcao = Integer.parseInt(strOpcao);
	
		return opcao;
	}
}

package Front;

import javax.swing.JOptionPane;

public class MenuPadrao {
    public static int menuOpcoes() {
		String opcoes = " === Menu === \n" + "1 - Abrir Menu Aluno \n"
				      + "2 - Abrir Menu Professor \n"
				      + "3 - Abrir Menu Servidores \n"
				      + "4 - Abrir Menu Espaço Fisíco \n"
				      + "0 - Sair";
	
		String strOpcao = JOptionPane.showInputDialog(opcoes);
		int opcao = Integer.parseInt(strOpcao);
	
		return opcao;
	}
}

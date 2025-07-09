package Front;

import javax.swing.JOptionPane;
import Cadastros.CadastroEspacoFisico.CadastroEspacoFisico;
import Cadastros.CadastroEspacoFisico.CadastroLaboratorio;
import Cadastros.CadastroEspacoFisico.CadastroSalaDeAula;
import Cadastros.CadastroEspacoFisico.CadastroSalaDeEstudos;
import Front.MenuEspacoFisico.MenuEspacoFisico;
import Front.MenuEspacoFisico.MenuLaboratorio;
import Front.MenuEspacoFisico.MenuSalaDeAula;
import Front.MenuEspacoFisico.MenuSalaDeEstudos;

public class MenuTipos extends MenuSalaDeAula {
    static CadastroLaboratorio cadLaboratorio;
    static CadastroSalaDeAula cadSalaDeAula;
	static CadastroSalaDeEstudos cadSalaDeEstudos;
    static Cadastros.CadastroEspacoFisico.CadastroEspacoFisico cadAutidorio;

    public static void EscolherTipo(){
        String texto = "=== Menu de Espaço Fisico === \n"
            + "1 - Sala de Aula\n"
            + "2 - Sala de Estudos\n"
            + "3 - Laboratorio\n"
            + "4 - Autitorio \n"
            + "0 - Voltar para menu anterior";

        int escolha = -1;
        do{
            String strEscolha = JOptionPane.showInputDialog(texto);
            if (strEscolha == null) break; // Se o usuário cancelar

            try {
                escolha = Integer.parseInt(strEscolha);

                switch (escolha) {
                    case 1:

                        MenuSalaDeAula.frontSalaDeAula(cadSalaDeAula);
                        break;
                    
                    case 2:
                        MenuSalaDeEstudos.frontSalaDeEstudo(cadSalaDeEstudos);
                        break;

                    case 3: 
                        MenuLaboratorio.frontLaboratorio(cadLaboratorio);
                        break;

                    case 4:
                        MenuEspacoFisico.frontEspacoFisico(cadSalaDeEstudos);
                        break;
                       default:
                            JOptionPane.showMessageDialog(null, "Opcao inválida");
					        escolha = -1;
                        break;
                }
            } catch(NumberFormatException a){
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
            }
            
        } while(true);
        return;
    }



    public static void menuAgendamento(CadastroEspacoFisico cadEspacoFisico) {
    String texto = "=== Agendamento de Sala === \n"
            + "1 - Agendar sala\n"
            + "0 - Voltar";
                                
    int escolha = -1;
    do {
        String strEscolha = JOptionPane.showInputDialog(texto);
        if (strEscolha == null) { // Se o usuário cancelar
            escolha = 0;
            continue;
        }

        try {
            escolha = Integer.parseInt(strEscolha);

            switch (escolha) {
                case 1:
                    String sala = lerSala();
                    if (sala != null) {
                        String data = JOptionPane.showInputDialog("Informe a data (DD/MM/AAAA):");
                        String horario = JOptionPane.showInputDialog("Informe o horário (HH:MM):");
                        
                        boolean agendado = cadEspacoFisico.agendarEspacoFisico(sala, data, horario);
                        JOptionPane.showMessageDialog(null, 
                            agendado ? "Agendamento realizado!" : "Erro: sala não encontrada ou já reservada.");
                    }
                    break;

                case 0:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
        }
    } while (escolha != 0);
}
} 

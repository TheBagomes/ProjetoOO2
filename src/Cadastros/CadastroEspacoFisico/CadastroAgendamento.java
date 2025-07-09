package Cadastros.CadastroEspacoFisico;

import entities.Agendamento;
import java.util.ArrayList;
import java.util.List;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class CadastroAgendamento {
    private static List<Agendamento> agendamentos = new ArrayList<>();
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");

    // Adiciona um agendamento à lista
    public static boolean adicionarAgendamento(String sala, String data, String horario, String usuario) {
        try {
        	 LocalDate dataAgendamento = LocalDate.parse(data, DATE_FORMAT);
             LocalTime horaAgendamento = LocalTime.parse(horario, TIME_FORMAT);
             
             if (!horarioDisponivel(dataAgendamento, horaAgendamento)) {
                 JOptionPane.showMessageDialog(null, 
                     "Horário indisponível!\nSó permitido dias úteis (seg-sex) das 8h às 18h",
                     "Erro", JOptionPane.ERROR_MESSAGE);
                 return false;
             }
        	
            Agendamento novoAgendamento = new Agendamento(sala, usuario, horario, data);
            agendamentos.add(novoAgendamento);
            return true;
            
        } catch (Exception e) {
        	JOptionPane.showMessageDialog(null, 
                    "Formato inválido! Use DD/MM/AAAA para data e HH:MM para horário",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        	
            return false;
        }
    }
    
    private static boolean horarioDisponivel(LocalDate data, LocalTime hora) {
        DayOfWeek dia = data.getDayOfWeek();
        boolean isDiaUtil = !(dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY);
        boolean isHorarioComercial = hora.isAfter(LocalTime.of(7, 59)) && 
                                   hora.isBefore(LocalTime.of(18, 1));
        return isDiaUtil && isHorarioComercial;
    }

    // Retorna todos os agendamentos
    public static List<Agendamento> listarAgendamentos() {
        return new ArrayList<>(agendamentos); // Retorna uma cópia para evitar modificações externas
     
    }
    
   
}

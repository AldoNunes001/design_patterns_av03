package br.edu.clinica.service;

import br.edu.clinica.model.Consulta;

public class EstadoConsultaService {

    public void avancar(Consulta c){
        // PADRÃO SUGERIDO: STATE
        // Ideia: encapsular cada estado como classe (Agendada, EmAtendimento, Concluida, Cancelada)
        // com transições válidas via método "avancar/cancelar".
        // TODO alunos: substituir String por objeto EstadoConsulta.
        switch (c.getEstado()) {
            case "AGENDADA" -> c.setEstado("EM_ATENDIMENTO");
            case "EM_ATENDIMENTO" -> c.setEstado("CONCLUIDA");
            default -> { /* nada */ }
        }
        System.out.println("[Service] Estado => " + c.getEstado());
    }

    public void cancelar(Consulta c){
        // TODO alunos: mover esta transição para o Estado (padrão State).
        c.setEstado("CANCELADA");
        System.out.println("[Service] Estado => " + c.getEstado());
    }
}

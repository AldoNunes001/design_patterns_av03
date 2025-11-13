package br.edu.clinica.service;

import br.edu.clinica.model.Paciente;

public class EstrategiaAtendimentoService {

    public void atenderPresencial(Paciente p){
        // PADRÃO SUGERIDO: STRATEGY
        // Ideia: interface EstrategiaAtendimento com implementações:
        // Presencial, Telemedicina, Emergencia. Escolher em runtime.
        // TODO alunos: criar a hierarquia de estratégias e um "Context".
        System.out.println("[Service] Atendimento presencial: " + p.getNome());
    }

    public void atenderTelemedicina(Paciente p){
        System.out.println("[Service] Telemedicina: " + p.getNome());
    }

    public void atenderEmergencia(Paciente p){
        System.out.println("[Service] Emergência: " + p.getNome());
    }
}

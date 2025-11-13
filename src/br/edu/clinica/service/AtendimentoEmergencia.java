package br.edu.clinica.service;

import br.edu.clinica.model.Paciente;

public class AtendimentoEmergencia implements EstrategiaAtendimento {
    @Override
    public void atender(Paciente paciente) {
        System.out.println("[Service] Emergência: " + paciente.getNome());
    }

    @Override
    public String getTipo() {
        return "EMERGENCIA";
    }
}

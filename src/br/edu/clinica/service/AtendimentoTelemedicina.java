package br.edu.clinica.service;

import br.edu.clinica.model.Paciente;

public class AtendimentoTelemedicina implements EstrategiaAtendimento {
    @Override
    public void atender(Paciente paciente) {
        System.out.println("[Service] Telemedicina: " + paciente.getNome());
    }

    @Override
    public String getTipo() {
        return "TELEMEDICINA";
    }
}

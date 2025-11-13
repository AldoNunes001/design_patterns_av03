package br.edu.clinica.service;

import br.edu.clinica.model.Paciente;

public class AtendimentoPresencial implements EstrategiaAtendimento {
    @Override
    public void atender(Paciente paciente) {
        System.out.println("[Service] Atendimento presencial: " + paciente.getNome());
    }

    @Override
    public String getTipo() {
        return "PRESENCIAL";
    }
}

package br.edu.clinica.service;

import br.edu.clinica.model.Paciente;

public interface EstrategiaAtendimento {
    void atender(Paciente paciente);
    String getTipo();
}


package br.edu.clinica.service;

import br.edu.clinica.model.Paciente;

public class EncaminhamentoService {
    public void encaminhar(Paciente p){
        // PADRÃO SUGERIDO: CHAIN OF RESPONSIBILITY
        // Ideia: TriagemHandler -> ClinicoGeralHandler -> EspecialistaHandler...
        // Cada "Handler" decide se trata ou passa adiante.
        // TODO alunos: criar abstração Handler e cadeia configurável.
        System.out.println("[Service] Encaminhando paciente: " + p);
    }
}

package br.edu.clinica.service;

import br.edu.clinica.model.Prescricao;

public class PrescricaoService {
    public void interpretar(Prescricao prescricao){
        // PADRÃO SUGERIDO: INTERPRETER
        // Ideia: Expressões (term, interval, duration) que interpretam strings:
        // "1cp 8/8h por 5d" => comprimidos=1, intervalo=8h, dias=5
        // TODO alunos: criar gramática simples e Expressões que atualizam um Contexto.
        System.out.println("[Service] Interpretando prescrição: " + prescricao.getTexto());
    }
}

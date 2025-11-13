package br.edu.clinica.controller;

import br.edu.clinica.model.Prescricao;
import br.edu.clinica.service.PrescricaoService;
import br.edu.clinica.view.ConsoleView;

public class PrescricaoController {
    private final ConsoleView view = new ConsoleView();
    private final PrescricaoService prescricaoService = new PrescricaoService();

    public void interpretarPrescricao(){
        view.titulo("Interpreter — Prescrição");
        var p = new Prescricao("1cp 8/8h por 5d");
        prescricaoService.interpretar(p);
        view.linha();
    }
}

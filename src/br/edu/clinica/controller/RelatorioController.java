package br.edu.clinica.controller;

import br.edu.clinica.model.RegistroClinico;
import br.edu.clinica.model.RegistroConsulta;
import br.edu.clinica.model.RegistroPrescricao;
import br.edu.clinica.service.RelatorioService;
import br.edu.clinica.service.VisitaService;
import br.edu.clinica.view.ConsoleView;

import java.util.List;

public class RelatorioController {
    private final ConsoleView view = new ConsoleView();
    private final RelatorioService relatorioService = new RelatorioService();
    private final VisitaService visitaService = new VisitaService();

    public void gerarRelatorio(){
        view.titulo("Template Method — Relatórios");
        relatorioService.gerarRelatorioConsulta();
        view.linha();
    }

    public void executarVisitante(){
        view.titulo("Visitor — Operação sobre registros diversos");
        List<RegistroClinico> registros = List.of(
                new RegistroConsulta("c-001"),
                new RegistroPrescricao("p-010"),
                new RegistroConsulta("c-002")
        );
        visitaService.visitarRegistros(registros);
        view.linha();
    }
}

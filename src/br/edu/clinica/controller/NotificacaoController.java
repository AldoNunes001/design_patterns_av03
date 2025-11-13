package br.edu.clinica.controller;

import br.edu.clinica.service.ComunicacaoService;
import br.edu.clinica.service.NotificacaoService;
import br.edu.clinica.view.ConsoleView;

public class NotificacaoController {
    private final ConsoleView view = new ConsoleView();
    private final ComunicacaoService comunicacaoService = new ComunicacaoService();
    private final NotificacaoService notificacaoService = new NotificacaoService();

    public void comunicarEntreSetores(){
        view.titulo("Mediator — Comunicação entre setores");
        comunicacaoService.enviar("Recepcao", "Laboratorio", "Paciente aguardando coleta.");
        comunicacaoService.enviar("Laboratorio", "Farmacia", "Exame liberado; preparar medicação.");
        view.linha();
    }

    public void dispararNotificacoes(){
        view.titulo("Observer — Eventos e Assinantes");
        // placeholder: usando Runnable até os alunos criarem Observer de verdade
        notificacaoService.adicionarObservador(() -> System.out.println("[Observer] Enfermagem avisada"));
        notificacaoService.adicionarObservador(() -> System.out.println("[Observer] Farmácia avisada"));
        notificacaoService.notificarMudanca("Consulta entrou em EM_ATENDIMENTO");
        view.linha();
    }
}

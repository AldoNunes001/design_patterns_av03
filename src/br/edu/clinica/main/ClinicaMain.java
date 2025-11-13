package br.edu.clinica.main;

import br.edu.clinica.controller.AtendimentoController;
import br.edu.clinica.controller.NotificacaoController;
import br.edu.clinica.controller.PrescricaoController;
import br.edu.clinica.controller.RelatorioController;

public class ClinicaMain {
    public static void main(String[] args) {
        System.out.println("=== MediClinic (pseudo-sistema) ===");

        var atendimento = new AtendimentoController();
        var prescricao  = new PrescricaoController();
        var notificacao = new NotificacaoController();
        var relatorio   = new RelatorioController();

        atendimento.registrarConsulta();
        atendimento.encaminharPaciente();
        prescricao.interpretarPrescricao();
        atendimento.listarPacientesFila();
        notificacao.comunicarEntreSetores();
        atendimento.historicoProntuario();
        notificacao.dispararNotificacoes();
        atendimento.fluxoEstadosConsulta();
        atendimento.atendimentoComEstrategia();
        relatorio.gerarRelatorio();
        relatorio.executarVisitante();
    }
}
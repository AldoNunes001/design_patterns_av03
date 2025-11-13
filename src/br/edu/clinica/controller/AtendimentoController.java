package br.edu.clinica.controller;

import br.edu.clinica.model.*;
import br.edu.clinica.service.*;
import br.edu.clinica.view.ConsoleView;

import java.time.LocalDateTime;

public class AtendimentoController {

    private final ConsoleView view = new ConsoleView();
    private final AtendimentoService atendimentoService = new AtendimentoService();
    private final EncaminhamentoService encaminhamentoService = new EncaminhamentoService();
    private final FilaService filaService = new FilaService();
    private final ProntuarioService prontuarioService = new ProntuarioService();
    private final EstadoConsultaService estadoService = new EstadoConsultaService();
    private final EstrategiaAtendimentoService estrategiaService = new EstrategiaAtendimentoService();

    public void registrarConsulta(){
        view.titulo("Command — Registrar/Alterar/Cancelar");
        var p = new Paciente("Ana", "000.111.222-33");
        var m = new Medico("Carlos", "CRM-1234", "Clínico");
        var c = new Consulta(p, m, LocalDateTime.now().plusDays(1));

        atendimentoService.criarConsulta(c);
        atendimentoService.alterarConsulta(c);
        atendimentoService.cancelarConsulta(c);
        view.linha();
    }

    public void encaminharPaciente(){
        view.titulo("Chain of Responsibility — Encaminhamento");
        var p = new Paciente("Bruno", "111.222.333-44");
        encaminhamentoService.encaminhar(p);
        view.linha();
    }

    public void listarPacientesFila(){
        view.titulo("Iterator — Fila de Pacientes");
        filaService.adicionar(new Paciente("Clara","222"));
        filaService.adicionar(new Paciente("Diego","333"));
        filaService.listar();
        view.linha();
    }

    public void historicoProntuario(){
        view.titulo("Memento — Histórico / Desfazer");
        prontuarioService.escrever("Entrada 1: sinais vitais estáveis");
        prontuarioService.escrever("Entrada 2: prescrição adicionada");
        prontuarioService.desfazer(); // restaura Entrada 1 (placeholder)
        view.linha();
    }

    public void fluxoEstadosConsulta(){
        view.titulo("State — Ciclo de Vida da Consulta");
        var c = new Consulta(new Paciente("Eva","444"), new Medico("Marta","CRM-4321","Pediatra"),
                LocalDateTime.now().plusHours(3));
        estadoService.avancar(c);
        estadoService.avancar(c);
        estadoService.cancelar(c);
        view.linha();
    }

    // public void atendimentoComEstrategia(){
    //     view.titulo("Strategy — Modos de Atendimento");
    //     var p = new Paciente("Igor","555");
    //     estrategiaService.atenderPresencial(p);
    //     estrategiaService.atenderTelemedicina(p);
    //     estrategiaService.atenderEmergencia(p);
    //     view.linha();
    // }

    public void atendimentoComEstrategia(){
        view.titulo("Strategy — Modos de Atendimento");
        var p = new Paciente("Igor","555");
        
        // Usando o padrão Strategy corretamente
        estrategiaService.setEstrategia(new AtendimentoPresencial());
        estrategiaService.executarAtendimento(p);
        
        estrategiaService.setEstrategia(new AtendimentoTelemedicina());
        estrategiaService.executarAtendimento(p);
        
        estrategiaService.setEstrategia(new AtendimentoEmergencia());
        estrategiaService.executarAtendimento(p);
        
        view.linha();
    }
}

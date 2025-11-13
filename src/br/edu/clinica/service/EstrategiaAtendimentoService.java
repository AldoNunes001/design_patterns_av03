package br.edu.clinica.service;

import br.edu.clinica.model.Paciente;

public class EstrategiaAtendimentoService {
    private EstrategiaAtendimento estrategia;

    public EstrategiaAtendimentoService() {
    }

    public EstrategiaAtendimentoService(EstrategiaAtendimento estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaAtendimento estrategia) {
        this.estrategia = estrategia;
    }

    public void executarAtendimento(Paciente paciente) {
        if (estrategia != null) {
            estrategia.atender(paciente);
        }
    }

    public String getTipoEstrategia() {
        return estrategia != null ? estrategia.getTipo() : null;
    }

    // // Métodos de conveniência para manter compatibilidade
    // public void atenderPresencial(Paciente p) {
    //     setEstrategia(new AtendimentoPresencial());
    //     executarAtendimento(p);
    // }

    // public void atenderTelemedicina(Paciente p) {
    //     setEstrategia(new AtendimentoTelemedicina());
    //     executarAtendimento(p);
    // }

    // public void atenderEmergencia(Paciente p) {
    //     setEstrategia(new AtendimentoEmergencia());
    //     executarAtendimento(p);
    // }
}

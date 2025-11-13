package br.edu.clinica.service;

import br.edu.clinica.model.Consulta;

public class AtendimentoService {

    public void criarConsulta(Consulta consulta){
        // PADRÃO SUGERIDO: COMMAND
        // Ideia: encapsular esta ação como um objeto "Command" (CriarConsultaCommand)
        // e enviar para um "Invoker" que processa uma fila de comandos.
        // TODO alunos: criar interfaces Command/Invoker e reestruturar chamadas.
        System.out.println("[Service] Criando consulta: " + consulta);
    }

    public void alterarConsulta(Consulta consulta){
        // PADRÃO SUGERIDO: COMMAND (outro comando da mesma hierarquia)
        // TODO alunos: implementar AlterarConsultaCommand e registrar no Invoker.
        System.out.println("[Service] Alterando consulta: " + consulta);
    }

    public void cancelarConsulta(Consulta consulta){
        // PADRÃO SUGERIDO: COMMAND (Cancelamento como comando)
        // TODO alunos: implementar CancelarConsultaCommand.
        System.out.println("[Service] Cancelando consulta: " + consulta);
    }
}

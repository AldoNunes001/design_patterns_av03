package br.edu.clinica.service;

public class RelatorioService {

    public void gerarRelatorioConsulta(){
        // PADRÃO SUGERIDO: TEMPLATE METHOD
        // Ideia: classe abstrata com o "esqueleto" gerar():
        // cabecalho() -> corpo() -> rodape(), permitindo subclasses variarem o corpo.
        // TODO alunos: criar RelatorioTemplate e subclasses (Consulta/Prescricao).
        System.out.println("[Service] (Template) Gerando relatório de consulta...");
    }
}

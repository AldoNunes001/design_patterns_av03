package br.edu.clinica.service;

import br.edu.clinica.model.RegistroClinico;
import br.edu.clinica.model.RegistroConsulta;
import br.edu.clinica.model.RegistroPrescricao;

import java.util.List;

public class VisitaService {

    public void visitarRegistros(List<RegistroClinico> registros) {
        // PADRÃO SUGERIDO: VISITOR
        // Ideia: um Visitor percorre diferentes tipos de registros e aplica uma operação
        // (ex.: calcular custo, auditar, exportar).
        // TODO alunos: criar Visitor/Visitable e mover o if para double dispatch.
        for (RegistroClinico r : registros) {
            if (r instanceof RegistroConsulta) {
                System.out.println("[Service] Visitando consulta: " + r.getId());
            } else if (r instanceof RegistroPrescricao) {
                System.out.println("[Service] Visitando prescrição: " + r.getId());
            }
        }
    }

}
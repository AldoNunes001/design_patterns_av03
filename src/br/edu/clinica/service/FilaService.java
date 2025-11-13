package br.edu.clinica.service;

import br.edu.clinica.model.Paciente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilaService {
    private final List<Paciente> fila = new ArrayList<>();

    public void adicionar(Paciente p){ fila.add(p); }

    public void listar(){
        // PADRÃO SUGERIDO: ITERATOR
        // Ideia: encapsular o acesso à estrutura de fila e expor um Iterator próprio,
        // permitindo diferentes ordens (por prioridade, tempo de chegada etc).
        // TODO alunos: criar classe FilaPacientes que implementa Iterable<Paciente>.
        Iterator<Paciente> it = fila.iterator();
        while (it.hasNext()) {
            System.out.println("[Service] Na fila: " + it.next());
        }
    }
}

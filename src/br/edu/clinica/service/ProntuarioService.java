package br.edu.clinica.service;

import java.util.ArrayDeque;
import java.util.Deque;

public class ProntuarioService {
    private String textoAtual = "";
    private final Deque<String> historico = new ArrayDeque<>();

    public void escrever(String texto){
        // PADRÃO SUGERIDO: MEMENTO
        // Ideia: salvar "Snapshots" (objetos imutáveis) antes de alterar o estado.
        // TODO alunos: criar Originator (Prontuario), Snapshot e Caretaker (Historico).
        historico.push(textoAtual);
        textoAtual = texto;
        System.out.println("[Service] Prontuário agora: " + textoAtual);
    }

    public void desfazer(){
        if (!historico.isEmpty()) {
            textoAtual = historico.pop();
            System.out.println("[Service] (undo) Restaurado: " + textoAtual);
        }
    }
}

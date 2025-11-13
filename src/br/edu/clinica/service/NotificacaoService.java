package br.edu.clinica.service;

import java.util.ArrayList;
import java.util.List;

public class NotificacaoService {
    private final List<Runnable> observadores = new ArrayList<>();

    public void adicionarObservador(Runnable obs){
        // PADRÃO SUGERIDO: OBSERVER
        // Ideia: trocar Runnable por interface Observer {update(evento)}
        // e notificar todos quando um evento ocorrer (estado da consulta mudou etc.).
        // TODO alunos: criar Subject/Observer específicos.
        observadores.add(obs);
    }

    public void notificarMudanca(String evento){
        System.out.println("[Service] Notificando: " + evento);
        observadores.forEach(Runnable::run); // placeholder simplificado
    }
}

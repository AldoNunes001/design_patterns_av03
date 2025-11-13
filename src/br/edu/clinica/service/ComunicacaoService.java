package br.edu.clinica.service;

public class ComunicacaoService {
    public void enviar(String de, String para, String msg){
        // PADRÃO SUGERIDO: MEDIATOR
        // Ideia: um "ClinicaMediator" registra setores (Recepção, Farmácia, Lab)
        // e centraliza o envio de mensagens, desacoplando remetente/destinatário.
        // TODO alunos: criar interface Mediator e classes de Setor.
        System.out.printf("[Service] %s -> %s: %s%n", de, para, msg);
    }
}

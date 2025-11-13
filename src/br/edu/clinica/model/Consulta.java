package br.edu.clinica.model;

import java.time.LocalDateTime;

public class Consulta {
    private final Paciente paciente;
    private final Medico medico;
    private LocalDateTime dataHora;
    private String estado;

    public Consulta(Paciente p, Medico m, LocalDateTime dh) {
        this.paciente = p; this.medico = m; this.dataHora = dh;
        this.estado = "AGENDADA";
    }

    public Paciente getPaciente(){ return paciente; }
    public Medico getMedico(){ return medico; }
    public LocalDateTime getDataHora(){ return dataHora; }
    public void setDataHora(LocalDateTime dh){ this.dataHora = dh; }
    public String getEstado(){ return estado; }
    public void setEstado(String e){ this.estado = e; }

    @Override public String toString(){
        return paciente.getNome() + " com " + medico + " em " + dataHora + " ["+estado+"]";
    }
}

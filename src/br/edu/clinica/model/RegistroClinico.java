package br.edu.clinica.model;

public abstract class RegistroClinico {
    private final String id;
    protected RegistroClinico(String id){ this.id=id; }
    public String getId(){ return id; }
}

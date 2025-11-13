package br.edu.clinica.model;

public class Prescricao {
    private final String textoPadronizado; // ex.: "1cp 8/8h por 5d"
    public Prescricao(String textoPadronizado) { this.textoPadronizado = textoPadronizado; }
    public String getTextoPadronizado() { return textoPadronizado; }
    public String getTexto() { return "Prescricao{" + textoPadronizado + "}"; }
}

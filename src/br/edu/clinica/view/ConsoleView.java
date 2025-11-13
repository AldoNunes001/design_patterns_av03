package br.edu.clinica.view;

public class ConsoleView {
    public void titulo(String t){ System.out.println("\n== " + t + " =="); }
    public void info(String i){ System.out.println("[VIEW] " + i); }
    public void linha(){ System.out.println("---------------------------------------"); }
}

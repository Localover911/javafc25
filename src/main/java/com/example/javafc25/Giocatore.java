package com.example.javafc25;

public class Giocatore {

    private String nome;
    private boolean capitano;
    private int goal;

    public Giocatore(String nome, boolean capitano, int goal) {
        setNome(nome);
        setCapitano(capitano);
        setGoal(goal);
    }

    public String getNome(){
        return nome;
    }

    public boolean getCapitano(){
        return capitano;
    }

    public int getGoal(){
        return goal;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCapitano(boolean capitano){
        this.capitano = capitano;
    }

    public void setGoal(int goal){
        this.goal = goal;
    }

    public boolean isCapitano(){
        return capitano;
    }

}
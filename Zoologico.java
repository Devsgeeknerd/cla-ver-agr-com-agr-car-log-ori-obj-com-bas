package br.com.devsgeeknerd.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nome;
    private List<Animal> animais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Zoologico() {
        animais = new ArrayList<Animal>();
    }

    public void adicionarAnimal(Animal animalASerAdicionando) {
        animais.add(animalASerAdicionando);
    }

    public void listarAnimais() {
        System.out.println("Animais do Zoologico: ");
        for (int i = 0; i < animais.size(); i++) {
            System.out.println("   - " + animais.get(i).getNome());
        }
    }
}

package br.com.devsgeeknerd.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private String nome;
    private List<Animal> animais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veterinario() {
        animais = new ArrayList<Animal>();
    }

    public void atenderAnimal(Animal animalASerAtendido) {
        animais.add(animalASerAtendido);
    }

    public void deixaDeAtenderAnimal(int indiceAnimal) {
        animais.remove(indiceAnimal);
    }

    public void listarAnimaisAtendidos() {
        System.out.println("Animais atendidos");
        for (int i = 0; i < animais.size(); i++) {
            System.out.println("   - " + animais.get(i).getNome());
        }
    }
}

package br.com.devsgeeknerd.zoologico.classes;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public Cachorro(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade, "Cachorro");
    }

    @Override
    public void emitirBarulho() {
        if (estaVivo) {
            System.out.println("Latido do cachorro");
        } else
            System.out.println("O animal morreu!");
    }

    @Override
    public boolean ehAdulto() {
        if (estaVivo) {
            return idade >= 2;
        } else {
            return false;
        }
    }
}

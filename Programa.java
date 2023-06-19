package br.com.devsgeeknerd.zoologico.app;

import br.com.devsgeeknerd.zoologico.classes.Animal;
import br.com.devsgeeknerd.zoologico.classes.Cachorro;
import br.com.devsgeeknerd.zoologico.classes.Gato;
import br.com.devsgeeknerd.zoologico.classes.Zoologico;
import br.com.devsgeeknerd.zoologico.classes.Veterinario;

public class Programa {
    public static void main(String[] args) {
        Animal Animal = new Cachorro("Toto");

        System.out.println("Ola, seu animal é " + Animal.getEspecie() + ", o nome do " + "animal é " + Animal.getNome()
                + " e ele tem " + Animal.getIdade() + " anos.");

        if (Animal.ehAdulto()) {
            System.out.println("Seu cachorro é adulto");
        } else {
            System.out.println("Seu cachorro não é adulto");
        }

        System.out.println("*****************************");
        System.out.println("Barulho do cachorro: ");
        Animal.emitirBarulho();
        System.out.println("*****************************");

        Zoologico zoo = new Zoologico();
        zoo.setNome("Zoo Devsgeeknerd");
        zoo.adicionarAnimal(Animal);

        Animal animal2 = new Gato("Pintado", 3);
        zoo.adicionarAnimal(animal2);
        System.out.println("Animais do zoologico: " + zoo.getNome());
        zoo.listarAnimais();
        zoo.removerAnimal();

        System.out.println("Depois da remoção: ");
        zoo.listarAnimais();
        System.out.println("*****************************");

        Veterinario vet = new Veterinario();
        vet.setNome("Devsgeeknerd");
        vet.atenderAnimal(Animal);
        vet.listarAnimaisAtendidos();
    }
}

package main;
import java.util.ArrayList;


public class Zoo {
    private String name;
    private ArrayList<Animal> animals = new ArrayList<>();


    public Zoo(String name){
        this.name = name;
        
    }
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    
    public void listAnimals() {
        System.out.println(name + " pitää sisällään seuraavat eläimet:");
        for (Animal animal : animals) {
            animal.printAnimalList();
        }
        
    }

    public void runAnimals(int rounds) {
        for (Animal animal : animals) {
            animal.run(rounds);
            
        }
    }
}

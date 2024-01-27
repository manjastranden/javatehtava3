package main;

public class Animal {
    private String species;
    private String animalName;
    private int age;

    public Animal(String species, String animalName, int age) {
        this.species = species;
        this.animalName = animalName;
        this.age = age;
    }

    public String getSpecies() {
        return species; 
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getAge() {
        return age;
    }

    public void printAnimalList() {
        System.out.println(species + ": " + animalName + ", " + age + " vuotta");
    }

    public void run(int rounds) {
        for (int i = 0; i< rounds; i++) {
            System.out.println(animalName + " juoksee kovaa vauhtia!");
        }

    }
}

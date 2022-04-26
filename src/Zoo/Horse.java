package Zoo;

public class Horse extends Animal {

    public Horse(String species, String name, String colour, int age) {
        this.species = species;
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.foots = 4;
        this.wings = 0;
        this.tail = 1;
        this.predator = false;
        this.voice = false;
    }

}

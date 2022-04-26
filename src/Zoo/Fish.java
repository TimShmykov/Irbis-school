package Zoo;

public class Fish extends Animal {

    public Fish(String species, String name, String colour, int age) {
        this.species = species;
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.foots = 0;
        this.wings = 0;
        this.tail = 1;
        this.predator = true;
        this.voice = false;
    }

}

package Zoo;

public class Bird extends Animal {

    public Bird(String species, String name, String colour, int age) {
        this.species = species; // выводим уникальные данные
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.foots = 2; // данные, которые не меняются и не будут меняться можно указать сразу
        this.wings = 2;
        this.tail = 1;
        this.predator = true;
        this.voice = false;


        //  System.out.println(species + name + colour + "Возраст: " + age  + foots + wings + tail +  predator + voice);
    }


}


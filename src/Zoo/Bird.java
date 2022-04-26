package Zoo;

public class Bird extends Animal {

    private int wings;

    public Bird(String species, String name, String colour, int age, boolean predator, int wings) {
        super(species, name, colour, age, 2, true, 1, predator, false);
        this.wings = wings;

        //  System.out.println(species + name + colour + "Возраст: " + age  + foots + wings + tail +  predator + voice);
    }


}


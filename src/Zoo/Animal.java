package Zoo;

public class Animal {
    private String species;  // вид (Хаски, Зебра, Сом, Щука, Птеродактиль)
    private String name;  // - особенности класса не наследуются, только общие признаки
    private String colour;
    private int age;
    private int foots;  // ноги
    private boolean canFly; // умение летать
    private int tail;  // хвост
    private boolean predator;  // хищник
    private boolean voice;  // голос

    // вызвать окно генерации кода через alt+Insert
    public Animal(String species, String name, String colour, int age, int foots, boolean canFly, int tail, boolean predator, boolean voice) {
        this.species = species;
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.foots = foots;
        this.canFly = canFly;
        this.tail = tail;
        this.predator = predator;
        this.voice = voice;
    }

    void AnimalData() { // вывод данных по каждому животному
        System.out.println(species + " " + name + " " + colour + " Возраст: " + age + " Количество ног: " + foots + " Может летать: " + canFly + " хвост: " + tail + " Хищник? " + predator + " Умеет говорить? " + voice);
    }

    public boolean canFly() {
        return canFly;
    }

    public boolean isPredator() {
        return predator;
    }

    public boolean isVoice() {
        return voice;
    }
}

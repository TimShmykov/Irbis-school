package Zoo;

public class Animal {
    String species; // вид (Хаски, Зебра, Сом, Щука, Птеродактиль)
    String name; // - особенности класса не наследуются, только общие признаки
    String colour;
    int age;
    int foots; // ноги
    int wings; // крылья
    int tail; // хвост
    boolean predator; // хищник
    boolean voice; // голос

     void AnimalData() { // вывод данных по каждому животному
         System.out.println(species + " " + name + " " + colour + " Возраст: " + age + " Количество ног: " + foots + " крылья: " + wings + " хвост: " + tail + " Хищник? " + predator + " Умеет говорить? " + voice);
    }

}

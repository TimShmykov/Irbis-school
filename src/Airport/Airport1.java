package Airport;

import java.util.*;


public class Airport1 {
    public static void main(String[] args) {
        PassengerPlane plane1 = new PassengerPlane("Boeing 737", "На борт прибыло человек:", "С борта ушло человек: ", "Взлет совершен ", "Посадка совершена ", "максимальная скорость лайнера:  ", 220, 979, 270, 215);
        PassengerPlane plane2 = new PassengerPlane("Cessna 172", "Здарова блин", "Ну типа пока", "Ну с богом ", "Ура!", "Ну шо народ погнали на%№! ", 112, 228, 113, 2);
        PassengerPlane plane3 = new PassengerPlane("Провидение", "I have a bad filling about this!", "Another happy landing", "Двигатели на реверс, намагничивай, намагничивай", "Кажется что то отвалилось? Не беда, половина крейсера еще осталось", "Теперь мы набираем скорость ", 1200, 5000, 500, 48247);
        SportPlane plane4 = new SportPlane("MXS-R", "Взлёт", "Посадка", "Пошла жара", 105, 425, 110, "Do a barrel roll");
        SportPlane plane5 = new SportPlane("Extra 330LX", "Взлёт", "Посадка", "Пошла жара", 100, 405, 120, "Do a death loop");
        SpaceShipFunction plane6 = new SpaceShip("red5", "takeoff", "landing", "afterburn", "jump", "turn wing in to attack position", "rise the shield", 300, 3000, 250);
        SpaceShipFunction plane7 = new SpaceShip("golden1", "takeoff", "landing", "afterburn", "jump", "charge ion canon", "rise the shield", 220, 2000, 210);

        List<String> list = new ArrayList<>();
        list.add(String.valueOf(plane1));
        list.add(String.valueOf(plane2));
        list.add(String.valueOf(plane3));
        list.add(String.valueOf(plane4));
        list.add(String.valueOf(plane5));
        list.add(String.valueOf(plane6));
        list.add(String.valueOf(plane7));



        plane1.releasePassengers("2",8);
        plane1.landing("4",3);
        plane1.takeoff("1",1);
        plane1.getPassengers("2",1);


    }
}

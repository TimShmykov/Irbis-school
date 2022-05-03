package Airport;

import java.util.*;


public class Airport1 {
    public static void main(String[] args) {
        PassengerBasicPlane plane1 = new PassengerBasicPlane("Boeing 737", "На борт прибыло человек:", "С борта ушло человек: ", "Взлет совершен ", "Посадка совершена ", "максимальная скорость лайнера:  ", 220, 979, 270, 215);
        PassengerBasicPlane plane2 = new PassengerBasicPlane("Cessna 172", "Здарова блин", "Ну типа пока", "Ну с богом ", "Ура!", "Ну шо народ погнали на%№! ", 112, 228, 113, 2);
        PassengerBasicPlane plane3 = new PassengerBasicPlane("Провидение", "I have a bad filling about this!", "Another happy landing", "Двигатели на реверс, намагничивай, намагничивай", "Кажется что то отвалилось? Не беда, половина крейсера еще осталось", "Теперь мы набираем скорость ", 1200, 5000, 500, 48247);
        SportBasicPlane plane4 = new SportBasicPlane("MXS-R", "Взлёт", "Посадка", "Пошла жара", 105, 425, 110, "Do a barrel roll");
        SportBasicPlane plane5 = new SportBasicPlane("Extra 330LX", "Взлёт", "Посадка", "Пошла жара", 100, 405, 120, "Do a death loop");
        SpaceShip plane6 = new SpaceShip("red5", "takeoff", "landing", "afterburn", "jump", "turn wing in to attack position", "rise the shield", 300, 3000, 250);
        SpaceShip plane7 = new SpaceShip("golden1", "takeoff", "landing", "afterburn", "jump", "charge ion canon", "rise the shield", 220, 2000, 210);

        List<BasicPlane> list = new ArrayList<>();
        list.add(plane1);
        list.add(plane2);
        list.add(plane3);
        list.add(plane4);
        list.add(plane5);
        list.add(plane6);
        list.add(plane7);

        for (BasicPlane basicPlane : list) {
            basicPlane.landing();
        }


        plane1.releasePassengers();
        plane1.landing();
        plane1.takeoff();
        plane1.getPassengers();


    }
}

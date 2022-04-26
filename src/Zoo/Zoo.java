package Zoo;

public class Zoo {  // main - здесь бизнесс логика
    public static void main(String[] args) { // new для объектов используется
        Bird bird1 = new Bird("Сокол", "Вася", "Бурый", 3, true,2);
        Bird bird2 = new Bird("Сокол", "Оксана", "Черная", 2, true,2);
        Bird bird3 = new Bird("Кулик-сорока", "Аркадий", "Черно-белая", 3, true,2);
        Bird bird4 = new Bird("Какаду", "Кеша", "Пестрый", 2, false,2);
        Cat cat1 = new Cat("Кошкодевочка", "Маша", "мулатка", 18, true);
        Cat cat2 = new Cat("Кот", "Леопольд", "рыжий", 25, true);
        Cat cat3 = new Cat("рысь", "Кыся", "Рыжая пятнистая", 6, false);
        Dog dog1 = new Dog("Кицуне", "Yae Miko", "красноволосая", 26, 9, true);
        Dog dog2 = new Dog("Хаски", "Балто", "пестрый", 4, 1, false);
        Horse horse1 = new Horse("Мустанг", "Спирит", "Буланая масть", 4);
        Horse horse2 = new Horse("Лошадь Пржевальского", "Кики", "Пегая", 6);
        Fish fish1 = new Fish("Щука", "Степан", "серебристая", 120, true);
        Fish fish2 = new Fish("Рыба клоун", "Немо", "Рыже-черно-белая", 1, false);


        Animal[] all = {bird1, bird2, bird3, bird4, cat1, cat2, cat3, dog1, dog2, horse1, horse2, fish1, fish2};

        int canFlyScore = 0;
        int voiceScore = 0;
        int predatorScore = 0;

        System.out.println("Животных в зоопарке: " + all.length);


        //  for (int i = 0; i < all.length; i++) {
        //      Animal animal = all[i];  - хочу получить ячейку animal
        for (Animal animal : all) { // foreach! - то же что и сверху, но короче. (надо перечитать теорию)

            if (animal.canFly()) {
                canFlyScore++;
            }
            if (animal.isVoice()) {
                voiceScore++;
            }
            if (animal.isPredator()) {
                predatorScore++;
            }
        }
//        for (Animal animal : all) {    // - если хочешь вывести инфу про всех на экран разблоч эти строки!
//            animal.AnimalData();
//        }

        System.out.println("Количество животных с крыльями: " + canFlyScore);
        System.out.println("Количество говорящих животных: " + voiceScore);
        System.out.println("Количество хищников: " + predatorScore);


    }


}


import customer.Customer;
import customer.Restaurant;
import products.kg.animals.*;
import products.kg.plants.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.random.RandomGenerator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // для тестирование

        Animal[] animals = new Animal[10];

        // Заполняем массив различными животными
        animals[0] = new Cow("Буренка", 5, "Самка", 400.0, true);
        animals[1] = new Cow("Милка", 4, "Самка", 350.0, false);
        animals[2] = new Hen("Ряба", 2, "Самка", 2.5, 3);
        animals[3] = new Hen("Кеша", 1, "Самец", 3.0, 0);
        animals[4] = new Horse("Мустанг", 7, "Самец", 500.0);
        animals[5] = new Horse("Буян", 10, "Самец", 600.0);
        animals[6] = new Sheep("Долли", 5, "Самка", 70.0, 5.5f);
        animals[7] = new Sheep("Шон", 6, "Самец", 80.0, 6.0f);
        animals[8] = new Sheep("Белка", 3, "Самка", 65.0, 4.8f);
        animals[9] = new Sheep("Рэм", 4, "Самец", 75.0, 5.2f);

//        // Вывод всех животных
//        System.out.println("Список животных:");
//        for (Animal animal : animals) {
//            System.out.println(animal);
//        }


        Plant[] plants = new Plant[10];
        plants[0] = new Apple("Гала", "Фрукт", true, "Красный");
        plants[1] = new Apple("Гренни Смит", "Фрукт", true, "Зеленый");
        plants[2] = new Onion("Шалот", "Овощ", false, "Шалот");
        plants[3] = new Onion("Репчатый", "Овощ", true, "Репчатый");
        plants[4] = new Cucumber("Огурец F1", "Овощ", true, 25, "Салатный");
        plants[5] = new Potato("Белорусская", "Овощ", false, "Белая");
        plants[6] = new Potato("Скарлетт", "Овощ", true, "Красная");
        plants[7] = new Tomato("Черри", "Овощ", true);
        plants[8] = new Rice("Жасмин", "Зерновая", true, "Длиннозерный");
        plants[9] = new Rice("Рис Арборио", "Зерновая", false, "Круглозерный");

        Farmer farmer = new Farmer(
                "farmer",
                animals,
                plants
        );


        Customer[] customers = {
                new Restaurant("Мубарак", "пр.чуй 259", null)
        };

        Request[] requests = {
                new Request
                        (customers[0],
                        "animal",
                         "говядина",
                         200,
// столько можно получить примерно с одного коровы, который весит 350 кг, и учитывать что это корова даст 60% мяса, то есть от всего масса. В среднем
                         false
                )
        };

        // логика такова.
        // сначала метод продать из запросов, если пусто то продать определенную животную и растение.
        // начнем пока с животного

        farmer.setRequests(requests);

        menu();
        int choice = sc.nextInt();

        switch (choice) {
            case 1:


                boolean isTrue = true;
        do{
                    menuAsFarmer();
                int choiceDo = sc.nextInt();

                switch (choiceDo) {
                    case 1:
                        // животные
                        menuForFarmer();
                        int choiceAnimal = sc.nextInt();
                        switch (choiceAnimal) {
                            case 1:
                                System.out.println("""
                                        Выбирите кого хотите добавить
                                        1.Корова
                                        2.Курица
                                        3.Лошадь
                                        4.Овца                    
                                        """);
                                int choiceNewAnimal = sc.nextInt();
                                switch (choiceNewAnimal) {
                                    case 1:
                                        System.out.println("Введите название");
                                        sc.nextLine();
                                        String nameCow = sc.nextLine();
                                        System.out.println("Введите возварст");
                                        int ageCow = sc.nextInt();
                                        System.out.println("Введите гендер");
                                        sc.nextLine();
                                        String genderCow = sc.nextLine();
                                        System.out.println("Введите вес");
                                        int weightCow = sc.nextInt();
                                        System.out.println("Введите имеет ли корова молоко");
                                        boolean hasMilk = sc.nextBoolean();

                                        Animal newCow = new Cow(
                                                nameCow,
                                                ageCow,
                                                genderCow,
                                                weightCow,
                                                hasMilk
                                        );

                                        System.out.println(newCow);
                                        Animal[] newAnimalsC = farmer.addAnimal(newCow);
                                        farmer.setAnimals(newAnimalsC);

                                        break;

                                    case 2:
                                        System.out.println("Введите название");
                                        sc.nextLine();
                                        String nameHen = sc.nextLine();
                                        System.out.println("Введите возварст");
                                        int ageHen = sc.nextInt();
                                        System.out.println("Введите гендер");
                                        sc.nextLine();
                                        String genderHen = sc.nextLine();
                                        System.out.println("Введите вес");
                                        int weightHen = sc.nextInt();
                                        System.out.println("Введите сколько куриц несет яиц в день ");
                                        int eggPerDay = sc.nextInt();

                                        Animal newHen = new Hen(nameHen, ageHen, genderHen, weightHen, eggPerDay);
                                        System.out.println(newHen);
                                        Animal[] addedHem = farmer.addAnimal(newHen);

                                        farmer.setAnimals(addedHem);

                                        break;
                                    case 3:
                                        System.out.println("Введите название");
                                        String nameHorse = sc.nextLine();
                                        sc.nextLine();
                                        System.out.println("Введите возварст");
                                        int ageHorse = sc.nextInt();
                                        System.out.println("Введите гендер");
                                        sc.nextLine();
                                        String genderHorse = sc.nextLine();
                                        System.out.println("Введите вес");
                                        int weightHorse = sc.nextInt();
                                        Animal newHorse = new Horse(nameHorse, ageHorse, genderHorse, weightHorse);
                                        System.out.println(newHorse);
                                        Animal[] addedHorse = farmer.addAnimal(newHorse);

                                        farmer.setAnimals(addedHorse);
                                        break;
                                    case 4:
                                        System.out.println("Введите название");
                                        sc.nextLine();
                                        String nameSheep = sc.nextLine();
                                        System.out.println("Введите возварст");
                                        int ageSheep = sc.nextInt();
                                        System.out.println("Введите гендер");
                                        sc.nextLine();
                                        String genderSheep = sc.nextLine();
                                        System.out.println("Введите вес");
                                        int weightSheep = sc.nextInt();
                                        System.out.println("Введите сколько стоит шерсть в кг");
                                        int woolSheep = sc.nextInt();
                                        Animal newSheep = new Sheep(
                                                nameSheep,
                                                ageSheep,
                                                genderSheep,
                                                weightSheep,
                                                woolSheep
                                        );
                                        System.out.println(newSheep);
                                        Animal[] newAnimalsS = farmer.addAnimal(newSheep);

                                        farmer.setAnimals(newAnimalsS);
                                        break;
                                }
                                break;

                            case 2:
                                for (Animal animal : farmer.getAnimals()) {
                                    System.out.println(animal);
                                }
                                break;

                            case 3:
                                Animal resultAnimal = farmer.sellAnimal();
                                System.out.println(resultAnimal);
                                break;
                        }


                        break;


                    case 2:
                        // растение

                        menuForFarmer();
                        int choicePlant = sc.nextInt();
                        switch (choicePlant) {
                            case 1:
                                System.out.println("""
                                        Выбирите кого хотите добавить
                                        1.Яблоко
                                        2.Огурец
                                        3.Лук
                                        4.Томаты
                                        5.Рис
                                        6.Картошка
                                        """);
                                int choiceNewPlant = sc.nextInt();


                                switch (choiceNewPlant) {
                                    case 1:
                                        System.out.println("Введите имя");
                                        String nameApple = sc.nextLine();

                                        sc.nextLine();

                                        System.out.println("Введите категорию");
                                        String categoryApple = sc.nextLine();

                                        System.out.println("Введите свежесть");
                                        boolean freshApple = sc.nextBoolean();

                                        System.out.println("Введите цвет");
                                        String colorApple = sc.nextLine();

                                        sc.nextLine();

                                        Plant newApple = new Apple(nameApple, categoryApple, freshApple, colorApple);
                                        Plant[] addedApple = farmer.addPlant(newApple);

                                        System.out.println(newApple);
                                        break;
                                    case 2:

                                        System.out.println("Введите имя");
                                        String nameCucumber = sc.nextLine();

                                        sc.nextLine();

                                        System.out.println("Введите категорию");
                                        String categoryCucumber = sc.nextLine();

                                        System.out.println("Введите свежесть");
                                        boolean freshCucumber = sc.nextBoolean();


                                        System.out.println("Введите высоту");
                                        int heightCucumber = sc.nextInt();

                                        sc.nextLine();

                                        System.out.println("Введите проиводство");
                                        String productionCucumber = sc.nextLine();


                                        Plant cucumber = new Cucumber(nameCucumber, categoryCucumber, freshCucumber, heightCucumber, productionCucumber);
                                        Plant[] addedCucumber = farmer.addPlant(cucumber);
                                        System.out.println(cucumber);
                                        break;
                                    case 3:

                                        System.out.println("Введите имя");
                                        String nameOnion = sc.nextLine();

                                        sc.nextLine();

                                        System.out.println("Введите категорию");
                                        String categoryOnion = sc.nextLine();

                                        System.out.println("Введите свежесть");
                                        boolean freshOnion = sc.nextBoolean();

                                        sc.nextLine();

                                        System.out.println("Введите тип ");
                                        String typeOnion = sc.nextLine();

                                        Plant newOnion = new Onion(nameOnion, categoryOnion, freshOnion, typeOnion);
                                        Plant[] addedOnion = farmer.addPlant(newOnion);

                                        System.out.println(newOnion);

                                        break;
                                    case 4:

                                        System.out.println("Введите имя");
                                        String nameTomato = sc.nextLine();

                                        sc.nextLine();

                                        System.out.println("Введите категорию");
                                        String categoryTomato = sc.nextLine();

                                        System.out.println("Введите свежесть");
                                        boolean freshTomato = sc.nextBoolean();

                                        sc.nextLine();

                                        System.out.println("Введите тип ");


                                        Plant newTomato = new Tomato(nameTomato, categoryTomato, freshTomato);
                                        farmer.addPlant(newTomato);

                                        System.out.println(newTomato);
                                        break;
                                    case 5:
                                        System.out.println("Введите имя");
                                        String nameRice = sc.nextLine();

                                        sc.nextLine();

                                        System.out.println("Введите категорию");
                                        String categoryRice = sc.nextLine();

                                        System.out.println("Введите свежесть");
                                        boolean freshRice = sc.nextBoolean();

                                        sc.nextLine();

                                        System.out.println("Введите продукцию");
                                        String productionRice = sc.nextLine();

                                        Plant newRice = new Rice(nameRice, categoryRice, freshRice, productionRice);
                                        farmer.addPlant(newRice);

                                        System.out.println(newRice);
                                        break;
                                    case 6:
                                        System.out.println("Введите имя");
                                        String namePotato = sc.nextLine();

                                        sc.nextLine();

                                        System.out.println("Введите категорию");
                                        String categoryPotato = sc.nextLine();

                                        System.out.println("Введите свежесть");
                                        boolean freshPotato = sc.nextBoolean();

                                        sc.nextLine();

                                        System.out.println("Введите тип ");
                                        String typePotato = sc.nextLine();

                                        Plant newPotato = new Potato(namePotato, categoryPotato, freshPotato, typePotato);
                                        farmer.addPlant(newPotato);

                                        System.out.println(newPotato);
                                        break;

                                }

                                break;


                            case 2:

                                for (Plant plant : farmer.getPlants()) {
                                    System.out.println(plant);
                                }


                                break;

                            case 3:
                                Plant resultPlant = farmer.sellPlant();
                                System.out.println(resultPlant);
                                break;
                        }

                        break;


                    case 3:
                        //  посмотреть все запросы
                        Animal resultRequest = farmer.sellAnimalRequest();
                        System.out.println(resultRequest);
                        break;
                }
        } while(isTrue);

                break;



            case 2:


                break;


            case 3:


                break;


        }



    }



    public static void menu (){
        System.out.println("""
                1. Я фермер
                2. Я клиент 
                3. Выход
                """);
    }


    public static void menuAsFarmer(){
        System.out.println("""
                        Выберите с чем / кем будете рабоать
                        1. Животное 
                        2. Растение
                        3. Посмотреть все запросы
                        """ );
    }

    public static void menuForFarmer(){
        System.out.println("""
                1.Добавить
                2.Посмотреть список
                3.Продать 
                """);
    }
}
package common.CodeGymTasks;

public class assigningObjects {

    public static void main(String[] args) {
        //write your code here
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        dog.owner = woman;
        cat.owner = woman;
        fish.owner = woman;


        Zerg zerg = new Zerg();
        zerg.name = "Bobby";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Bill";
        Zerg zerg3 = new Zerg();
        zerg3.name = "kyle";
        Zerg zerg4 = new Zerg();
        zerg4.name = "joey";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Stackie";

        Protoss protoss = new Protoss();
        protoss.name = "Beth";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Morty";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Rick";


        Terran terran = new Terran();
        terran.name = "Jerry";
        Terran terran1 = new Terran();
        terran1.name = "Summer";
        Terran terran2 = new Terran();
        terran2.name = "Bird Person";
        Terran terran3 = new Terran();
        terran3.name = "Principle";
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }




}

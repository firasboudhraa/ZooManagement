package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;


public class ZooManagement {
    public static void main( String[] args ) {
        Animal lion = new Animal("Sauvage", "lion", 2, true);
        Zoo myZoo = new Zoo("myZoo", "Tunis");
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
        System.out.println(lion.toString());

        Animal giraffe = new Animal("Sauvage", "Giraffe", 2, true);
        Animal elephant = new Animal("Sauvage", "Elephant", 6, true);

        if (myZoo.addAnimal(giraffe)) {
            System.out.println("Giraffe added to the zoo successfully.");
        } else {
            System.out.println("Failed to add giraffe to the zoo. The zoo is already full.");
        }

        if (myZoo.addAnimal(elephant)) {
            System.out.println("Elephant added to the zoo successfully.");
        } else {
            System.out.println("Failed to add elephant to the zoo. The zoo is already full.");
        }

        if (myZoo.addAnimal(lion)) {
            System.out.println("Lion added to the zoo successfully.");
        } else {
            System.out.println("Failed to add Lion to the zoo. The zoo is already full.");
        }


        System.out.println(myZoo.searchAnimal(lion));

        myZoo.addAnimal(lion);
        if (myZoo.removeAnimal(lion)) {
            System.out.println("Deletion succeeded");
        } else {
            System.out.println("Animal doesn't exist");
        }
        myZoo.showAnimals();

        if (myZoo.isZooFull()) {
            System.out.println("Zoo is full ");
        } else {
            System.out.println("Zoo still can have more animals");
        }

        Zoo myZoo2 = new Zoo("my Zoo2", "Belvédère");

        System.out.println(Zoo.comparerZoo(myZoo2, myZoo));


        Dolphin dolphin = new Dolphin("Aquatic", "dolphin", 2, true, "Ocean", 20.5f);

        Penguin penguin = new Penguin("Aquatic", "penguin", 2, true, "Antarctica", 30.0f);


        Terrestrial terrestrial = new Terrestrial("Animal", "Terrestrial", 3, true, 4);

        //Aquatic aquatic = new Aquatic("Animal", "Aquatic", 4, true, "Antarctica");

        System.out.println("Dolphin habitat: " + dolphin.getHabitat() + "zsw" + ", Swimming Speed: " + dolphin.getswimmingSpeed());
        System.out.println("Penguin habitat: " + penguin.getHabitat() + ", Swimming Depth: " + penguin.getswimmingDepth());
        System.out.println("Terrestrial Legs: " + terrestrial.getNbrLegs());

        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(terrestrial);

        dolphin.swim();
        penguin.swim();

        Dolphin flipper = new Dolphin("Aquatic", "dolphin", 2, true, "Ocean", 25.5f);
        Dolphin bublle = new Dolphin("Aquatic", "dolphin", 2, true, "Ocean", 18.5f);
        Penguin chilly = new Penguin("Aquatic", "penguin", 2, true, "Antarctica", 32.0f);
        Penguin frosty = new Penguin("Aquatic", "penguin", 2, true, "Antarctica", 16.0f);

        myZoo.addAquaticAnimal(flipper);
        myZoo.addAquaticAnimal(bublle);
        myZoo.addAquaticAnimal(chilly);
        myZoo.addAquaticAnimal(frosty);

        System.out.println(myZoo);
        System.out.println(myZoo.getCountAquaticAnimal());

        for (Aquatic aquaticAnimal : myZoo.getAquaticAnimals()) {
            if (null != aquaticAnimal) {
                aquaticAnimal.swim();
            }
        }


    }

}

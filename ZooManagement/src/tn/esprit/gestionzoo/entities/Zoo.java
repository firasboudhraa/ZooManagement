package tn.esprit.gestionzoo.entities;
public class Zoo {
    private Animal[] animals ;
    private String name ;
    private String city ;
    public static final int MAX_CAGES = 25 ;
    private int countAnimal ;
    private Aquatic[] aquaticAnimals  ;
    private final int MAX_AQUATIC_ANIMALS = 10 ;
    private int countAquaticAnimal ;


    public Zoo(String name, String city) {

        this.animals = new Animal[MAX_CAGES];
        this.aquaticAnimals = new Aquatic[MAX_AQUATIC_ANIMALS];
        this.countAquaticAnimal = 0;


        this.name = name;

        this.city = city;

        //this.nbrCages = nbrCages;


        this.countAnimal = 0;

    }
    public String getName(){
        return name ;
    }
    public  void setName( String name){
        if (name != null && !name.isEmpty()){
            this.name = name ;
        } else {
            System.out.println("Le nom d'un zoo ne doit pas etre vide");
        }
    }
    public String getCity(){
        return  city ;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountAnimal() {
        return countAnimal;
    }

    public int getMAX_CAGES() {
        return MAX_CAGES;
    }

    @Override
    public String toString(){

        return "Zoo: " + name + ", City: " + city + ", Number of Cages: " + countAnimal ;
    }
    public void displayZoo(){
        System.out.println("Zoo: " + name + ", City: " + city + ", Number of Cages: " + countAnimal);
    }
    /*public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) == -1) {
            if (!isZooFull()) {
                animals[countAnimal] = animal;
                countAnimal++;
                return true;
            } else {
                System.out.println("Failed to add animal. The zoo is already full.");
            }
        } else {
            System.out.println("Failed to add animal. The animal is already exist in the zoo.");
        }
        return false;
    }*/
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) == -1) {
            if (!isZooFull()) {
                animal.setAge(animal.getAge());
                if (animal.getAge() >= 0) {
                    animals[countAnimal] = animal;
                    countAnimal++;
                    System.out.println("Animal '" + animal.getName() + "' added to the zoo.");
                    return true;
                } else {
                    System.out.println("Failed to add animal. Invalid age (negative).");
                }
            } else {
                System.out.println("Failed to add animal. The zoo is already full.");
            }
        } else {
            System.out.println("Failed to add animal. The animal is already exist in the zoo.");
        }
        return false;
    }

    public void showAnimals() {
        System.out.println("Animals in the zoo: ");
        for (int i = 0; i < countAnimal; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal){
        for (int i=0; i < countAnimal ; i++){
            if(animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int animalIndex = searchAnimal(animal);

        if (animalIndex != -1) {
            for (int i = animalIndex; i < countAnimal - 1; i++) {
                animals[i] = animals[i + 1];
            }
            countAnimal--;
            return true;
        } else {
            System.out.println("Failed to remove animal. The animal does not exist in the zoo.");
            return false;
        }
    }

    public boolean isZooFull(){

        return countAnimal >= MAX_CAGES;
    }


    public static Zoo comparerZoo(Zoo z1 , Zoo z2){
        if (z1.countAnimal < z2.countAnimal){
            return z2 ;
        }else if (z1.countAnimal > z2.countAnimal){
            return z1 ;
        }else {
            System.out.println("les zoos ont le meme nombre d'animaux");
            return null;
        }
    }

    public int getCountAquaticAnimal() {
        return countAquaticAnimal;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public void addAquaticAnimal(Aquatic aquatic){
        if(countAquaticAnimal < MAX_AQUATIC_ANIMALS ){
            aquaticAnimals[countAquaticAnimal]=aquatic ;
            countAquaticAnimal++;
            System.out.println("Aquatic Animal added to the zoo");
        }else {
            System.out.println("Failed to add Aquatic Animal to the zoo");
        }
    }

    public float maxPenguinSwimmingDepth(){
        float maxDepth = 0 ;
        for (Aquatic aquaticAnimal : aquaticAnimals){
            if(aquaticAnimal instanceof Penguin penguin){
                if(penguin.getswimmingDepth() > maxDepth){
                    maxDepth = penguin.getswimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void dispalyNumberOfAquaticsByType(){
        int numberOfDophin =0 , numberrOfPenguin=0;
        for(Aquatic aquaticAnimal : aquaticAnimals){
            if (aquaticAnimal instanceof Dolphin){
                numberOfDophin ++;
            }else if (aquaticAnimal instanceof Penguin){
                numberrOfPenguin++;
            }
        }
        System.out.println("Nombre des dophins dans le zoo = "+numberOfDophin);
        System.out.println("Nombre des penguins dans le zoo = "+numberrOfPenguin);
    }


}

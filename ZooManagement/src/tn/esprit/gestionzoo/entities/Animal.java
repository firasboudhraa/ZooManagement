package tn.esprit.gestionzoo.entities;

public sealed class Animal permits Aquatic, Terrestrial {
    protected String family;
    protected String name ;
    protected int age ;
    protected boolean isMammal;

    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age ;
        this.isMammal = isMammal;
    }

    public String getFamily(){
        return family ;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public String getName(){
        return name ;
    }
    public int getAge(){
        return  age ;
    }

    public void setAge( int age){
        if (age < 0){
            System.out.println("L'age d'un animal doit etre positif ");
        } else {
            this.age = age ;
        }
    }
    public boolean isMammal(){
        return isMammal ;
    }

    @Override
    public String toString(){
        return "Family: " + family + ", name: " + name + ", Age: " + age + ", is Mammal:" + isMammal ;
    }
}

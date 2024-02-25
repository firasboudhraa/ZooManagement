package tn.esprit.gestionzoo.entities;

public non-sealed abstract class Aquatic extends Animal{
    public String habitat ;

    public Aquatic() {
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat=habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" + super.toString()+
                " habitat='" + habitat + '\'' +
                '}';
    }

    public abstract void swim ();


    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (null == anObject || getClass() != anObject.getClass()) return false ;

        Aquatic aquaticAnimal = (Aquatic) anObject ;
        return getAge() == aquaticAnimal.getAge() && getName().equals(aquaticAnimal.getName()) && habitat.equals(aquaticAnimal.habitat);

    }

}

package tn.esprit.gestionzoo.entities;

public final class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin() {
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat , float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    public float getswimmingSpeed() {
        return this.swimmingSpeed;
    }

    public void setswimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" + super.toString()+
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }

    public void swim (){
        System.out.println("this dolphin is swimming with a speed of  "+ swimmingSpeed);
    }
}

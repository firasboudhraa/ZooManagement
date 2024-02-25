package tn.esprit.gestionzoo.entities;

public final class Penguin extends Aquatic {
    private float swimmingDepth ;

    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat , float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getswimmingDepth() {
        return swimmingDepth;
    }

    public void setswimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" + super.toString() +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }

    @Override
    public void swim() {
        System.out.println("this penguin is swimming with a speed of " +swimmingDepth);
    }

}

package common;

public class NoodleModifiers {

    private double lengthInCentimeters;
    private double widthInCentimeters;
    private String shape;
    protected String ingredients;
    private String texture = "brittle";

    NoodleModifiers (double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    final public boolean isTasty() {

        return true;

    }

    public static void main(String[] args) {

        RamenChildOfNoodleModifier yasaiRamen = new RamenChildOfNoodleModifier();
        System.out.println(yasaiRamen.ingredients);
        System.out.println(yasaiRamen.isTasty());

    }
}

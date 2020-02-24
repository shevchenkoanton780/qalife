package common;

public class NoodleParentClass {
    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    String ingredients;
    String texture = "brittle";

    NoodleParentClass(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public void cook() {

        this.texture = "cooked";

    }

    public static void main(String[] args) {

        PhoSubClass phoChay = new PhoSubClass();
        System.out.println(phoChay.shape);
        System.out.println(phoChay.lengthInCentimeters);
        System.out.println(phoChay.widthInCentimeters);
        System.out.println(phoChay.ingredients);
    }

}

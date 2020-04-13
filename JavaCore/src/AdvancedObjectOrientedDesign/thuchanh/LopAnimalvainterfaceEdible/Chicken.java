package AdvancedObjectOrientedDesign.thuchanh.LopAnimalvainterfaceEdible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cục ta cục tac";
    }

    @Override
    public String howToEat() {
        return "Gạo";
    }
}

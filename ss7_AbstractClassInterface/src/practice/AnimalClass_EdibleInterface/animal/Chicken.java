package practice.AnimalClass_EdibleInterface.animal;

import practice.AnimalClass_EdibleInterface.edible.Edible;

public class Chicken  extends  Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: kfc- kfc";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}

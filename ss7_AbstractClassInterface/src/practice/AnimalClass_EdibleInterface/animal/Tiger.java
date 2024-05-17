package practice.AnimalClass_EdibleInterface.animal;

import practice.AnimalClass_EdibleInterface.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Tiger: roarrrr";
    }
    @Override
    public String howToEat(){
        return "could be meat";
    }
}

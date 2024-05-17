package practice.AnimalClass_EdibleInterface;

import practice.AnimalClass_EdibleInterface.animal.Animal;
import practice.AnimalClass_EdibleInterface.animal.Chicken;
import practice.AnimalClass_EdibleInterface.animal.Tiger;
import practice.AnimalClass_EdibleInterface.edible.Edible;
import practice.AnimalClass_EdibleInterface.fruit.Apple;
import practice.AnimalClass_EdibleInterface.fruit.Fruit;
import practice.AnimalClass_EdibleInterface.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal [] animals = new Animal[2];
        animals[1] = new Chicken();
        animals[0] = new Tiger();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if( animal instanceof  Chicken){
                Edible edible = (Chicken) animal ;
                System.out.println(edible.howToEat());
            }
        }
        Fruit [ ] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}

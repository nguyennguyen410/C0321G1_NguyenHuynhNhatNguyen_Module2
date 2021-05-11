package abstract_class_interface.thuc_hanh.animal_interface_edible;

import abstract_class_interface.thuc_hanh.animal_interface_edible.Animal;
import abstract_class_interface.thuc_hanh.animal_interface_edible.Chicken;
import abstract_class_interface.thuc_hanh.animal_interface_edible.Tiger;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }

        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

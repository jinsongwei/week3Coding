package jungle.animal;

import jungle.food.Food;

public class Monkey extends AnimalDefault{

    public Monkey() {
        super();
    }

    @Override
    public void makeSound() {
        if(energyLevel < 1){
            System.out.println(" not enough energy ");
            return;
        }
        energyLevel -= 4;
        System.out.println("monkey is making sound");
    }

    @Override
    public void eatFood(Food food) {
        energyLevel += 2;
        System.out.println("Monkey is eating " + food.whatIs());
    }

    public void play(){
        if(energyLevel < 1){
            System.out.println("Monkey is too tired");
            return;
        }
        System.out.println("Oooo Oooo Oooo");
        energyLevel -= 8;
    }
}

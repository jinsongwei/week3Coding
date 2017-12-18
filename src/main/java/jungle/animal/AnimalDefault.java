package jungle.animal;

import jungle.food.Food;

public abstract class AnimalDefault implements Animal{

    protected int energyLevel;

    protected AnimalDefault() {
        energyLevel = 0;
        AnimalCount.getInstance().increaseAcount(this);
    }

    @Override
    public void makeSound() {
        if(energyLevel < 1) {
            System.out.println("not enough energy to perform");
            return;
        }
        System.out.println("making sound ... ");
        energyLevel -= 3;
    }

    @Override
    public void eatFood(Food food) {
        System.out.println("eating a " + food.whatIs());
        energyLevel += 5;
    }

    @Override
    public void sleep() {
        System.out.println("sleeping ");
        energyLevel += 10;
    }

}

package jungle.animal;

import jungle.food.Food;
import jungle.food.Grain;

public class Tiger extends AnimalDefault{

    public Tiger() {
        super();
    }

    @Override
    public void eatFood(Food food) {
        if(food instanceof Grain){
            System.out.println("Tiger can't eat grain");
            return;
        }
        super.eatFood(food);
    }

    @Override
    public void sleep() {
        energyLevel += 5;
        System.out.println("Tiger is sleeping");
    }
}

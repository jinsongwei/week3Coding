package jungle.animal;

import jungle.food.Food;

public interface Animal {
    void makeSound();
    void eatFood(Food food);
    void sleep();
}

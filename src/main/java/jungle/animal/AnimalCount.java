package jungle.animal;

public class AnimalCount {
    private static AnimalCount ourInstance = new AnimalCount();

    public static AnimalCount getInstance() {
        return ourInstance;
    }

    private int tigers;
    private int snakes;
    private int monkeys;

    private AnimalCount() {
        tigers = 0;
        snakes = 0;
        monkeys = 0;
    }

    public synchronized void increaseAcount(Animal animal) {
        if (animal instanceof Monkey)
            monkeys++;
        else if (animal instanceof Snake)
            snakes++;
        else if (animal instanceof Tiger)
            monkeys++;
        else {
            System.err.println("Unrecognized animal");
        }
    }

    public static int getAnimalsCount(Animal animal) throws Exception {
        if (animal instanceof Monkey)
            return getInstance().monkeys;
        else if (animal instanceof Snake)
            return getInstance().snakes;
        else if (animal instanceof Tiger)
            return getInstance().tigers;
        else {
            System.err.println("Unrecognized animal");
            throw new Exception();
        }
    }
}

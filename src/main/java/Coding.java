import jungle.animal.AnimalCount;
import jungle.animal.Monkey;
import jungle.animal.Snake;
import jungle.animal.Tiger;
import jungle.food.Grain;
import jungle.food.Meet;

import java.util.*;

public class Coding {
    public static void main(String[] args) throws Exception {

        // coding 1
//        String test1 = "abc";
//        List<String> list = getSubstrings(test1);
//        for (String aList : list) {
//            System.out.println(aList);
//        }

        // coding 2
//        String test2 = "akjfusdfj0924984()(8";
//        System.out.println(encoding(test2));

        // OOD
        jungleTest();
    }

    private static List<String> getSubstrings(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0)
            return result;
        result.add(str);
        HashSet<String> set = new HashSet<>();

        Queue<String> queue = new LinkedList<>();
        queue.add(str);

        while (!queue.isEmpty()) {
            String s = queue.poll();
            int len = s.length();
            if (len < 2)
                continue;
            for (int i = 0; i < len; i++) {
                String add = s.substring(0, i) + s.substring(i + 1, len);
                if (!set.contains(add)) {
                    set.add(add);
                    result.add(add);
                    queue.add(add);
                }
            }
        }
        return result;
    }

    private static String encoding(String str) {
        if (str == null || str.length() == 0)
            return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int pos = c - 'a';
            if (pos > 25 || pos < 0)
                sb.append(c);
            else
                sb.append((char) ('a' + 25 - pos));
        }
        return sb.toString();
    }

    private static void jungleTest() throws Exception {
        System.out.println("Tiger :\n");
        Tiger tiger = new Tiger();
        tiger.makeSound();
        tiger.eatFood(new Grain());
        tiger.eatFood(new Meet());
        tiger.sleep();
        tiger.makeSound();

        System.out.println();

        System.out.println("Snake :\n");
        Snake snake = new Snake();
        snake.makeSound();
        snake.eatFood(new Grain());
        snake.eatFood(new Meet());
        snake.sleep();
        snake.makeSound();

        System.out.println("\nMonkey:\n");
        Monkey monkey = new Monkey();
        monkey.makeSound();
        monkey.eatFood(new Grain());
        monkey.eatFood(new Meet());
        monkey.sleep();
        monkey.makeSound();
        monkey.play();

        System.out.println("monkey count");
        System.out.println(AnimalCount.getAnimalsCount(monkey));
    }
}

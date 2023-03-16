// Пусть дан произвольный список целых чисел, удалить из него чётные числа
package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class HW3_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        
        System.out.println("Before removing even numbers: " + numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println("After removing even numbers: " + numbers);
    }
}
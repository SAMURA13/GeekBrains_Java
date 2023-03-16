// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class HW3_3 {
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
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            sum += number;
        }
        double avg = sum / numbers.size();
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        System.out.println("Average: " + avg);
    }
}
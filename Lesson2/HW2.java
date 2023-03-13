package Lesson2;

import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import java.util.Arrays;

import java.io.FileWriter;

import java.io.IOException;
public class HW2 {
//     Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.
public static void main(String[] args) {
    int[] arr = {5, 3, 8, 4, 2};
    sort(arr);
}

public static void sort(int[] arr) {
    int n = arr.length;
    boolean swapped = true;
    while (swapped) {
        swapped = false;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                swapped = true;
            }
        }
        logArray(arr); // запись массива в лог-файл после каждой итерации
        n--;
    }
}

public static void logArray(int[] arr) {
    try {
        FileWriter writer = new FileWriter("log.txt", true);
        writer.write("[" + String.join(", ", Arrays.toString(arr)) + "]\n");
        writer.close();
    } catch (IOException e) {
        System.out.println("An error occurred while writing to log file.");
        e.printStackTrace();
    }
}
    
 }

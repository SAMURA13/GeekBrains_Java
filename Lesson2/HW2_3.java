package Lesson2;

import java.util.Scanner;

public class HW2_3 {
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
   
            return true;
        }
        int left = 0, right = str.length() - 1;
        while (left < right) {
        
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
        
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println(input + " - это палиндром!");
        } else {
            System.out.println(input + " - это не палиндром!");
        }
    }
}
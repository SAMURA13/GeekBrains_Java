package Lesson1;

import java.util.Scanner;
public class HW1 {

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Введите число");
    //     int n = scanner.nextInt();

    //     // Вычисляем n-ое треугольное число
    //     int triangleNumber = 0;
    //     for (int i = 1; i <= n; i++) {
    //         triangleNumber += i;
    //     }
    //     System.out.println("Треугольное число 1 + 2 + ... + " + n + " = " + triangleNumber);

    //     // Вычисляем n!
    //     int factorial = 1;
    //     for (int i = 1; i <= n; i++) {
    //         factorial *= i;
    //     }
    //     System.out.println("n! = " + factorial);
    // }
// Вывести все простые числа от 1 до 1000
//   public static void main(String[]args) {
//     for (int i = 2; i <= 1000; i++) {
//         boolean isPrime = true;

//         // Проверяем, является ли текущее число простым
//         for (int j = 2; j <= Math.sqrt(i); j++) {
//             if (i % j == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }

//         // Если число простое, выводим его на экран
//         if (isPrime) {
//             System.out.println(i);
    
//   }

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
public static void main(String[] args) {
    Scanner calc = new Scanner(System.in);

    System.out.print("Введите первое число: ");
    double num1 = calc.nextDouble();

    System.out.print("Введите оператор (+, -, *, /): ");
    char operator = calc.next().charAt(0);

    System.out.print("Введите второе число: ");
    double num2 = calc.nextDouble();

    double result;

    switch (operator) {
        case '+':
            result = num1 + num2;
            break;

        case '-':
            result = num1 - num2;
            break;

        case '*':
            result = num1 * num2;
            break;

        case '/':
            result = num1 / num2;
            break;

        default:
            System.out.println("Ошибка: введен неверный оператор");
            return;
        }

    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}

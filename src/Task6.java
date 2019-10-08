/*Написать программу, которая будет выполнять следующие действия:

1. Ввод трех чисел с клавиатуры x, y, z

2. Нахождение и вывод на экран среднего арифметического чисел x, y, z

3. Деление среднего арифметического на 2 без остатка

4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно" */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите число X: ");

        int X = str.nextInt();

        Scanner str2 = new Scanner(System.in);
        System.out.println("Введите число Y: ");

        int Y = str2.nextInt();

        Scanner str3 = new Scanner(System.in);
        System.out.println("Введите число Z: ");

        int Z = str3.nextInt();

        System.out.println("Среднее арифмитическое 3х чисел: " + (X+Y+Z) / 3);

        int M = ((X+Y+Z) / 3) / 2 ;

        if (M > 3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}

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

        System.out.println("Введите число Y: ");
        int Y = str.nextInt();

        System.out.println("Введите число Z: ");
        int Z = str.nextInt();

        float R = (float) (X+Y+Z) / 3;
        System.out.println("Среднее арифмитическое 3х чисел: " + R);

        int M = (int)(R/2);

        if (M > 3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}

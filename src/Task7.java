/*
Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
В программе должны присутствовать константы X, Y, Z. Программа должна сравнивать введенное значение с клавиатуры
со значением констант и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
*/
import java.util.Scanner;

public class Task7 {
public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = str.nextInt();

        final int X = 1;
        final int Y = 2;
        final int Z = 3;

        if (number == X || number == Y || number == Z) {
        System.out.println("Данное значение имеется в константах");
        }
        else
        {
        System.out.println("Такой константы нет!");
        }
        }
        }
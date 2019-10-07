import java.util.Scanner;

public class exampleif5 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = str.nextInt();
        if (number == 1)
        {
            System.out.println("Вы ввели число 1");
        }
    }
}
import java.util.Scanner;

/*Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.*/
public class Task4 {
    public static void main(String[] args) {

        //ввод числа в бинарном формате
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер в двоичном формате: ");

        String bin = sc.nextLine();

        int binNum = Integer.parseInt(bin, 2);
        System.out.println(binNum);
    }
}
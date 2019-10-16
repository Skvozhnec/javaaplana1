/*Произведите ввод данных с клавиатуры в массив,
а после этого произведите вывод массива на экран,
где каждый элемент массива умножается на 2. Размер массива задается пользователем.*/
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int Arraylength = str.nextInt();
        int Array[] = new int[Arraylength];

        for (int i = 0; i < Arraylength; i++) {
            System.out.println("Введите переменную №: ");
            int b = str.nextInt();
            Array[i] = b;
        }

        for(int j = 0; j < Arraylength; j = j + 1) {
                System.out.println("Элемент массива х2: " + Array[j] * 2);
        }
    }
}

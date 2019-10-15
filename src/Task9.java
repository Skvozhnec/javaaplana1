/*Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
где каждый элемент массива умножается на 2. Размер массива задается пользователем.*/
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int massive = str.nextInt();

        int razmer[] = new int[massive];
        int i;
        for(i = 0; i < massive; i = i + 1)
            razmer[i] = i;
        for(i = 0; i < massive; i = i + 1)
        System.out.println("Элемент массива х2: " + i * 2);

    }
}

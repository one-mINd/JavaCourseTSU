import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {

                /* ИНИЦИАЛИЗАЦИЯ И ВВОД МАССИВА */
                System.out.println("Для выхода из программы введите любой не числовой символ/последовательность символов");
                System.out.println("Введите размерность массива: ");
                int count_elements = scanner.nextInt();

                int[] array = create_array(count_elements);

                output_array(array, count_elements);
                Arrays.sort(array);
                output_array(array, count_elements);

            }
        } catch (Throwable t) {
            System.out.println("Вы вышли из программы");
        }
    }
    private static void output_array(int[] array, int count_elements){
        for (int i = 0; i < count_elements; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.print("\n");
    }

    private static int [] create_array(int count_elements){
        int array[] = new int[count_elements];
        for (int i = 0; i < count_elements; i++) {
            array[i] = ((int) (Math.random() * 3) - 1);
        }
        return array;
    }
}

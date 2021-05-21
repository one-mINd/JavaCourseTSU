import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;


public class Lab3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {

                /* ИНИЦИАЛИЗАЦИЯ И ВВОД МАССИВА */
                System.out.println("Для выхода из программы введите любой не числовой символ/последовательность символов");
                System.out.println("Введите размерность массива row_count на column_count: ");
                System.out.print("row_count= ");
                int row_count = scanner.nextInt();
                System.out.print("column_count= ");
                int column_count = scanner.nextInt();

                /*СОЗДАНИЕ МАССИВА*/
                int[][] array = create_array(row_count, column_count);

                /*ВЫВОД МАССИВА*/
                output_array(array, row_count, column_count);

                /* ПОДСЧЁТ КОЛИЧЕСТВА ЭЛЕМЕНТОВ */
                System.out.print("Сумма индексов должна быть больше чем? ");
                int item_to_search = scanner.nextInt();
                int count = 0;
                ArrayList<Integer> total_array = new ArrayList<Integer>();
                for (int i = 0; i < row_count; i++) {
                    for (int j = 0; j < column_count; j++) {
                        int tmp[] = new int[2];
                        if (array[i][j] > 0 && i+j > item_to_search) {
                            count += 1;
                            total_array.add(i);
                            total_array.add(j);
                        }
                    }
                }

                /* ВЫВОД */
                output_vector(item_to_search, count, total_array);
            }
        } catch (Throwable t){
            System.out.println("Вы вышли из программы");
        }
    }
    private static int [][] create_array(int row_count, int column_count){
        int array[][] = new int[row_count][column_count];
        for (int i = 0; i < row_count; i++) {
            for (int j = 0; j < column_count; j++) {
                array[i][j] = ((int) (Math.random() * 101) - 50);
            }
        }
        return array;
    }

    private static void output_vector(int item_to_search, int count, ArrayList<Integer> total_array){
        System.out.println("Количество элементов с суммой индексов более" + item_to_search + " В массиве равно " + count);
        System.out.println("Индексы элементов удовлетворяющих условиям ");
        for (int i = 0; i < total_array.size(); i++){
            if (i == 0 || i % 2 == 0){
                System.out.println("i = " + total_array.get(i));
            } else {
                System.out.println("j = " + total_array.get(i));
                System.out.println("__________________________");
            }
        }
    }

    private static void output_array(int[][] array, int row_count, int column_count){
        for (int i = 0; i < row_count; i++) {
            for (int j = 0; j < column_count; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

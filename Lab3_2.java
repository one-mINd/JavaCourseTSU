import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {

                /* ИНИЦИАЛИЗАЦИЯ И ВВОД МАССИВА */
                System.out.println("Для выхода из программы введите любой не числовой символ/последовательность символов");
                System.out.println("Введите размерность массива m на n: ");
                System.out.print("m= ");
                int row_count = scanner.nextInt();
                System.out.print("n= ");
                int column_count = scanner.nextInt();

                int[][] array = create_array(row_count, column_count);

                output_array(array, row_count, column_count);

                System.out.println("Введите начало и конец отрезка");
                System.out.print("a= ");
                int a = scanner.nextInt();
                System.out.print("b= ");
                int b = scanner.nextInt();
                ArrayList<Integer> total_array = new ArrayList<Integer>();

                for (int i=0; i < column_count; i++){
                    int sum = 0;
                    for (int j = 0; j< row_count; j++){
                        if (!check_entry_into_segment(a, b, array[i][j])){
                            sum+=array[i][j];
                        }
                    }
                    total_array.add(sum);
                }

                for (int i = 0; i < total_array.size(); i++) {
                    System.out.print(total_array.get(i) + " ");
                }
            }
        } catch (Throwable t) {
            System.out.println("Вы вышли из программы");
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

    private static int [][] create_array(int row_count, int column_count){
        int array[][] = new int[row_count][column_count];
        for (int i = 0; i < row_count; i++) {
            for (int j = 0; j < column_count; j++) {
                array[i][j] = ((int) (Math.random() * 101) - 50);
            }
        }
        return array;
    }

    private static boolean check_entry_into_segment(int a, int b, int num){
        if (num >= a && num <= b){
            return true;
        } else {
            return false;
        }
    }
}
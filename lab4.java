import java.util.Scanner;
import java.util.Arrays;

public class lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("сколько раз вы хотите выполнить операцию?");
        int count = scanner.nextInt();
        for (int i=0; i<count; i++) {
            String str = scanner.nextLine();
            str = str.replace('!', '.').replace(';', '.').replace(':', '.').replace('?', '.').replace(',', '.');
            String[] list = str.split("\\.");
            Arrays.sort(list);
            for (String word : list) {
                System.out.println(word);
            }
        }
    }
}

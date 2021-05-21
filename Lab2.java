import java.util.Scanner;

import static java.lang.Math.*;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        double total;
        x = scanner.nextInt();
        if (x<-1){
            total = part1(x);
        } else if (x>=-1 && x<1){
            total = part2(x);
        } else {
            total = part3(x);
        }
        System.out.print(total);
    }

    private static double part1(int variable){
        return pow(variable, 6)*log(abs(pow(6, variable)-abs(pow(variable-5, variable))));
    }

    public static double part2(int variable){
        return sin(variable/(1-2*pow(variable, 2)));
    }

    public static double part3(int variable){
        return asin(1/pow(variable, 4));
    }
}
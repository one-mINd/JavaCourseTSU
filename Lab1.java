import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.asin;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.log;
import static java.lang.Math.sin;
import static java.lang.Math.cos;

public class Lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variable_x = scanner.nextInt();
        double variable_y = part1(variable_x) + part2(variable_x) + part3(variable_x);
        double hypotenuse = sqrt(pow(variable_x, 2)+pow(variable_y, 2));
        if (hypotenuse<5 && variable_x>=0){
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }

    private static double part1(int variable){
        double result = asin(pow(sqrt(abs(variable))/(sqrt(abs(variable)+1)), 5));
        return result;
    }

    private static double part2(int variable){
        double result = pow(pow(variable, 2) + 1, 1.0/5);
        return result;
    }

    private static double part3(int variable){
        double result = log(pow(2, sin(variable)+abs(pow(variable, cos(variable)))))/log(2.0);
        return result;
    }
}

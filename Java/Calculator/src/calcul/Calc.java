package calcul;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("выберите операцию: ");
        System.out.println("1. сложение");
        System.out.println("2. вычитание");
        System.out.println("3. умножение");
        System.out.println("4. деление");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        System.out.println("введите 1 число:");
        int x = sc.nextInt();
        System.out.println("введите 2 число:");
        int y = sc.nextInt();
        int r2 = 0;
        if (op == 1)
            r2 = x + y;
        else if (op == 2)
            r2 = x - y;
        else if (op == 3)
            r2 = x * y;
        else if ((op == 4) && (y != 0))
            r2 = x / y;
        System.out.println("результат = " + r2);
    }
}

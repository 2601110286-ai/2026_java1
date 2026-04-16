package ai0402;

import java.util.Scanner;

public class Lab0402 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Calculator");
        System.out.print("정수1입력 : ");
        int num1 = s.nextInt();
        System.out.print("정수2입력 : ");
        int num2 = s.nextInt();

        System.out.printf("%d + %d = %d\n",num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n",num1, num2, num1 - num2);
        System.out.printf("%d x %d = %d\n",num1, num2, num1 * num2);
        System.out.printf("%d / %d = %d\n",num1, num2, num1 / num2);
        System.out.printf("%d %% %d = %d\n",num1, num2, num1 % num2);

        s.close();
    }
}

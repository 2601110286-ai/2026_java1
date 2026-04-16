package ai0402;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lb0402 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("파운드(lb)를 입력하세요 : ");
        double num1 = s.nextInt();
        double num2 = 0.453592;
        System.out.printf("%f파운드(lb)는 %f킬로그램(kg)입니다.\n", num1, num1*num2);

        System.out.printf("킬로그램(kg)을 입력하세요 : %f\n", num1);
        double num3 = 2.204623;
        System.out.printf("%f킬로그램(kg)는 %f파운드(lb)입니다.", num1, num1*num3);

        s.close();
    }
}

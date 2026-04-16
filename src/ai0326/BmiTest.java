package ai0326;

import java.util.Scanner;

public class BmiTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("당신의 키는 몇cm입니까?");
        double height = s.nextDouble();
        System.out.println("당신의 몸무게는 몇kg입니까?");
        double weight = s.nextDouble();
        System.out.println("성명을 입력하세요.");
        String name = s1.nextLine();

        System.out.println(""+(name)+"님의 bmi 지수는 "+(weight/((height/100)*(height/100)))+"입니다.");

        s.close();
        s1.close();
    }
}

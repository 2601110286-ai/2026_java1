package ai0326;

import java.util.Scanner;

public class LabInform {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ##");
        System.out.println("받는 사람:");
        String  Receiver = s.nextLine();
        System.out.println("주소:");
        String Address = s1.nextLine();
        System.out.println("무게(g):");
        double Weight = s2.nextDouble();

        System.out.println("받는 사람 ==> " + Receiver);
        System.out.println("주소 ==> " + Address);
        System.out.println("배송비 ==> " + (Weight*5) +"원");

        s.close();
        s1.close();
        s2.close();
    }
}

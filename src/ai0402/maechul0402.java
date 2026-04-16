package ai0402;

import java.util.Scanner;

public class maechul0402 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int B_coffie = -500;
        int S_coffie = 1800;
        int B_kimbab = -900;
        int S_kimbab = 1400;
        int B_milk = -800;
        int S_milk = 1800;
        int B_docilak = -3500;
        int S_docilak = 4000;
        int B_cola = -700;
        int S_cola = 1500;
        int B_saeukkang = -1000;
        int S_saeukkang = 2000;

        int result = (B_kimbab*10)+(S_milk*2)+(B_docilak*5)+(S_docilak*4)+(S_cola)+(S_saeukkang*4)+(S_coffie*5);

        System.out.printf("오늘 총 매출액은 %d원입니다.", result);

        s.close();

        /// 내피셜

    }
}

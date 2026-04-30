package ai0430;

import java.util.Scanner;

public class LAB_switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("출생년도에 따른 띠를 알려주는 프로그램");
        System.out.print("출생년도를 입력하세요: ");
        int birthYear = s.nextInt();
        String result = "";

        switch (birthYear % 12) {
            case 0:
                result = "원숭이띠";
                break;
            case 1:
                result = "닭띠";
                break;
            case 2:
                result = "개띠";
                break;
            case 3:
                result = "돼지띠";
                break;
            case 4:
                result = "쥐띠";
                break;
            case 5:
                result = "소띠";
                break;
            case 6:
                result = "호랑이띠";
                break;
            case 7:
                result = "토끼띠";
                break;
            case 8:
                result = "용띠";
                break;
            case 9:
                result = "뱀띠";
                break;
            case 10:
                result = "말띠";
                break;
            case 11:
                result = "양띠";
                break;
        }
        System.out.printf("본인의 출생년도%d의 띠는 %s입니다",birthYear ,result);
        s.close();
    }
}

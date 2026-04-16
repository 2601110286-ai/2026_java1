package ai0402;

import java.util.Scanner;

public class Bigyo0402 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("시험 점수를 입력하세요 : ");
        int score = s.nextInt();
        String result = "";

        if(score >= 70)
        {
            result = "";
            System.out.printf(" %d점이므로 합격입니다.", score);
        }
        else
        {
            result = "";
            System.out.printf("%d점이므로 불합격입니다.", score);
        }

        s.close();
    }
}

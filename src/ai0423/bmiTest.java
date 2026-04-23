package ai0423;

import java.util.Scanner;

public class bmiTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("====== BMI ======");

        System.out.println("체중 입력: ");
        double weight = s.nextDouble();

        System.out.println("키 입력: ");
        double height = s.nextDouble();

        System.out.println("성명 입력: ");
        String name = s1.nextLine();

        double bmi = weight/Math.pow(height/100,2);
        String result1, result2;

        if(bmi < 10.5) {
            result1 = "저";
            result2 = "식단과 운동을 통해 체중을 증량시켜야 합니다.";
        }
        else if(bmi < 22.9) {
            result1 = "정상";
            result2 = "현재 체중을 유지하시기 바랍니다";
        }
        else if(bmi < 24.9) {
            result1 = "과";
            result2 = "식단과 운동을 통해 체중을 감량하기를 바랍니다";
        }
        else if(bmi < 29.9) {
            result1 = "비만";
            result2 = "살 빼십쇼";
        }
        else{
            result1 = "고도비만";
            result2 = "살 빼십쇼";
        } //ㅇㅇ


        System.out.printf("%s님의 BMI 지수 결과: %.2f Kg이므로 %s체중입니다.\n",name, bmi, result1);
        System.out.printf("%s체중은 %s",result1, result2);

        s.close();
        s1.close();
    }
}

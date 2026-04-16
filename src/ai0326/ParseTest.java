package ai0326; //Integer.ParseInt() >> 문자열을 정수로 변환

public class ParseTest {
    public static void main(String[] args) {
        String num1 = "2026";
        String num2 = "3.14";

        int parseNum1 = Integer.parseInt(num1);
        double parseNum2 = Double.parseDouble(num2);

        System.out.println("변환된 정수값:" + parseNum1);
        System.out.println("변환된 실수값:" + parseNum2);
    }
}

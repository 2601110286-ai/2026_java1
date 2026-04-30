package ai0430;

public class LAB_Factorial {
    public static void main(String[] args) {
        int fact = 1;
        int friend = 5;
        for (int i = 1; i <= friend; i++) {
            fact = fact * i;
        }
        System.out.println("A, B, C, D, E 학생들을 순서대로 세우는 경우의 수: " + fact);
    }
}

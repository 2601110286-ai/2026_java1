package ai0409;

public class JaryoHyung {
    public static void main(String[] args) {
    //1.숫자형 정수형
        byte bt = -128; //-128~127
        short st = 300; //-2^15~2^15-1
        st = bt;
        int it = st;
        System.out.println(it);
        long lg = 700000;
    //2.숫자형 실수형
        float f1 = 1000;
        f1 = lg;
        f1 = 1000.0f;
        f1 = 1000.0F;
        f1 = (float)1000.0;

        double d1 = 20000;
        d1 = f1;
        d1 = bt;
        d1 = 209.999;
    //3.숫자가 아닌형 문자형
        char c = 'A';
        System.out.println(c);
        System.out.println(c+1);
        System.out.println((char)(c+1));
    //4.숫자가 아닌형 논리형
        boolean b = true;
        System.out.println(b);
        System.out.println(!b);
        System.out.println(bt == st);

    }
}
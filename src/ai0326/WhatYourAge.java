package ai0326;

import java.util.Scanner;

public class WhatYourAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("당신의 출생년도를 입력하세요.");
        int num = s.nextInt();
        System.out.println("당신의 나이는" + (2026-num+1) + "세입니다.");

        s.close();
    }
}

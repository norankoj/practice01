package com.javaex.homework_1;

import java.util.Scanner;

//정수 다섯개를 입력받아 가장 큰 수를 출력하세요.// 배열말고..최대값 구하는 법 
public class Problem05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = 0;

		System.out.println("숫자를 입력하세요");

		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			int a = sc.nextInt();
			if (max < a) {
				max = a;
			}
		}

		System.out.println(" 최대값은 " + max + " 입니다.");
		// System.out.println();

		sc.close();
	}

}

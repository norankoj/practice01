package com.javaex.homework_1;

import java.util.Scanner;

//입력한 만큼 삼각형으로 숫자 나오는 문제

public class Problem02 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력하세요");
		
		int n = sc.nextInt();
		for(int i=1;i<n+1; i++) {
			for(int j=1;j<i;j++) {
				System.out.print(i);
			} System.out.println(i);
		}
		
		sc.close();
	}
}

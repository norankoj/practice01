package com.javaex.homework_1;

//가로세로 1~10 출력 //줄 정렬이 문제..
public class Problem04 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = i; j < i + 10; j++) {
				//System.out.printf("%5s", j + 1);
				System.out.printf(j + 1+"\t");
			}
			System.out.println();
		}
	}

}

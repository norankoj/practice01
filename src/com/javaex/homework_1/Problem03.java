package com.javaex.homework_1;

//구구단 가로 나열 문제//정렬하는거 고민중 

public class Problem03 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t ");
			}
			System.out.println();
		}
	}

}
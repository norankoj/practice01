package com.javaex.homework_1;

import java.util.Scanner;

/*숨겨진 숫자를 맞추는 게임입니다.
프로그램이 실행되면 1~100 사이의 숫자가 결정됩니다.
사용자가 입력한 숫자가 결정된 숫자보다 높으면 “더 낮게” 출력
사용자가 입력한 숫자가 결정된 숫자보다 낮으면 “더 높게” 출력 되며
정답을 맞춘경우 “맞았습니다.” 출력됩니다.
게임을 반복하기 위해 y/n이라 묻고 n인 경우 종료됩니다.
(y 인경우 다시 게임이 시작됩니다.)
*/

public class Problem07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("==================");
		System.out.println("숫자맞추기 게임 시작");
		System.out.println("==================");

		int num = (int) (Math.random() * 100) + 1;
		while (true) {
			System.out.print(">>");
			int a = sc.nextInt();
			if (num == a) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까? (y/n) >>");
				sc.nextLine();
				String b = sc.nextLine();
				if (b.equals("y")) {
					System.out.println("==================");
					System.out.println("숫자맞추기 게임 종료");
					System.out.println("==================");
					break;
				} else {
					continue;
				}
			} else if (num < a) {
				System.out.println("더 낮게");

			} else {
				System.out.println("더 높게");

			}
		}
		sc.close();
	}
	 

}

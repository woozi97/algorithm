package _30_Plus_Minus;

import java.util.Scanner;

//입력된 숫자까지 +와 -를 차례대로 반복하시오
//예제입력 : 9
//출력: 1+2-3+4-5+6-7+8-9
public class Main {
	public static void main(String[] args) {
		int until;
		boolean flag=true;
		
		Scanner scan = new Scanner(System.in);
		until = scan.nextInt();
		
		for(int i=1;i<=until;i++) {//i는 1부터 시작하므로 1로 초기화
			if(i ==until) {
				System.out.println(i);
				break;//마지막 뒤에 +나 -가 안나오게 하고 싶으므로 for문 탈출하게 함
			}
			if(flag) {
				System.out.print(i+"+");
				flag=!flag;
			}
			else {
				System.out.print(i+"-");
				flag=!flag;
			}
		}
	}
}

package _35_NumPick_Recursive;

import java.util.Scanner;

//입력된 수를 높은 자릿수부터 출력하시오
//입력: 2312 -> 10으로 나누고 몫을 챙기기 
/*정답:
2
3
1
2*/
//재귀, Recursive function
public class Main {
	public static void extract(int N) {
		
		//탈출조건
		if(N/10==0) {
			System.out.println(N);
			return;
		}
		extract(N/10);//extract(123) extract(12) extract(1)//탈출조건 맞으면 끝나면 풀리면서 출력 시작됨
		System.out.println(N%10);
		//1 -> extract(1) ->1
		//2 -> extract(12) ->나머지가 2
		//3 -> extract(12) ->나머지 3
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input=scan.nextInt();
		extract(input);
	}
}

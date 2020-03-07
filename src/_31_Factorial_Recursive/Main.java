package _31_Factorial_Recursive;

import java.util.Scanner;

//입력된 수의 팩토리얼을 구하시오
//입력: 5
//정답: 120
//재귀(Recursive function)
public class Main {
	//재귀함수는 탈출조건 작성이 중요
	public static int calFact(int i) {
		if(i==1) {
			return 1;
		}
		return i*calFact(i-1); //끝나는 조건이 없으면 Stackoverflow 에러남
	}
	//3*2
	//	2*1
	//	=1
	//->3*2*1
	
	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		input=scan.nextInt();
		
		int ans=0;
		ans=calFact(input);
		System.out.println(ans);
	}
}

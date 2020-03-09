package _32_Plus_Recursive;

import java.util.Scanner;

//입력된 두 수까지의 합을 구하시오
//입력: 1 4
//출력: 10
//재귀, Recursive function
public class Main {
	//1 3 => 1+2+3=6
	public static int calAccSum(int start, int end) {
		//탈출조건
		if(start==end) {
			return end;//start로 반환해도됨 같으므로
		}
		return start+calAccSum(start+1, end); //재귀함수는 return을 먼저적고 탈출조건을 적는다.
		//1, 3 =>return 1+calAccSum(2,3);
		//						2+calAccSum(3,3)
		//								3
		//			총합은 1+2+31
		
		
	}
	
	public static void main(String[] args) {
		int start;
		int end;
		Scanner scan = new Scanner(System.in);
		
		start = scan.nextInt();
		end = scan.nextInt();
		
		int ans=0;
		ans=calAccSum(start, end);
		System.out.println("acc sum = "+ans);
		
		
	}
}

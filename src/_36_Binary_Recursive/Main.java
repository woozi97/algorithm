package _36_Binary_Recursive;

import java.util.Scanner;

//입력된 수를 이진수로 변환하세요
//17
//정답 10001
//재귀, Recursive function
public class Main {
	//17
	//8...1
	//4...1
	//2...1
	//1...0 ->10111이라고 읽음
	public static void decToBin(int N) {
	//탈출조건, 계속 2로 나누다가 몫이 0이면 탈출 
		if(N/2==0) {
			System.out.print(N);
			return;
		}
		decToBin(N/2); //2로 나눈 몫으로 계속 재귀함수 호출
		System.out.print(N%2);
		//재귀함수는 탈출조건부터 역으로 풀리면서 나옴
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		decToBin(input);
	}
}

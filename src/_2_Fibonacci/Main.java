package _2_Fibonacci;
//피보나치 수열을 출력하라
//An=An-1+An-2 //앞의 두항의 합
//1 1 2 3 5 8 13 21 34... 
//배열과 for
public class Main {
	public static void main(String[] args) {
		//1번째 방법 : 배열이용
		int []arr=new int[100];
		
		//An=An-1 + An-2; n>==3, 3항부터 만족
		//a1 = 1, a2 = 1;
		arr[1] = 1;
		arr[2] = 1;
		//foreach는 처음부터 끝까지 순회하므로 이럴떄는 일반 for문을 쓰는것이 낫다.
		for(int i=3;i<100;i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		//제대로 됐는지 피보나치 수열 출력
		for(int i=1;i<=10;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//2번째 방법
		//An
		//An=An-1 + An-2; n>==3, 3항부터 만족
		//a1 = 1, a2 = 1;
		System.out.println();
		//1항 2항의 값을 초기화하고 시작
		int prevPrevNum = 1;//An-2 번항이라 가정
		int preNum = 1;//An-1, 직전항
		System.out.print(prevPrevNum+" ");
		System.out.print(preNum+" ");
		
		for(int i=3;i<=10;i++) {
			int nNum = prevPrevNum+preNum;
			System.out.print(nNum+" ");
			prevPrevNum=preNum;
			preNum=nNum; //다음항을 구해야하기 때문에 현재항을 직전항으로 갱신해줌
			
		}
		
	}
}

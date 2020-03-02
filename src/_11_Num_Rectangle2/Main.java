package _11_Num_Rectangle2;
//입력된 수(N)만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
//4
//정답
/*
1 2 3 4
8 7 6 5
9 10 11 12
16 15 14 13*/

//중첩 반복문(for 혹은 while), 조건문(if), 배열
public class Main {
	public static void main(String[] args) {
		int n =5;
		
		int arr[][]=new int[n][n];
		
		/*
		 * n=3 
		 1 2 3 //홀수열 제대로
		 6 5 4	//짝수열 반대로
		 7 8 9
		 */
		
		//핵심 알고리즘
		for(int i=0;i<n;i++) {//i는 행
			if(i%2==0) {
				for(int j =0;j<n;j++) { //짝수열
					arr[i][j]=i*n+j+1;
				}
			}else {
				for(int j =n-1;j>=0;j--) { //홀수열 
					arr[i][j]=i*n+n-j;
				}
				//j=2->0
				//0+1 2 
			}
		}
		
		
		//일단 배열 출력
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

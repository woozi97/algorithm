package _13_Num_Rectangle4;
//입력된 수(N)만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
/*n=4
1 2 3 4
2 4 6 8
3 6 9 12
4 8 12 16*/
//중첩반복문(for 혹은 while), 배열
public class Main {
	public static void main(String[] args) {
		int n=5;
		int arr[][]=new int [n][n];
		//값을 넣는 부분
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= (i+1)*(j+1);// 보통 공식세울때, i와 j, n 그리고 1등을 더해서 만듦
			}
		}
		//출력하는 부분
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

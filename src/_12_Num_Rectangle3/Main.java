package _12_Num_Rectangle3;
//입력된 수(N)만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
/*n=4
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16*/
//중첩반복문(for 혹은 while), 배열
public class Main {
	public static void main(String[] args) {
		int n=4;
		int arr[][]=new int[n][n];
		
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[j][i]=num;//열을 먼저 방문하여 //j를 행으로 보고 i를 열로 씀(열인 i가 고정되어 행j가 바뀌면서 세로로 먼저 채워짐)
				num++;
				//arr[j][i]=i*n+j+1;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

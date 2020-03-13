package _42_RGB_distance_DP;

import java.util.Scanner;

/*RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑 중에 하나로 칠하려고 한다. 또한 그들은 모든 이웃은 같은 색으로
칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이고, 첫집과 마지막 집은 이웃이 아니다.
각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 떄,
모든 집을 칠하는 비용의 최소값을 구하는 프로그램을 작성하시오

입력: 
첫째줄에 집의 수 N이 주어진다. N은 1000보다 작거나 같다. 둘째 줄부터 N개의 줄에 각 집을 빨강으로, 초록으로,
파랑으로 칠하는 비용이 주어진다. 비용은 1000보다 작거나 같은 자연수이다.
출력:
첫째 줄에 모든 집을 칠하는 비용의 최소값을 출력한다
예제입력:
3
26 40 83 //각 R G B 인가봄
49 60 57
13 89 99
출력:
96
백준 1149번
*/
public class Main {

	static int[][] ans = new int[1002][4];//비용을 저장함(결과값)
	static int[][] rgb = new int[1002][4];
	static int R = 1;
	static int G = 2;
	static int B = 3;
	// 10Àº 3
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i = 1; i <= input; i++) {//구역
			for (int j = R; j <= B; j++) {//RGB 
				rgb[i][j] = scan.nextInt();
			}
		}

		//초기화
		for (int i = 1; i <= input; i++) {
			for (int j = R; j <= 3; j++) {
				ans[i][j] = 999999999;//최소값 구하는 거라서 최대값으로 초기화함
			}
		}
		ans[1][R] = rgb[1][R];  // rgb[2][R]  rgb[3][R] // ans[2][R] ans[3][R]=>  이웃에 같은 색이 있으면 안되니깐 ans[3][R]을 구하고 싶으면 ans[2][G]나 ans[2][B]를 이용해야함(세번째 구역을 R로 칠했을때 최소비용), 그전까지 구한 값을 이용
		ans[1][G] = rgb[1][G];  // rgb[2][G]  rgb[3][G] // ans[2][G](두번째에 G로 칠했을때의 최소비용을 갖고 있음) ans[3][G]=>
		ans[1][B] = rgb[1][B];  // rgb[2][B]  rgb[3][B] // ans[2][B] ans[3][B]=>
		for (int i = 2; i <= input; i++) {//두번째 구역부터 시작(첫번쨰는 뭘로하든 상관없으므로)
			for (int j = R; j <= B; j++) {//1부터 3까지
				for (int k = R; k <= B; k++) {//R부터 B까지
					if (j != k) {//이웃끼리 색이 달라야 하므로 ans[2][R]을 구할때는 ans[1][G]와 ans[1][B]중에 최소값을 이용해야함
						ans[i][j] = min(ans[i][j], rgb[i][j] + ans[i-1][k]);//ans[i-1][k]는 이전까지 구했던 최소값 k번째 까지
						//rgb[i][j] + ans[i-1][k]하면 ans[2][R]을 갱신할 수 있다.
					}
				}
			}
		}
		//System.out.println(ans[input][R]+","+ ans[input][G]+","+ans[input][B]);
		//96,172,185
		System.out.println(min(ans[input][R], ans[input][G], ans[input][B]));
	}

	public static int min(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}
	public static int min(int a, int b, int c) {
		if (a < b) {
			if (a < c)
				return a;
			else 
				return c;
		}
		else {
			if (b < c)
				return b;
			else
				return c;
		}
	}
}
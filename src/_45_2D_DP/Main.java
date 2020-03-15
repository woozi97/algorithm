package _45_2D_DP;

import java.util.Scanner;

/*2차원 배열이 주어졌을 때 (i, j) 위치부터 (x, y) 위치까지에 저장되어 있는 수들의 합을 구하는 프로그램을 작성하시오.
 배열의 (i, j) 위치는 i행 j열을 나타낸다.
입력
첫째 줄에 배열의 크기 N, M(1 ≤ N, M ≤ 300)이 주어진다. 
다음 N개의 줄에는 M개의 정수로 배열이 주어진다.
 배열에 포함되어 있는 수는 절댓값이 10,000보다 작거나 같은 정수이다. 
 그 다음 줄에는 합을 구할 부분의 개수 K(1 ≤ K ≤ 10,000)가 주어진다. 
 다음 K개의 줄에는 네 개의 정수로 i, j, x, y가 주어진다(i ≤ x, j ≤ y)

출력
K개의 줄에 순서대로 배열의 합을 출력한다. 배열의 합은 32bit-int 범위를 초과하지 않는다.

접근
부분합을 구하는 문제인데 2차원 배열을 매번 처음부터 탐색하면서 더해가면 시간초과로 실패하기 때문에 DP로 접근해야 한다.
먼저 기본 배열과 별개로 DP배열에 1,1을 기준으로 i,j까지의 각 부분합들을 모두 기록해 놓는다. 
그리고 DP 배열에 좌표 (x,y), (i,j)가 들어오면 (1,1)부터 (i,j) 까지 큰 사각형의 넓이에서 
더 작은 사각형의 넓이(가로, 세로)를 빼서 (x,y), (i,j)을 꼭지점으로 갖는 사각형의 넓이를 구한다고 생각하면 된다. 
단, 두 사각형을 빼면서 중복으로 빠진 부분에 대해서는 한번 더해주어야 한다.

입력: 
2 3
1 2 4
8 16 32
3
1 1 2 3
1 2 1 2
1 3 2 3

출력:
63
2
36

백준 2167번
*/

/*
 미리 DP테이블을 만들어서 합을 저장해 놓자
알고리즘 풀때는 1부터 시작해야 안헷갈리고, 실무는 0부터 해야함(약속이므로)
dp는 점화식을 세우기 위해 쭉 써보는 수밖에 없다.

점화식 뽑기
	1 2 3 4
  1 1 1 1 1
  2 2 2 2 2
  3 3 3 3 3
  4 4 4 4 4
  
  dp[1][1]=1
  dp[1][2]=dp[1][1]+num
  dp[1][3]=dp[1][2]+num
  dp[1][4]=dp[1][3]+num
  dp[2][1]=dp[1][1]+num
  dp[2][2]=dp[1][2]+dp[2][1]+num-dp[1][1]
  dp[2][3]=dp[1][3]+dp[2][2]+num-dp[1][2]
  ->dp[i][j]=dp[i-1][j]+dp[i][j-1]+num-dp[i-1][j-1]
  
  	[i,j]~[x,y]
  ex)[3,3]~[4,4]
  -> dp[4][4] - dp[4][2]-dp[2][4]+dp[2][2] ;//두번빼주었으므로 한번 더해줌
  -> dp[x][y] - dp[x][j-1]- dp[i-1][y]+dp[i-1][j-1]
 
 */
public class Main {
	public static void main(String[] args) {
		int dp[][]=new int [301][301];
		int a, b, num;
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				num=scan.nextInt();
				dp[i][j]=dp[i-1][j]+dp[i][j-1]+num-dp[i-1][j-1];
			}
		}
		
		int cnt, i, j, x, y;
		cnt=scan.nextInt();
		for(int k = 1; k<=cnt;k++) {
			i=scan.nextInt();
			j=scan.nextInt();
			x=scan.nextInt();
			y=scan.nextInt();
			System.out.println(dp[x][y]-dp[i-1][y]-dp[x][j-1]+dp[i-1][j-1]);
		}
	}
}

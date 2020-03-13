package _42_RGB_distance_DP;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		    int[][] w = new int[n][3];
		    int[][] dp = new int[n][3];
		    // dp : n��° ���� ���� ����, �ʷ�, �Ķ����� ĥ���� �� n��°������ �ּ����� ��Ƴ��� �迭

		    for(int i = 0; i < n; i++){
		      for(int j = 0; j < 3; j++){
		        w[i][j] = scan.nextInt();
		      }
		    }
		    // ù��° �������� ĥ�� �� ���� �� �ּ� ����� ù��° ���� ��ĥ ��� �� ��ü �� �⺻���� �ȴ�.
		    // 0: ����, 1: �ʷ�, 2: �Ķ� ��
		    dp[0][0] = w[0][0];
		    dp[0][1] = w[0][1];
		    dp[0][2] = w[0][2];

		    for(int i = 1; i < n; i++){
		      dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + w[i][0];
		      dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + w[i][1];
		      dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + w[i][2];
		    }

		    int min = Math.min(Math.min(dp[n-1][0], dp[n-1][1]), dp[n-1][2]);
		    System.out.println(min);
		    }
}

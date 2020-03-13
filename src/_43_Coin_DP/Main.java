package _43_Coin_DP;

import java.util.Scanner;

/*
 n가지 종류의 동전이 있다. 각각의 동전이 나타내는 가치는 다르다. 이 동전을 적당히 사용해서, 그 가치의 합이
 k원이 되도록 하고 싶다. 그 경우의 수를 구하시오. 각각의 동전은 몇 개라도 사용할 수 있다.
 사용한 동전의 구성이 같은데, 순서만 다른 것은 같은 경우이다.
 
 입력: 첫째줄에 n,k가 주어진다. (1<=n<=100, 1<=k<=10000)다음 n개의 줄에는 각각의 동전의 가치가
 주어진다. 동전의 가치는 100,000보다 작거나 같은 자연수이다.
 예제  입력:
 3 10
 1
 2
 5
 //1,2,5 원으로 총 10원을 만들 수 있는 경우의수를 구함
 출력: 
 10
 백준 2293
 */
public class Main {
	public static void main(String[] args) {
		/*
		   1  2  3  4  5  6  7  8  9  10
		1  1  1  1  1  1  1  1  1  1  1 (1원짜리로 위 수를 나타낼 수 있는 방법)
		2  0  1  1  2  2  3  3  4  4  5(8원의 경우의 수)
				 1(2원1개 1원 1개)
				   (2원짜리 1개, 2원 1개 1원 2개)
				   		5원에서 2원을뺀 3의 경우에 수가 들어옴
		5  0  0  0  0  1  1  2  2  3  4
						(6에서 5뺸 1의 경우의수)
		합계       2  2  3  4  5  5  7  8  10
		어떤 경우의수를 구할떄 그 앞수가 구했던 수를 이용하므로 DP문제임 */
		
		//백준에서 메모리 제한이 4mb라 이차배열이 아니라 일차배열로 접근
		int coin[]=new int[101];//코인의 가치 저장
		int dp[]=new int[10001];//total 수를 저장(결과값)
		
		Scanner scan = new Scanner(System.in);
		int numCoin = scan.nextInt();
		int money = scan.nextInt();
		
		for(int i = 1;i<=numCoin;i++) {
			coin[i]=scan.nextInt();
		}
		dp[0]=1;//dp 풀때 답을 아는 부분은 미리 기재 (나자신으로 빼는 경우는 항상 1이기 떄문, 1-1, 2-2, 5-5인 경우)
		for(int i=1;i<=numCoin;i++) {//코인의 종류만큼 도는것
			for(int j=coin[i];j<=money;j++) {//머니차수일때 total을 갱신
				dp[j]+=dp[j-coin[i]];
			}
		}
		System.out.println(dp[money]);
	}
}

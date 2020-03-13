package _41_Make1_DP;

import java.util.Scanner;

/*정수 X에 사용할 수 있는 연산은 다음과 같이 세가지 이다.
1. X가 3으로 나누어 떨어지면, 3으로 나눈다
2. X가 2로 나누어 떨어지면, 2로 나눈다.
3. 1을 뺀다
정수 N이 주어졌을 떄, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다.
연산을 사용하는 횟수의 최소값을 출력하시오
입력: 
2
출력:
1
입력:
10
출력:
3
백준 1463*/

public class Main {
	//이 배열에 저장할 값이 젤 중요
	static int[] ans = new int [1000001];//정답을 받을 배열 10의 6승까지 들어온다고 했기 떄문에 이렇게 함
	//이미 계산한 값들을 담아둠으로써 속도가 빨라짐
	
	//1로 만들기 최소값 구하기
	//3 나누고 (나누어 떨어질떄)
	//2 나누고
	//1 뺴고
	//10은 3
	public static void main(String[] args) {
		//DP를 할때는 값을 아는 부분은 초기화를 해줘야 편함
		ans[2]=1;
		ans[3]=1;//3을 1로 만드는데 최소수는 1번이다
		//ans[4]=2;
		//1로 먼저 빼서 3에서 시작함 -> 총 2번
		//2로 나눠서 2가 되는 법 -> 총 2번
		//ans[5]=3; 
		//1을 빼면 4(2) ->3번
		//ans[6]=2;
		//1빼면 5(+1) +3번 => 총 4번
		//2로 나누면 3(+1번) => 2번
		//3으로 나누면 2=> 총 2번
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for(int i=4;i<=1000000;i++) { //10의 6승까지 포문 돌림, 4부터하는 최소연산 구함
			int a = 99999, b=99999, c=99999;//맥시멈값 초기화
			for(int w=1;w<=3;w++) {//1로 한번 빼고고 2로 나눠보고 3으로 나눠보는 순서(안나눠지는 값이 있으므로 1부터 뺌)
				if(w==1) {
					a=ans[i-1];
				}else if(w==2) {
					if(i%2==0) {
						b=ans[i/2];
					}
				}else if(w==3) {
					if(i%3==0) {
						c=ans[i/3];
					}
				}
			}
			int min =min(a,b,c);//a,b,c중에 최소값을 구해서 갱신
			ans[i]=1+min;//위에 포문을 도는게 (1로 한번 빼고고 2로 나눠보고 3으로 나눠보는 순서)한번은 연산한거니깐 1을 더함
		}
		System.out.println(ans[input]);
	
	}

	public static int min(int a, int b, int c) {
		if (a < b) {
			if (a < c)
				return a;
			else
				return c;
		} else {
			if (b < c)
				return b;
			else
				return c;
		}
	}

}

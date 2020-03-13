package _40_Make1_Recursive;

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
	
	public static int min=99999999;
	
	public static void doFunc(int num, int way, int cnt) { //이런식으로하면 입력 숫자가 커질수록 느려짐 DP로 동적 프로그래밍 해야함
		if(way==3 && num%3==0) {//3으로 나눠서 떨어진 경우
			cnt++;
			num /= way;
			for(int i=1;i<=3;i++) //메인에서 호출한 것처럼 재귀
				doFunc(num,way,cnt);
		}else if(way==2 && num %2==0) {
			cnt++;
			num /= way;
			for(int i=1; i<=3;i++)
				doFunc(num, way, cnt);
		}else if(num>=2) {//방법이 1일떄
			cnt++;
			num -= 1;
			for(int i=1;i<=3;i++)
				doFunc(num, way, cnt);
		}
		
		if(num==1 && cnt<min) {
			min=cnt; //최소값을 업데이트하여 반환
			return;
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=3;i++) {
			doFunc(n,i,0);
		}
		System.out.println(min);
	}
}

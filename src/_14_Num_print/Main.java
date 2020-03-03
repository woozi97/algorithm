package _14_Num_print;
//입력된 숫자의 개수를 출력하라
//입력:421314218
/*정답
0:0
1:3
2:2
3:1
4:2
5:0
6:0
7:0
8:1
9:0*/
//반복문(for 혹은 while), 배열, %(모듈 연산)
public class Main {
	public static void main(String[] args) {
		int n = 421314218; //421314218 -> 8
							//42131421->1
							//4213142->2
							//0 이 될 때까지
		
		int arr[] = new int[10];//0~9까지 입력된 수를 cnt(카운트)위한 용도
		//int arr[0] = 0;
		//
		//int arr[1] = 3;//값이 몇개 들어가 있냐는 카운트임
		//
		//int arr[4] = 2;
		
		//알고리즘 //10으로 나눈 나머지를 활용하여 하나씩 뺌
		while(n>0) {
			arr[n%10]++; //해당 배열의 값을 하나씩 올려라
			n/=10;
		}
		
		
		//출력
		for(int i=0;i<10;i++) {
			System.out.println(i+" : "+arr[i]);
		}
	}
}

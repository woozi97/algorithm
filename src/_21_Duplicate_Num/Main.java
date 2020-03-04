package _21_Duplicate_Num;
//1~100까지 숫자가 입력될 때 한번이라도 입력되었으면 출력하시오
//입력: 1 2 3 1 1 2 3 4 5 5
//정답: 1 2 3 4 5
//반복문(while,for), if, 배열
public class Main {
	public static void main(String[] args) {
		//이런문제는 일단 배열 잡음
		boolean arr[]=new boolean [101];//101 배열을 또 만드는 이유는 해당 하는 숫자의 인덱스를 매핑시켜서 true값을 주려함
		//boolean의 초기화값은 false임
		int inArr[]=new int [101];
		inArr[0] = 1;
		inArr[1] = 2;
		inArr[2] = 3;
		inArr[3] = 1;
		inArr[4] = 1;
		inArr[5] = 2;
		inArr[6] = 3;
		inArr[7] = 4;
		inArr[8] = 5;
		inArr[9] = 5;
		inArr[10] = 7;
		inArr[11] = 15;
		
		//1 2 3 4 5 7 15
		//값을 구하는 알고리즘
		for(int i=0;i<=100;i++) {
			arr[inArr[i]] = true;//어떤 배열의 index가 특별한 의미를 갖는경우 이렇게 사용함
		}
		
		//출력용
		for(int i=1;i<=100;i++) {
			if(arr[i]) {//true면 출력하라
				System.out.print(i+" ");
			}
		}
	}
}

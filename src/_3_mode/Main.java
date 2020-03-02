package _3_mode;

import java.util.Scanner;

//가장 많이 출현한 수를 출력
//배열, for
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []inputNum = new int[10];
		//10번 입력받기
		for(int i=0;i<10;i++) {
			inputNum[i] = scan.nextInt(); //숫자입력 받을때는 nextInt(), 스트링 받을때는 next(), 스트링에 엔터까지 넣으려면 nextLine()
			
		}
		//사용자 input
		//1 2 2 3 1 4 2 2 4 3
		//2가 4번나와서 최빈수
		//어느 숫자가 몇번 출현했는지 저장할 자료 구조가 필요
		
		int []mode = new int[10];
		// index -> 출현한 수
		// index 값 -> index(출현한 수)가 몇번 나왔는지 저장하는 용도
		
		//mode[3] = 5;//3번 숫자가 5번 출현했다.
		
		//inputNum => 1 2 2 3 1 4 2 2 4 3
		for(int i=0;i<10;i++) {
			mode[inputNum[i]]++;
		}
		//mode[1] ==2
		//mode[2] ==4
		//mode[3] ==2
		//mode[4] ==2
		
		int modeNum=0;//최빈수 초기화
		int modeCnt=0;//최빈수가 나온 횟수
		
		for(int i=0;i<10;i++) {
			if(modeCnt<mode[i]) { //mode[i]의 i는 출현한 숫자이다.
				modeCnt = mode[i];
				modeNum=i;
			}
		}
		System.out.println("최빈수는 "+modeNum+" cnt: "+modeCnt);
	}
}

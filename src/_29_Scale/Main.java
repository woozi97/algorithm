package _29_Scale;

import java.util.Scanner;

//1부터 8까지 차례대로 입력되면 ascending, 8부터 1까지 차례대로입력되면 desecding, 둘다 아니라면 mixed를 출력하시오
//입력 1 2 3 4 5 6 7 8
//출력 ascending
//입력 8 7 6 5 4 3 2 1
//출력 descending
//입력 8 1 7 2 6 3 5 4
//출력 minxed 
//백준 2920번
public class Main {
	//오름차순인지 내림차순인지 판별하는 메서드
	public static void distinc(int input[]) {
		boolean aFlag=true;
		boolean bFlag=true;
		if(input[0]!=1) {
			aFlag=false;
		}
		for(int i=1;i<input.length-1;i++) {//배열은 0부터 있으므로   array에 할당된 길이를 벗어날 수 있으므로 input.length-1임
			if(input[i]-input[i+1] != -1) {
				aFlag=false;//오름차순이 아니다
				break;//for문 탈출
			}
		}
		
		if(input[0]!=8) {
			bFlag=false;
		}
		for(int i=1;i<input.length-1;i++) {
			if(input[i]-input[i+1] != 1) {
				bFlag=false;
				break;
			}
		}
		if(aFlag)//true이면
			System.out.println("ascending");
		else if(bFlag)
			System.out.println("descending");
		else//둘다 false이면
			System.out.println("mixed");
			
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input[]=new int[8]; 
		for(int i=0;i<input.length;i++) {
			input[i]=scan.nextInt();//8개 음계 받음
		}
		distinc(input);
	}
}

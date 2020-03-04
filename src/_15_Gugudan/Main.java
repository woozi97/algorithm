package _15_Gugudan;
//구구단 시작 s부터 f단까지 입력받아 아래와 같이 출력하시오
//입력 2 3 
// 2*1=2 3*1=3
//반복문 while, for
public class Main {
	public static void main(String[] args) {
		int s = 2;
		int f = 5;
		//2~5 출력
		
		for(int i=1;i<=9;i++) {//바깥쪽에 행이 와야함(1~9가 고정됨) 고정되는것이 밖
			for(int dan=s;dan<=f;dan++) {//안쪽에 단이 와야함
				System.out.printf("%2d * %2d = %3d",dan,i,dan*i);
			}
			System.out.println();
		}
	}
}

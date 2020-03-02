package _8_factorial;
//입력된 수의 팩토리얼을 구하시오
//5
//120
//반복문(for, while)
public class Main {
	public static void main(String[] args) {
		int inputNum=5;
		//5!= 5*4*3*2*1
		int accNum=1;//팩토리얼은 곱하기이기때문에 1로 초기화해야함
		//올라가는 방식
		for (int i = 1; i <= inputNum; i++) {
			accNum*=i;
		}
		
		System.out.println(accNum);
		
		accNum=1;
		//내려오는 방식
		for(int i=inputNum;i>=1;i--) {
			accNum*=i;
		}
		System.out.println(accNum);
	}
}

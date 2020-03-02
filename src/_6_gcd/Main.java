package _6_gcd;

//입력된 두 수의 최대 공약수를 구하시오
//반복문(for, while), if
public class Main {
	public static void main(String[] args) {
		int num1, num2;
		num1 = 30;
		num2 = 20; // 두수중에 어떤 수가 큰지 미리 판별해야함
		
		int small;
		int big;
		
		if(num1>num2) {
			big=num1;
			small=num2;
		}
		else {
			big=num2;
			small=num1;
		}
		
		int gcd=1;//최대공약수 1로 초기화
		
		for(int i=1;i<=small;i++) {//나누는 수는 작은수까지가 한계
			if(big%i==0&&small%i==0)
				gcd=i;//최대공약수는 큰 수로 갱신됨
		}
		System.out.println("최대공약수는 "+gcd);
		
		
	}
}

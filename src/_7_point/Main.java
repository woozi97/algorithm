package _7_point;

//입력된 수가 소수인지 판별하시오
//13
//정답:13은 소수입니다.
//반복문(for, while), if
public class Main {
	public static void main(String[] args) {
		int num=20;
		//소수 1과 자기자신을 제외하고 나누어 떨어지는 약수가 있으면 -> 소수가 아님
		//소수 = 1과 자기자신만 나누어 떨어지는 경우
		boolean isPrimeNumber=true;
		
		for(int i=2;i<=num/2;i++) {//num-1까지 올 필요없이 절반 까지만 해도됨
			if(num%i==0) {
				//primeNumber(소수)가 아니다
				isPrimeNumber=false;
			}
		}
		if(isPrimeNumber) {
			System.out.println(num+"은 소수입니다.");
		}
		else {
			System.out.println(num+"은 소수가 아닙니다.");
		}
	}
}

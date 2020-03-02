package _9_plus;
//입력된 수의 각 자릿수 합을 구하시오
//1242
//9
//반복문(for, while)
public class Main {
	public static void main(String[] args) {
		int inputNum=42802;
		int accSum=0;

	//1232=>123=>12=>1=>0
	//2		3	2 1 ->8 //10으로 나눴을때 나머지로 뒤에서부터 한자리씩 알아냄

		while(inputNum>0) {
			accSum += inputNum%10;//나머지를 accSum에 더함
			inputNum/=10; //inputNum이 123이 됨
		}
		System.out.println(accSum);
	}
}

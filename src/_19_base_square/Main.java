package _19_base_square;
//다음입력 n의 m승의 결과를 출력하시오
//입력: 5 3
//정답 5의 3승인 125
//반복문(while,for)
public class Main {
	public static void main(String[] args) {
		int n =5;
		int m = 7;
		int res=1;//결과값이 들어갈 수, 곱하기 이기때문에 1이 초기화에 적합
		
		for(int i=0;i<m;i++) { //0승은 1이므로 0부터 시작
		res *= n; //5를 m번만큼 곱하면 됨	
		}
		System.out.println(res);
		
	}
}

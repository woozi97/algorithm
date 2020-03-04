package _20_369;
//100까지 369게임을 아래와 같이 진행하시오
//정답: 1 2 짝 4 5 짝~~~ 짝 짝 짝짝 100
//반복문(while, for), if, Method
public class Main {
	
	//각 수에 3, 6, 9가 몇개들어있는지 체크하는 메서드
	public static int getNum(int i) {
		int j=0;// 3, 6, 9를  카운트해주는 변수
		
		//1의 자리수를 추출하여 3, 6, 9 인지 확인
		while(i>0) {
			if(i%10==3||i%10==6||i%10==9)
				j++;
			i/=10;
		}
		return j;
	}
	
	//static 메서드 안에서는 static 메서드만 사용할 수 있으므로 static 메서드를 만들어서 활용
	public static void main(String[] args) {
		int n =100;
		
		for(int i =1 ;i<=n;i++) {
			int cnt=getNum(i); //3, 6, 9 가 몇개 포함되어있는지 넘어옴
			if(cnt ==0) {
				System.out.print(i+" ");
			}
			else {
				for(int l=0;l<cnt;l++) {
					System.out.print("짝");
				}
				System.out.print(" ");
			}
		}
	}
}

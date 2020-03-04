package _16_Star;
//다음 입력 n을 받아 아래와 같은 *을 출력하시오
//입력: 5
/*정답
* 0행
**
***
****
*****///n-1행까지
//반복문(while, for)
public class Main {
	public static void main(String[] args) {
		int n=5;
		//0행에 1개 // 각행에 +1만큼 별이 출력됨
		//행을 옮기는 for문 필요 //행마다 별을 찍는 for 필요 - 총2개 for가 중첩되야함
		for(int i=0;i<n;i++) {//행으로 둠
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

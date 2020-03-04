package _17_Star2;
//다음 입력 n을 받아 아래와 같은 *을 출력하시오
//입력: 5
/*정답
***** - 0행엔 공백이 없음
 **** -1번행은 공백 한개
  *** - 2번행은 공백 두개
   **
   	*
 */
//반복문(while, for), if
public class Main {
	public static void main(String[] args) {
		int n =5;
		
		//행이동 for, 별찍는 열 for(공백찍음)
		for(int i=0;i<n;i++) { //행은 i, 열은 j로 정의, 0행엔 빈칸이 없고 1행엔 한개 있으니 i와 j를 활용
			for(int j=0;j<n;j++) {
				if(i>j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}

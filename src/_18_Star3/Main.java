package _18_Star3;
//다음 입력 n을 받아 아래와 같은 *을 출력하시오
//입력: 5
/*정답
    *
   **
  ***
 ****
*****
*/
//반복문(while, for), if
public class Main {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<n;i++) {//행 //0행에 4개 공백 나와야함
			for(int j=0;j<n;j++) {
				if(i<n-(j+1)) {//i가 0일떄 5-(4+1) 까지 가면 아래 else구문 실시
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


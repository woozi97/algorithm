package _10_Num_Rectangle;
//입력된 수(N)만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
//4
//정답
/* 1 2 3 4
   5 6 7 8
   9 10 11 12
   13 14 15 16*/
//중첩 반복문(for 혹은 while)
public class Main {
	public static void main(String[] args) {
		int n = 5;
		/* n =3;
		1 2 3
		4 5 6
		7 8 9*/
		int num=1;
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++ ) {//안쪽의 for가 열
				System.out.printf("%4d",j*(n)+i+1); //%4d는 앞에 4칸 공백잡고 나타나는 것(print를 쓰면 안예뻐서) , num 넣고 num++해도 됨
				//num++;
				//System.out.print(j*(n)+i+1+" ");//뒤에 공백들어가서 안예쁘게 나옴
			}
			System.out.println();//열이 끝났을때 한번씩 엔터해줌
		}
	}
}

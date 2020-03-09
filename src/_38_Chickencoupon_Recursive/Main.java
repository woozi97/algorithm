package _38_Chickencoupon_Recursive;
//강민이는 치킨 한마리를 주문할 수 있는 치킨쿠폰 n장이 있다. 
//치킨 한마리를 시키면 도장을 하나씩 찍어주는데 도장을 k개 모으면 치킨 쿠폰 한장으로 교환할 수 있다.
//강민이가 지금 갖고 있는 치킨 쿠폰으로 치킨을 최대 몇 마리나 먹을 수 있는지 구하여라.
//입력: n k
//출력: 정답 //백준 1673번
/*예제입력
4 3
10 3 //3마리 받고 또 도장 3개가 되서 1마리추가
100 5//100개먹고 100/5=20 20마리, 20/5=4마리

출력
5
14
124*/

import java.util.Scanner;

public class Main {
	
	public static void doFunc(int coupon, int stamp, int k, int ans) {
		if(coupon>0) {//쿠폰으로 계산
			coupon--;
			stamp++;
			ans++;
			doFunc(coupon,stamp, k,ans); //coupon이 0이상인 동안 계속 실행됨
			return;//여기 리턴문 주석걸면 답이 2번 나옴
		}else if(stamp>0) {//쿠폰다쓰면 스탬프로 계산
			if(stamp/k>0) {
				stamp -= k;
				coupon++;//여기서 치킨수를 바로 올리지 않고
				doFunc(coupon,stamp,k,ans);//재귀를 다시 보내서 치킨수를 올림
			}
		}
		//위에 리턴이 없으면 둘다 아래 if를 타게되어 두번 출력하므로 한쪽을 막는 return이 필요했음
		if(coupon ==0 && stamp/k==0) {//쿠폰도 다썼고, 교환가능한 스탬프도 없을때가 정답이다.(재귀함수로 구현하기에 적합하진 않음. 경우가 여러가지라서)
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		int k;
		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int coupon =n;
		
		doFunc(coupon, 0,k,0);//두번째 0은 가진 스탬프수, 마지막 0은 먹을 치킨수
	}

}

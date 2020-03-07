package _26_Reverse_Num;

/*상수는 수를 다르낫람과 다르게 거꾸로 읽는다. 예를들어, 734와 893을 칠판에 적었다면,
상수는 이 수를 437과 389로 읽는다. 따라서 상수는 두 수중 큰 수인 437을 큰수라고 말할 것이다.*/
//입력: 734 893
//출력: 437
//백준 2908번
public class Main2 {
	
	public static int reverseNum(int n) {
		int num=n;
		int arrA[]=new int[3];
		int lenA=0;
		do {
			arrA[lenA]=num%10;
			num/=10;
			lenA++;
		}while(num>0);
		int tranA=0;
		int mux=1;
		for(int i=arrA.length-1;i>=0;i--) {
			tranA+=arrA[i]*mux;
			mux*=10;
		}
		
		return tranA;
	}
	
	
	public static void main(String[] args) {
		int a = 528;
		int b = 893;
		//각 자리수를 배열에 넣음
		
		int tranA=reverseNum(a);
		System.out.println("tranA는 "+tranA);
		int tranB=reverseNum(b);
		System.out.println("tranB는 "+tranB);
		
		if(tranA>tranB) {
			System.out.println(tranA+"- A가 큼");
		}else {
			System.out.println(tranB+"- B가 큼");
		}
	}
}

package _26_Reverse_Num;

/*상수는 수를 다르낫람과 다르게 거꾸로 읽는다. 예를들어, 734와 893을 칠판에 적었다면,
상수는 이 수를 437과 389로 읽는다. 따라서 상수는 두 수중 큰 수인 437을 큰수라고 말할 것이다.*/
//입력: 734 893
//출력: 437
//백준 2908번
public class Main {
	public static void main(String[] args) {
		int a = 528;
		int b = 893;
		//각 자리수를 배열에 넣음
		
		int arrA[]=new int[3];//[0]=4, [1]=3,[2]=7 => 437
		int arrB[]=new int[3];
		
		int lenA=0;
		do {
			arrA[lenA] = a%10; //일의자리 수를 뽑아내서 0번째 배열에 넣음
			a/=10;//10으로 나눠서 a에 넣음
			lenA++;//배열의 index를 높임
		}while(a>0);
		
		int tranA=0;
		//[0]=4 [1]=3 [2]=7
		//400+30+7=>437
		int mux=1;//for문 돌면서 10씩 곱해질 용도
		
		for(int i=arrA.length-1;i>=0;i--) {
			tranA += arrA[i]*mux;
			mux*=10;
		}
		System.out.println("tranA="+tranA);
		
		
		int lenB=0;
		do {
			arrB[lenB] = b%10; //일의자리 수를 뽑아내서 0번째 배열에 넣음
			b/=10;//10으로 나눠서 a에 넣음
			lenB++;//배열의 index를 높임
		}while(b>0);
		
		int tranB=0;
		//[0]=4 [1]=3 [2]=7
		//400+30+7=>437
		mux=1;//for문 돌면서 10씩 곱해질 용도
		
		for(int i=arrB.length-1;i>=0;i--) {
			tranB += arrB[i]*mux;
			mux*=10;
		}
		System.out.println("tranB="+tranB);
	
		
		if(tranA>tranB) {
			System.out.println(tranA);
		}else {
			System.out.println(tranB);
		}
	}
}

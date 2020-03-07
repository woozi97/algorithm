package _26_Reverse_Num;

/*����� ���� �ٸ������� �ٸ��� �Ųٷ� �д´�. �������, 734�� 893�� ĥ�ǿ� �����ٸ�,
����� �� ���� 437�� 389�� �д´�. ���� ����� �� ���� ū ���� 437�� ū����� ���� ���̴�.*/
//�Է�: 734 893
//���: 437
//���� 2908��
public class Main {
	public static void main(String[] args) {
		int a = 528;
		int b = 893;
		//�� �ڸ����� �迭�� ����
		
		int arrA[]=new int[3];//[0]=4, [1]=3,[2]=7 => 437
		int arrB[]=new int[3];
		
		int lenA=0;
		do {
			arrA[lenA] = a%10; //�����ڸ� ���� �̾Ƴ��� 0��° �迭�� ����
			a/=10;//10���� ������ a�� ����
			lenA++;//�迭�� index�� ����
		}while(a>0);
		
		int tranA=0;
		//[0]=4 [1]=3 [2]=7
		//400+30+7=>437
		int mux=1;//for�� ���鼭 10�� ������ �뵵
		
		for(int i=arrA.length-1;i>=0;i--) {
			tranA += arrA[i]*mux;
			mux*=10;
		}
		System.out.println("tranA="+tranA);
		
		
		int lenB=0;
		do {
			arrB[lenB] = b%10; //�����ڸ� ���� �̾Ƴ��� 0��° �迭�� ����
			b/=10;//10���� ������ a�� ����
			lenB++;//�迭�� index�� ����
		}while(b>0);
		
		int tranB=0;
		//[0]=4 [1]=3 [2]=7
		//400+30+7=>437
		mux=1;//for�� ���鼭 10�� ������ �뵵
		
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

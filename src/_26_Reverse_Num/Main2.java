package _26_Reverse_Num;

/*����� ���� �ٸ������� �ٸ��� �Ųٷ� �д´�. �������, 734�� 893�� ĥ�ǿ� �����ٸ�,
����� �� ���� 437�� 389�� �д´�. ���� ����� �� ���� ū ���� 437�� ū����� ���� ���̴�.*/
//�Է�: 734 893
//���: 437
//���� 2908��
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
		//�� �ڸ����� �迭�� ����
		
		int tranA=reverseNum(a);
		System.out.println("tranA�� "+tranA);
		int tranB=reverseNum(b);
		System.out.println("tranB�� "+tranB);
		
		if(tranA>tranB) {
			System.out.println(tranA+"- A�� ŭ");
		}else {
			System.out.println(tranB+"- B�� ŭ");
		}
	}
}

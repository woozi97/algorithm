package _2_Fibonacci;
//�Ǻ���ġ ������ ����϶�
//An=An-1+An-2 //���� ������ ��
//1 1 2 3 5 8 13 21 34... 
//�迭�� for
public class Main {
	public static void main(String[] args) {
		//1��° ��� : �迭�̿�
		int []arr=new int[100];
		
		//An=An-1 + An-2; n>==3, 3�׺��� ����
		//a1 = 1, a2 = 1;
		arr[1] = 1;
		arr[2] = 1;
		//foreach�� ó������ ������ ��ȸ�ϹǷ� �̷����� �Ϲ� for���� ���°��� ����.
		for(int i=3;i<100;i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		//����� �ƴ��� �Ǻ���ġ ���� ���
		for(int i=1;i<=10;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//2��° ���
		//An
		//An=An-1 + An-2; n>==3, 3�׺��� ����
		//a1 = 1, a2 = 1;
		System.out.println();
		//1�� 2���� ���� �ʱ�ȭ�ϰ� ����
		int prevPrevNum = 1;//An-2 �����̶� ����
		int preNum = 1;//An-1, ������
		System.out.print(prevPrevNum+" ");
		System.out.print(preNum+" ");
		
		for(int i=3;i<=10;i++) {
			int nNum = prevPrevNum+preNum;
			System.out.print(nNum+" ");
			prevPrevNum=preNum;
			preNum=nNum; //�������� ���ؾ��ϱ� ������ �������� ���������� ��������
			
		}
		
	}
}

package _21_Duplicate_Num;
//1~100���� ���ڰ� �Էµ� �� �ѹ��̶� �ԷµǾ����� ����Ͻÿ�
//�Է�: 1 2 3 1 1 2 3 4 5 5
//����: 1 2 3 4 5
//�ݺ���(while,for), if, �迭
public class Main {
	public static void main(String[] args) {
		//�̷������� �ϴ� �迭 ����
		boolean arr[]=new boolean [101];//101 �迭�� �� ����� ������ �ش� �ϴ� ������ �ε����� ���ν��Ѽ� true���� �ַ���
		//boolean�� �ʱ�ȭ���� false��
		int inArr[]=new int [101];
		inArr[0] = 1;
		inArr[1] = 2;
		inArr[2] = 3;
		inArr[3] = 1;
		inArr[4] = 1;
		inArr[5] = 2;
		inArr[6] = 3;
		inArr[7] = 4;
		inArr[8] = 5;
		inArr[9] = 5;
		inArr[10] = 7;
		inArr[11] = 15;
		
		//1 2 3 4 5 7 15
		//���� ���ϴ� �˰���
		for(int i=0;i<=100;i++) {
			arr[inArr[i]] = true;//� �迭�� index�� Ư���� �ǹ̸� ���°�� �̷��� �����
		}
		
		//��¿�
		for(int i=1;i<=100;i++) {
			if(arr[i]) {//true�� ����϶�
				System.out.print(i+" ");
			}
		}
	}
}

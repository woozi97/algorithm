package _10_Num_Rectangle;
//�Էµ� ��(N)��ŭ N�� N���� ���·� �������� ��µǴ� ���� �簢���� ����Ͻÿ�
//4
//����
/* 1 2 3 4
   5 6 7 8
   9 10 11 12
   13 14 15 16*/
//��ø �ݺ���(for Ȥ�� while)
public class Main {
	public static void main(String[] args) {
		int n = 5;
		/* n =3;
		1 2 3
		4 5 6
		7 8 9*/
		int num=1;
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++ ) {//������ for�� ��
				System.out.printf("%4d",j*(n)+i+1); //%4d�� �տ� 4ĭ ������� ��Ÿ���� ��(print�� ���� �ȿ�����) , num �ְ� num++�ص� ��
				//num++;
				//System.out.print(j*(n)+i+1+" ");//�ڿ� ������� �ȿ��ڰ� ����
			}
			System.out.println();//���� �������� �ѹ��� ��������
		}
	}
}

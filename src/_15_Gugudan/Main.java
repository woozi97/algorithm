package _15_Gugudan;
//������ ���� s���� f�ܱ��� �Է¹޾� �Ʒ��� ���� ����Ͻÿ�
//�Է� 2 3 
// 2*1=2 3*1=3
//�ݺ��� while, for
public class Main {
	public static void main(String[] args) {
		int s = 2;
		int f = 5;
		//2~5 ���
		
		for(int i=1;i<=9;i++) {//�ٱ��ʿ� ���� �;���(1~9�� ������) �����Ǵ°��� ��
			for(int dan=s;dan<=f;dan++) {//���ʿ� ���� �;���
				System.out.printf("%2d * %2d = %3d",dan,i,dan*i);
			}
			System.out.println();
		}
	}
}

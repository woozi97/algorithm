package _16_Star;
//���� �Է� n�� �޾� �Ʒ��� ���� *�� ����Ͻÿ�
//�Է�: 5
/*����
* 0��
**
***
****
*****///n-1�����
//�ݺ���(while, for)
public class Main {
	public static void main(String[] args) {
		int n=5;
		//0�࿡ 1�� // ���࿡ +1��ŭ ���� ��µ�
		//���� �ű�� for�� �ʿ� //�ึ�� ���� ��� for �ʿ� - ��2�� for�� ��ø�Ǿ���
		for(int i=0;i<n;i++) {//������ ��
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

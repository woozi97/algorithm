package _19_base_square;
//�����Է� n�� m���� ����� ����Ͻÿ�
//�Է�: 5 3
//���� 5�� 3���� 125
//�ݺ���(while,for)
public class Main {
	public static void main(String[] args) {
		int n =5;
		int m = 7;
		int res=1;//������� �� ��, ���ϱ� �̱⶧���� 1�� �ʱ�ȭ�� ����
		
		for(int i=0;i<m;i++) { //0���� 1�̹Ƿ� 0���� ����
		res *= n; //5�� m����ŭ ���ϸ� ��	
		}
		System.out.println(res);
		
	}
}

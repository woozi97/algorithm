package _8_factorial;
//�Էµ� ���� ���丮���� ���Ͻÿ�
//5
//120
//�ݺ���(for, while)
public class Main {
	public static void main(String[] args) {
		int inputNum=5;
		//5!= 5*4*3*2*1
		int accNum=1;//���丮���� ���ϱ��̱⶧���� 1�� �ʱ�ȭ�ؾ���
		//�ö󰡴� ���
		for (int i = 1; i <= inputNum; i++) {
			accNum*=i;
		}
		
		System.out.println(accNum);
		
		accNum=1;
		//�������� ���
		for(int i=inputNum;i>=1;i--) {
			accNum*=i;
		}
		System.out.println(accNum);
	}
}

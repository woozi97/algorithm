package _7_point;

//�Էµ� ���� �Ҽ����� �Ǻ��Ͻÿ�
//13
//����:13�� �Ҽ��Դϴ�.
//�ݺ���(for, while), if
public class Main {
	public static void main(String[] args) {
		int num=20;
		//�Ҽ� 1�� �ڱ��ڽ��� �����ϰ� ������ �������� ����� ������ -> �Ҽ��� �ƴ�
		//�Ҽ� = 1�� �ڱ��ڽŸ� ������ �������� ���
		boolean isPrimeNumber=true;
		
		for(int i=2;i<=num/2;i++) {//num-1���� �� �ʿ���� ���� ������ �ص���
			if(num%i==0) {
				//primeNumber(�Ҽ�)�� �ƴϴ�
				isPrimeNumber=false;
			}
		}
		if(isPrimeNumber) {
			System.out.println(num+"�� �Ҽ��Դϴ�.");
		}
		else {
			System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
}

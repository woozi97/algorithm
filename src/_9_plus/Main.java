package _9_plus;
//�Էµ� ���� �� �ڸ��� ���� ���Ͻÿ�
//1242
//9
//�ݺ���(for, while)
public class Main {
	public static void main(String[] args) {
		int inputNum=42802;
		int accSum=0;

	//1232=>123=>12=>1=>0
	//2		3	2 1 ->8 //10���� �������� �������� �ڿ������� ���ڸ��� �˾Ƴ�

		while(inputNum>0) {
			accSum += inputNum%10;//�������� accSum�� ����
			inputNum/=10; //inputNum�� 123�� ��
		}
		System.out.println(accSum);
	}
}

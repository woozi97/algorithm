package _22_Palindrome;
//�Էµ� ���� �Ӹ�������� �Ǻ��Ͻÿ�.(����� �������� ��Ī�� ���� or ����)
//�Է�: 12321
//����: true
//�ݺ���(while, for), if
public class Main {
	public static void main(String[] args) {
		
		//String���� �޴°� ����. ���ϱ� ��. �ε������� �񱳸� ������ϱ� ���� 1���� 3���� ���ؼ� �������� ���ٵ
		String n="1221";//int n=12321; �ع����� index��°� ���� �ܼ�������
		
		int len = n.length();
		boolean flag=true; //�ѹ��̶� ��ġ���� ������ �縰����� �ƴϹǷ�
		for(int i=0;i<len/2;i++) {//���� ������ �����//Ȧ���ΰ�� ���غκ����ܵ� len/2��
			if(n.charAt(i)!=n.charAt(len-i-1)) {//charAt �ش� �ε����� ���� ��ȯ//�迭�̶� -1����
				flag=false;
			}
		}
		System.out.println(flag);
		
		
		
	}
}

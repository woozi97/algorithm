package _23_Reverse;
//�Էµ� ���ڿ��� ����� ����Ͻÿ�
//�Է�: ADEFH
//����: HFEDA
//�ݺ���(while, for), Array
public class Main {
	public static void main(String[] args) {
		String n = "ADEFH123"; //->HFEDA //���ʳ����� ��Ī�ؼ� �ٲٸ� ��������//�ڹٿ��� ��Ʈ�� ��ü���� �ٲٱ�� ��ٷο�
		char str[] = n.toCharArray();//String���� �����ϱ� ��ٷο� char������ �Ͻ������� �ٲ�
		char tmp;
		System.out.println(n);
		
		int len = str.length;
		
		for(int i=0;i<len/2;i++) {
			tmp = str[i]; //�������Ļ��
			str[i]=str[len-i-1];
			str[len-i-1]=tmp;
		}
		//str �� ��������� charArray��, �ٽ� String���� �����ؾ���
		
		n=new String(str);
		System.out.println(n);
		
	}
}

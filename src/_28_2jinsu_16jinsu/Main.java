package _28_2jinsu_16jinsu;
//�Է¹��� 10������ n������ ��ȯ��Ű�ÿ�
//�Է��� 19 16(19�� 16������ ǥ��)
//��� 13
public class Main {
	public static void main(String[] args) {
		//�پ��� ���� ��ȭ�� ���⶧���� ������ �迭 �ʿ� 
		char n[]=new char[100]; //10�� A, 11�� B...F �� �Ǳ� ������ ĳ���� �迭 ���
		
		int num=200;
		int jinsu=8;
		
		int i=0;
		while(num>0) {
			int tmp=num%jinsu;//�������� �ϴ� ���� ������ �������� tmp�� ����
			//n�迭�� ���������� ���������� ��ȯ���������
			if(tmp>=10&&tmp<=15) { //�ش� if�� ������ 16���������� ����, �� ū ������ �ϰ������� 15�� ����
				n[i]=(char)('A'+(tmp-10)); //10�� A 11�� B, tmp�� 11�̶�� tmp-10�ؼ� 1, A+1�ϸ� �ƽ�Ű�ڵ�� B�� ��
			}
			else { //16���� ������ 1�̻��� �Ǵ� ���ڵ�
				n[i]=(char)('0'+tmp);//tmp�� int���̶� ���������� array�� �������� ���� 0�� �����ָ� tmp�� �ش��ϴ� ������ ���ڷ� �ٲ�
			}
			
			num/=jinsu; //������ȯ�� �ش� ���ڸ� ������ �����Ŀ��� ������ ����
			i++;
		}
		//�Ųٷ� ���
		for(;i>=0;i--) {//for���� �ʱ�ȭ int i =�� ������ �����Ͽ���.
			System.out.print(n[i]);
		}
	}
}
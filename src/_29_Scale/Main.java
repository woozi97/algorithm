package _29_Scale;

import java.util.Scanner;

//1���� 8���� ���ʴ�� �ԷµǸ� ascending, 8���� 1���� ���ʴ���ԷµǸ� desecding, �Ѵ� �ƴ϶�� mixed�� ����Ͻÿ�
//�Է� 1 2 3 4 5 6 7 8
//��� ascending
//�Է� 8 7 6 5 4 3 2 1
//��� descending
//�Է� 8 1 7 2 6 3 5 4
//��� minxed 
//���� 2920��
public class Main {
	//������������ ������������ �Ǻ��ϴ� �޼���
	public static void distinc(int input[]) {
		boolean aFlag=true;
		boolean bFlag=true;
		if(input[0]!=1) {
			aFlag=false;
		}
		for(int i=1;i<input.length-1;i++) {//�迭�� 0���� �����Ƿ�   array�� �Ҵ�� ���̸� ��� �� �����Ƿ� input.length-1��
			if(input[i]-input[i+1] != -1) {
				aFlag=false;//���������� �ƴϴ�
				break;//for�� Ż��
			}
		}
		
		if(input[0]!=8) {
			bFlag=false;
		}
		for(int i=1;i<input.length-1;i++) {
			if(input[i]-input[i+1] != 1) {
				bFlag=false;
				break;
			}
		}
		if(aFlag)//true�̸�
			System.out.println("ascending");
		else if(bFlag)
			System.out.println("descending");
		else//�Ѵ� false�̸�
			System.out.println("mixed");
			
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input[]=new int[8]; 
		for(int i=0;i<input.length;i++) {
			input[i]=scan.nextInt();//8�� ���� ����
		}
		distinc(input);
	}
}

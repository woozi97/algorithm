package _30_Plus_Minus;

import java.util.Scanner;

//�Էµ� ���ڱ��� +�� -�� ���ʴ�� �ݺ��Ͻÿ�
//�����Է� : 9
//���: 1+2-3+4-5+6-7+8-9
public class Main {
	public static void main(String[] args) {
		int until;
		boolean flag=true;
		
		Scanner scan = new Scanner(System.in);
		until = scan.nextInt();
		
		for(int i=1;i<=until;i++) {//i�� 1���� �����ϹǷ� 1�� �ʱ�ȭ
			if(i ==until) {
				System.out.println(i);
				break;//������ �ڿ� +�� -�� �ȳ����� �ϰ� �����Ƿ� for�� Ż���ϰ� ��
			}
			if(flag) {
				System.out.print(i+"+");
				flag=!flag;
			}
			else {
				System.out.print(i+"-");
				flag=!flag;
			}
		}
	}
}

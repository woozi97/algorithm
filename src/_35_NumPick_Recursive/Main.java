package _35_NumPick_Recursive;

import java.util.Scanner;

//�Էµ� ���� ���� �ڸ������� ����Ͻÿ�
//�Է�: 2312 -> 10���� ������ ���� ì��� 
/*����:
2
3
1
2*/
//���, Recursive function
public class Main {
	public static void extract(int N) {
		
		//Ż������
		if(N/10==0) {
			System.out.println(N);
			return;
		}
		extract(N/10);//extract(123) extract(12) extract(1)//Ż������ ������ ������ Ǯ���鼭 ��� ���۵�
		System.out.println(N%10);
		//1 -> extract(1) ->1
		//2 -> extract(12) ->�������� 2
		//3 -> extract(12) ->������ 3
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input=scan.nextInt();
		extract(input);
	}
}

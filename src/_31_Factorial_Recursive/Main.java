package _31_Factorial_Recursive;

import java.util.Scanner;

//�Էµ� ���� ���丮���� ���Ͻÿ�
//�Է�: 5
//����: 120
//���(Recursive function)
public class Main {
	//����Լ��� Ż������ �ۼ��� �߿�
	public static int calFact(int i) {
		if(i==1) {
			return 1;
		}
		return i*calFact(i-1); //������ ������ ������ Stackoverflow ������
	}
	//3*2
	//	2*1
	//	=1
	//->3*2*1
	
	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		input=scan.nextInt();
		
		int ans=0;
		ans=calFact(input);
		System.out.println(ans);
	}
}

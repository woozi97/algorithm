package _32_Plus_Recursive;

import java.util.Scanner;

//�Էµ� �� �������� ���� ���Ͻÿ�
//�Է�: 1 4
//���: 10
//���, Recursive function
public class Main {
	//1 3 => 1+2+3=6
	public static int calAccSum(int start, int end) {
		//Ż������
		if(start==end) {
			return end;//start�� ��ȯ�ص��� �����Ƿ�
		}
		return start+calAccSum(start+1, end); //����Լ��� return�� �������� Ż�������� ���´�.
		//1, 3 =>return 1+calAccSum(2,3);
		//						2+calAccSum(3,3)
		//								3
		//			������ 1+2+31
		
		
	}
	
	public static void main(String[] args) {
		int start;
		int end;
		Scanner scan = new Scanner(System.in);
		
		start = scan.nextInt();
		end = scan.nextInt();
		
		int ans=0;
		ans=calAccSum(start, end);
		System.out.println("acc sum = "+ans);
		
		
	}
}

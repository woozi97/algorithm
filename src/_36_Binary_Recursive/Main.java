package _36_Binary_Recursive;

import java.util.Scanner;

//�Էµ� ���� �������� ��ȯ�ϼ���
//17
//���� 10001
//���, Recursive function
public class Main {
	//17
	//8...1
	//4...1
	//2...1
	//1...0 ->10111�̶�� ����
	public static void decToBin(int N) {
	//Ż������, ��� 2�� �����ٰ� ���� 0�̸� Ż�� 
		if(N/2==0) {
			System.out.print(N);
			return;
		}
		decToBin(N/2); //2�� ���� ������ ��� ����Լ� ȣ��
		System.out.print(N%2);
		//����Լ��� Ż�����Ǻ��� ������ Ǯ���鼭 ����
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		decToBin(input);
	}
}

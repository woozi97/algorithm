package _34_Fibonachi_Recursive;

import java.util.Scanner;

//�Էµ� ���� �Ǻ���ġ ���� ���Ͻÿ�
//6
//���� 8(1->1->2->3->5->8)
//���, Recursive function
public class Main {
	public static int fibo(int N) {
		
		if(N==1) {
			return 1;
		}
		if(N==2) {
			return 1;
		}
		
		
		return fibo(N-1)+fibo(N-2);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		
		int ans = fibo(N);
		System.out.println(ans);
	}
}

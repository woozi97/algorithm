package _40_Make1_Recursive;

import java.util.Scanner;

/*���� X�� ����� �� �ִ� ������ ������ ���� ������ �̴�.
1. X�� 3���� ������ ��������, 3���� ������
2. X�� 2�� ������ ��������, 2�� ������.
3. 1�� ����
���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�.
������ ����ϴ� Ƚ���� �ּҰ��� ����Ͻÿ�
�Է�: 
2
���:
1
�Է�:
10
���:
3
���� 1463*/
public class Main {
	
	public static int min=99999999;
	
	public static void doFunc(int num, int way, int cnt) { //�̷��������ϸ� �Է� ���ڰ� Ŀ������ ������ DP�� ���� ���α׷��� �ؾ���
		if(way==3 && num%3==0) {//3���� ������ ������ ���
			cnt++;
			num /= way;
			for(int i=1;i<=3;i++) //���ο��� ȣ���� ��ó�� ���
				doFunc(num,way,cnt);
		}else if(way==2 && num %2==0) {
			cnt++;
			num /= way;
			for(int i=1; i<=3;i++)
				doFunc(num, way, cnt);
		}else if(num>=2) {//����� 1�ϋ�
			cnt++;
			num -= 1;
			for(int i=1;i<=3;i++)
				doFunc(num, way, cnt);
		}
		
		if(num==1 && cnt<min) {
			min=cnt; //�ּҰ��� ������Ʈ�Ͽ� ��ȯ
			return;
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=3;i++) {
			doFunc(n,i,0);
		}
		System.out.println(min);
	}
}

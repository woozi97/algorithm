package _13_Num_Rectangle4;
//�Էµ� ��(N)��ŭ N�� N���� ���·� �������� ��µǴ� ���� �簢���� ����Ͻÿ�
/*n=4
1 2 3 4
2 4 6 8
3 6 9 12
4 8 12 16*/
//��ø�ݺ���(for Ȥ�� while), �迭
public class Main {
	public static void main(String[] args) {
		int n=5;
		int arr[][]=new int [n][n];
		//���� �ִ� �κ�
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= (i+1)*(j+1);// ���� ���ļ��ﶧ, i�� j, n �׸��� 1���� ���ؼ� ����
			}
		}
		//����ϴ� �κ�
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

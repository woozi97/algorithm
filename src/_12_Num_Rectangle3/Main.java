package _12_Num_Rectangle3;
//�Էµ� ��(N)��ŭ N�� N���� ���·� �������� ��µǴ� ���� �簢���� ����Ͻÿ�
/*n=4
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16*/
//��ø�ݺ���(for Ȥ�� while), �迭
public class Main {
	public static void main(String[] args) {
		int n=4;
		int arr[][]=new int[n][n];
		
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[j][i]=num;//���� ���� �湮�Ͽ� //j�� ������ ���� i�� ���� ��(���� i�� �����Ǿ� ��j�� �ٲ�鼭 ���η� ���� ä����)
				num++;
				//arr[j][i]=i*n+j+1;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

package _27_Snail;
//�Է� n�� ���� ������ ����� ���ڸ� ����Ͻÿ�
//�Է�: 5
/*��� n*2-1 ��ŭ ������ ��ȯ��
1  2  3  4  5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
*/
public class Main {
	public static void main(String[] args) {
		int n=5;
		int arr[][]=new int[10][10];
		
		int x=0;
		int y=0;
		int num=1;//y.x�� �� ���ڸ� 1�� �ʱ�ȭ
		int f= n;//��� �ݺ��Ǹ� �̵��ϴ°�, ->�δ� 5������ ó���� �����ϹǷ�
		
		for(int i=0;i<2*n-1;i++) {
			switch(i%4) {//4�� ���� ����������
			case 0://������ ���� //0ȸ�� �ش�
				for(int k=0;k<f;k++) {
					arr[y][x]=num;
					x++;
					num++;
				} 
				x--; //x�� 6���� �������Ƿ� 5�� ���󺹱�
				y++;//y�̸� 1 �÷���
				f--;//�̹��� 4���� �����ϹǷ� f�� �ϳ� ����
				break;
			case 1://�Ʒ� ����
				for(int k=0;k<f;k++) {
					arr[y][x]=num;
					y++;
					num++;
				}
				y--;
				x--;
				break;
			case 2://���� ����
				for(int k=0;k<f;k++) {
					arr[y][x]=num;
					x--;
					num++;
				}
				x++;
				y--;
				f--;
				break;
			case 3://���� ����
				for(int k=0;k<f;k++) {
					arr[y][x]=num;
					y--;
					num++;
				}
				y++;
				x++;
				break;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

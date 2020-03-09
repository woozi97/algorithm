package _33_Coloring_Recursive;

//00000
//00110
//00001
//00000
//00100

//0�� ��� 2�� ��ĥ�Ͻÿ�(��, 0�� ��Ե� ��� �����)
/*����
22222
22112
22221
22222
22122*/

public class Main {
	static final int SIZE=5;
	static final int COLOR=2;
	//�̱���
	static int [][]map=
		{{0,0,0,0,0},
		{0,0,1,1,0},
		{0,0,0,0,1},
		{0,0,0,0,0},
		{0,0,1,0,0}};
	//����Լ�, Ż�������� ������ if�� ���������� Ż���(if�� Ż������ �ۼ� ����)
	public static void color(int x, int y) {
		if(map[x][y]!=2) {
			map[x][y]=COLOR;
		}
		//�������� ����
		if(x-1>=0&&map[x-1][y]!=COLOR&&map[x-1][y]!=1) //x-1>=0 ������ ù��° �ٿ��� ������������ �����̸鼭 0�� 2�� �ٲܰǵ�
			//�������� ����� �迭�ٱ����� ���� ����� 0���� Ŭ ��츦 ��
			color(x-1,y);
		//���������� ����
		if(x+1<=SIZE-1&&map[x+1][y]!=COLOR&&map[x+1][y]!=1)//�迭�� 0���� �����ϹǷ� ������-1�ؼ� �迭 ����� �ʰ�
			color(x+1,y);
		//����
		if(y+1<=SIZE-1&&map[x][y+1]!=COLOR&&map[x][y+1]!=1)
			color(x,y+1);
		//�Ʒ���
		if(y-1>=0&&map[x][y-1]!=COLOR&&map[x][y-1]!=1)
			color(x,y-1);
	}
		
	public static void main(String[] args) {
		//���� �� ���
		for(int i=1;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		color(4,4);//0.0���� �����ϴ� ����Լ� 0.0~4.4���� �ƹ��ų� �־��
		//0�� 2�� �ٲ�� ���
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}

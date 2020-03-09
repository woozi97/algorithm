package _37_danjisu_Recursive;
//�Էµ� ������ ���� �� ������ ������� ����Ͻÿ�(33�� ��ĥ�� ����)
/*�Է�:
00011
00001
10000
11000
11011
����:3 //������(1�� ���ִ� ����� ��)
3 5 2 //������ �����
*/
//���, Recursive function
public class Main {
	static final int SIZE=5;
	static final int APART=1;
	
	static int apartCnt=0;//�Ѵ����� �� ����
	static int []houseHold=new int[10]; //�� ������ ����� ����
	
	static int  [][]map=
			{{0,0,0,1,1},
			{0,0,0,0,1},
			{1,0,0,0,0},
			{1,1,0,0,0},
			{1,1,0,1,1}};
	
	public static void doFunc(int y, int x, int apartIndex) {//������� ã��
		//Change color to 0//�˻��� 1�� 0���� �ٲ��� �׷��� ����Լ��� �¿����� �ٽ� �˻����� ����
		map[y][x]=0;
		houseHold[apartIndex]++;//����Ʈ ������ ������� ���� �÷��� //��� ������ ���� �ø� ���ΰ�
		
		if(x-1>=0 && map[y][x-1]==APART) //�����̵�, ����Ʈ ǥ�ð� 1�� �Ǿ������� APART==1
			doFunc(y, x-1, apartIndex); //����Ʈ ���� ��ȣ���� ������
		if(x+1<=SIZE-1&&map[y][x+1]==APART)
			doFunc(y,x+1,apartIndex);
		if(y+1<=SIZE-1 && map[y+1][x]==APART)
			doFunc(y+1,x,apartIndex);
		if(y-1>=0&&map[y-1][x]==APART)
			doFunc(y-1,x,apartIndex);
		//��� 1 �˻��� 0���� �ٲ�� �����
	}
	public static void main(String[] args) {
		//���� �˻�//0.0���� ���
		for (int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				if(map[i][j]==1) { //1�� ������ ����Լ��� �����
					doFunc(i,j,apartCnt);
					apartCnt++; //�߰��ϸ� ����Ʈī��Ʈ�� �ø�//�������� ���⼭ ������
				}
			}
		}
		System.out.println(apartCnt);
		for(int i:houseHold) {
			System.out.print(i+" ");
		}
	}
}

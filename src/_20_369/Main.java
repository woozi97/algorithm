package _20_369;
//100���� 369������ �Ʒ��� ���� �����Ͻÿ�
//����: 1 2 ¦ 4 5 ¦~~~ ¦ ¦ ¦¦ 100
//�ݺ���(while, for), if, Method
public class Main {
	
	//�� ���� 3, 6, 9�� �����ִ��� üũ�ϴ� �޼���
	public static int getNum(int i) {
		int j=0;// 3, 6, 9��  ī��Ʈ���ִ� ����
		
		//1�� �ڸ����� �����Ͽ� 3, 6, 9 ���� Ȯ��
		while(i>0) {
			if(i%10==3||i%10==6||i%10==9)
				j++;
			i/=10;
		}
		return j;
	}
	
	//static �޼��� �ȿ����� static �޼��常 ����� �� �����Ƿ� static �޼��带 ���� Ȱ��
	public static void main(String[] args) {
		int n =100;
		
		for(int i =1 ;i<=n;i++) {
			int cnt=getNum(i); //3, 6, 9 �� � ���ԵǾ��ִ��� �Ѿ��
			if(cnt ==0) {
				System.out.print(i+" ");
			}
			else {
				for(int l=0;l<cnt;l++) {
					System.out.print("¦");
				}
				System.out.print(" ");
			}
		}
	}
}

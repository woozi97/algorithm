package _17_Star2;
//���� �Է� n�� �޾� �Ʒ��� ���� *�� ����Ͻÿ�
//�Է�: 5
/*����
***** - 0�࿣ ������ ����
 **** -1������ ���� �Ѱ�
  *** - 2������ ���� �ΰ�
   **
   	*
 */
//�ݺ���(while, for), if
public class Main {
	public static void main(String[] args) {
		int n =5;
		
		//���̵� for, ����� �� for(��������)
		for(int i=0;i<n;i++) { //���� i, ���� j�� ����, 0�࿣ ��ĭ�� ���� 1�࿣ �Ѱ� ������ i�� j�� Ȱ��
			for(int j=0;j<n;j++) {
				if(i>j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}

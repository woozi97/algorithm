package _18_Star3;
//���� �Է� n�� �޾� �Ʒ��� ���� *�� ����Ͻÿ�
//�Է�: 5
/*����
    *
   **
  ***
 ****
*****
*/
//�ݺ���(while, for), if
public class Main {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<n;i++) {//�� //0�࿡ 4�� ���� ���;���
			for(int j=0;j<n;j++) {
				if(i<n-(j+1)) {//i�� 0�ϋ� 5-(4+1) ���� ���� �Ʒ� else���� �ǽ�
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


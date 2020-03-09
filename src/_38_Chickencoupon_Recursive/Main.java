package _38_Chickencoupon_Recursive;
//�����̴� ġŲ �Ѹ����� �ֹ��� �� �ִ� ġŲ���� n���� �ִ�. 
//ġŲ �Ѹ����� ��Ű�� ������ �ϳ��� ����ִµ� ������ k�� ������ ġŲ ���� �������� ��ȯ�� �� �ִ�.
//�����̰� ���� ���� �ִ� ġŲ �������� ġŲ�� �ִ� �� ������ ���� �� �ִ��� ���Ͽ���.
//�Է�: n k
//���: ���� //���� 1673��
/*�����Է�
4 3
10 3 //3���� �ް� �� ���� 3���� �Ǽ� 1�����߰�
100 5//100���԰� 100/5=20 20����, 20/5=4����

���
5
14
124*/

import java.util.Scanner;

public class Main {
	
	public static void doFunc(int coupon, int stamp, int k, int ans) {
		if(coupon>0) {//�������� ���
			coupon--;
			stamp++;
			ans++;
			doFunc(coupon,stamp, k,ans); //coupon�� 0�̻��� ���� ��� �����
			return;//���� ���Ϲ� �ּ��ɸ� ���� 2�� ����
		}else if(stamp>0) {//�����پ��� �������� ���
			if(stamp/k>0) {
				stamp -= k;
				coupon++;//���⼭ ġŲ���� �ٷ� �ø��� �ʰ�
				doFunc(coupon,stamp,k,ans);//��͸� �ٽ� ������ ġŲ���� �ø�
			}
		}
		//���� ������ ������ �Ѵ� �Ʒ� if�� Ÿ�ԵǾ� �ι� ����ϹǷ� ������ ���� return�� �ʿ�����
		if(coupon ==0 && stamp/k==0) {//������ �ٽ��, ��ȯ������ �������� �������� �����̴�.(����Լ��� �����ϱ⿡ �������� ����. ��찡 ����������)
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		int k;
		int n;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int coupon =n;
		
		doFunc(coupon, 0,k,0);//�ι�° 0�� ���� ��������, ������ 0�� ���� ġŲ��
	}

}

package _24_Average;
//�л����� �������� ������� �Էµȴ�. ����� ���� �л����� ������ ����Ͻÿ�
//�Է�: 7 100 95 90 80 70 60 50 //�Ǿտ� 7�� 7���̶�¶�
//����: 57.143%
//�ݺ���(while, for), if//���� 4344��
public class Main {
	public static void main(String[] args) {
		int in[]= {7,100,95,90,80,70,60,50}; //�迭�� ����
		int sum=0;
		for(int i=1;i<in.length;i++) {
			sum+=in[i];
		}
		double avg=(double)sum/in[0]; //int������ int�� int�� �����Ƿ� �ϳ��� double fh qkRNjdigksek.
		System.out.println(avg);
		
		//��պ��� ���� ��� ���
		int cnt=0;
		for(int i=1;i<in.length;i++) {
			if(in[i]>avg)
				cnt++;
		}
		System.out.println(cnt/(double)in[0]*100); //cnt�� in[0]�� ��� int�� �ۼ�Ʈ�� �� �ȳ���. ���� ĳ���� �ʿ�
	}
}

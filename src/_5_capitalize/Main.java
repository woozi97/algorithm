package _5_capitalize;
//�빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͻÿ�
//�迭, for, if
public class Main {
	public static void main(String[] args) {
		String input = "helloWorlD";
		
		//��� ���ڴ� �ƽ�Ű�ڵ�(10����)�� ����, �Ϲ����� ��Ʈ������ ������ �ƽ�Ű�ڵ�� ������ �����Ƿ� �Ʒ�ó�� toCharArray()�� ��
		char []arr;
		arr=input.toCharArray();//������Ʈ �ϳ��� �� ���ڸ� ������ �� �ְ� ��
		
		System.out.print(arr);
		System.out.println();
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>='a'&&arr[i]<='z') {//�ҹ��� �Ǻ�, ��ҹ��ڳ� �Ǵ��Ҷ��� �ƽ�Ű�ڵ��� Ư������ �̸��̸� �ҹ���/�빮�ڷ� �Ǵ�
				arr[i]=(char) (arr[i]+'A'-'a');//���ͷ� ������ϸ� �ش簪�� int�� �Ǿ (char)ĳ���� �ʿ� //���ݸ�ŭ ���ϸ� �ҹ��ڰ� �빮�ڰ� ��//�빮�� A�� �ҹ��� a���� ŭ, offset(�������ִ� ����) 'a' 'b' ~ 'z' 'A' 'B'
			}
			else if(arr[i]>='A'&&arr[i]<='Z') {
				arr[i]=(char) (arr[i]-('A'-'a'));//�ش� ���ݸ�ŭ ���ָ� �빮�ڴ� �ҹ��ڰ� ��
			}
		}
		
		System.out.print(arr);
		
		
	}
}

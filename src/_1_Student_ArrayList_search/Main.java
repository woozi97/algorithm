package _1_Student_ArrayList_search;

import java.util.ArrayList;
import java.util.Scanner;

//�л������� �����ϰ� �л��̸����� �˻������� �й��� ����ϴ� ���α׷�
//ArraList, foreach, flag(boolean)�̿�

public class Main {
	public static void main(String[] args) {

		// �л� �ν��Ͻ� ����
		Student st1 = new Student("�տ���", "1682");
		Student st2 = new Student("���Ȱ�", "1672");
		Student st3 = new Student("�����", "1813");

		// �л����� ArrayList�� �����϶�, �ڷ����� ���׸�<>�� ���
		ArrayList<Student> list = new ArrayList<Student>();
		// �߰��Ϸ��� ArrayList�� add �޼��带 ��
		list.add(st1);
		list.add(st2);
		list.add(st3);

		// ����� ������ foreach�� ����ؼ� Ȯ��, foreach�� ������ �����ʿ� �̾Ƴ� �÷��� ���, ���ʿ��� �̾Ƴ� �ڷ���
		// �ڹٿ��� foreach���̶�°�, ���� �������� �����ٴ°�
		for (Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("��� �˻��� �ϰ�����ø� y, �����ϰ� �����ø� n");
			String input = scan.next();// �Է¹���

			if (input.equals("y")) {// ���ڿ� �񱳴� equals!
				System.out.println("�˻��� �����մϴ�.");
				String name = scan.next();// �л��̸� �ޱ�
				// if���� �ѹ��� ������ Ȯ���ϰ� �����Ƿ� boolean�� �̿�
				boolean flag = false;
				// foreach�� �л� �̸� ã��
				for (Student stu : list) {// stu�� ArrayList�� ����ִ� �ڷḦ �̾Ƴ��µ�, �̶� getter�� �̿��ؼ� ���� �ʿ�� �ϴ� ���� ��ȸ ����
					if (stu.getName().equals(name)) {
						// ==�� ���ڿ��� ���ϸ� �����ּҸ� ���ϱ� ������, value�� �񱳸� �ϰ�������� equals�� ��
						System.out.println("�ش��ϴ� �л��� �й���:" + stu.getNo());
						// �ѹ��̶� �л��̸��� �־����� flag�� true�� ����//�̷��� boolean���� üũ ���ϸ� �����Ͱ� �ִ¸�ŭ ��ȸ�ϹǷ� ��ȸ���� ������������ �ؾ���
						flag = true;
					}
				}
				//�ѹ��̶� �˻��Ǿ� true�� �Ǿ����� �Ʒ��� ����ȵ�
				if(!flag) { 
					System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
				}

				// �л��̸��� �ִ��� Ȯ��

			} else if (input.equals("n")) {
				break; // ���ѷ��� Ż��
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�."); // ���ѷ��� Ż���ϸ� ����� while�� ����� �̸��� ���Ե�.
	}
}

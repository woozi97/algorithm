package _1_Student_ArrayList_search;

import java.util.ArrayList;
import java.util.Scanner;

//학생정보를 저장하고 학새이름으로 검색했을때 학번을 출력하는 프로그램
//ArraList, foreach, flag(boolean)이용

public class Main {
	public static void main(String[] args) {

		// 학생 인스턴스 생성
		Student st1 = new Student("손오공", "1682");
		Student st2 = new Student("저팔계", "1672");
		Student st3 = new Student("사오정", "1813");

		// 학생들을 ArrayList에 저장하라, 자료형을 제네릭<>에 써라
		ArrayList<Student> list = new ArrayList<Student>();
		// 추가하려면 ArrayList의 add 메서드를 씀
		list.add(st1);
		list.add(st2);
		list.add(st3);

		// 제대로 들어갔는지 foreach로 출력해서 확인, foreach를 쓸때는 오른쪽에 뽑아낼 컬렉션 대상, 왼쪽에는 뽑아낼 자료형
		// 자바에서 foreach문이라는건, 향상된 포문으로 꺼낸다는것
		for (Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("계속 검색을 하고싶으시면 y, 종료하고 싶으시면 n");
			String input = scan.next();// 입력받음

			if (input.equals("y")) {// 문자열 비교는 equals!
				System.out.println("검색을 시작합니다.");
				String name = scan.next();// 학생이름 받기
				// if문을 한번을 탔는지 확인하고 싶으므로 boolean형 이용
				boolean flag = false;
				// foreach로 학생 이름 찾기
				for (Student stu : list) {// stu는 ArrayList에 들어있는 자료를 뽑아내는데, 이때 getter를 이용해서 내가 필요로 하는 값만 조회 가능
					if (stu.getName().equals(name)) {
						// ==로 문자열을 비교하면 참조주소를 비교하기 때문에, value로 비교를 하고싶을때는 equals로 비교
						System.out.println("해당하는 학생의 학번은:" + stu.getNo());
						// 한번이라도 학생이름이 있었으면 flag를 true로 변경//이렇게 boolean으로 체크 안하면 데이터가 있는만큼 조회하므로 조회문을 빠져나가도록 해야함
						flag = true;
					}
				}
				//한번이라도 검색되어 true가 되었으면 아래는 실행안됨
				if(!flag) { 
					System.out.println("해당하는 학생이름이 없습니다.");
				}

				// 학생이름이 있는지 확인

			} else if (input.equals("n")) {
				break; // 무한루프 탈출
			}
		}
		System.out.println("프로그램이 종료되었습니다."); // 무한루프 탈출하면 가까운 while을 벗어나서 이리로 오게됨.
	}
}

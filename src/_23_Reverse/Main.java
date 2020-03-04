package _23_Reverse;
//입력된 문자열을 뒤집어서 출력하시오
//입력: ADEFH
//정답: HFEDA
//반복문(while, for), Array
public class Main {
	public static void main(String[] args) {
		String n = "ADEFH123"; //->HFEDA //양쪽끝끼리 대칭해서 바꾸면 뒤집어짐//자바에서 스트링 객체에서 바꾸기는 까다로움
		char str[] = n.toCharArray();//String에서 변경하기 까다로워 char형으로 일시적으로 바꿈
		char tmp;
		System.out.println(n);
		
		int len = str.length;
		
		for(int i=0;i<len/2;i++) {
			tmp = str[i]; //선택정렬사용
			str[i]=str[len-i-1];
			str[len-i-1]=tmp;
		}
		//str 은 여기까지는 charArray임, 다시 String으로 변경해야함
		
		n=new String(str);
		System.out.println(n);
		
	}
}

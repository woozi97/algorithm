package _5_capitalize;
//대문자는 소문자로, 소문자는 대문자로 변환하시오
//배열, for, if
public class Main {
	public static void main(String[] args) {
		String input = "helloWorlD";
		
		//모든 문자는 아스키코드(10진수)를 가짐, 일반적인 스트링으로 받으면 아스키코드로 변경이 어려우므로 아래처럼 toCharArray()를 씀
		char []arr;
		arr=input.toCharArray();//엘리먼트 하나당 각 문자를 접근할 수 있게 됨
		
		System.out.print(arr);
		System.out.println();
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>='a'&&arr[i]<='z') {//소문자 판별, 대소문자냐 판단할때는 아스키코드의 특정숫자 미만이면 소문자/대문자로 판단
				arr[i]=(char) (arr[i]+'A'-'a');//리터럴 상수로하면 해당값이 int가 되어서 (char)캐스팅 필요 //간격만큼 더하면 소문자가 대문자가 됨//대문자 A가 소문자 a보다 큼, offset(떨어져있는 간격) 'a' 'b' ~ 'z' 'A' 'B'
			}
			else if(arr[i]>='A'&&arr[i]<='Z') {
				arr[i]=(char) (arr[i]-('A'-'a'));//해당 간격만큼 빼주면 대문자는 소문자가 됨
			}
		}
		
		System.out.print(arr);
		
		
	}
}

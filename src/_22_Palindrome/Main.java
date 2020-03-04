package _22_Palindrome;
//입력된 수가 팰린드롬인지 판별하시오.(가운데를 기준으로 대칭인 문자 or 숫자)
//입력: 12321
//정답: true
//반복문(while, for), if
public class Main {
	public static void main(String[] args) {
		
		//String으로 받는게 용이. 비교하기 편리. 인덱스끼리 비교를 해줘야하기 때문 1번과 3번을 비교해서 같은지를 본다등가
		String n="1221";//int n=12321; 해버리면 index라는게 없는 단순숫자임
		
		int len = n.length();
		boolean flag=true; //한번이라도 일치하지 않으면 펠린드롬이 아니므로
		for(int i=0;i<len/2;i++) {//절반 까지만 가면됨//홀수인경우 기준부분제외됨 len/2라서
			if(n.charAt(i)!=n.charAt(len-i-1)) {//charAt 해당 인덱스의 문자 반환//배열이라 -1해줌
				flag=false;
			}
		}
		System.out.println(flag);
		
		
		
	}
}

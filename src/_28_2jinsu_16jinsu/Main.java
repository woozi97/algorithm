package _28_2jinsu_16jinsu;
//입력받은 10진수를 n진수로 변환시키시오
//입려기 19 16(19를 16진수로 표현)
//출력 13
public class Main {
	public static void main(String[] args) {
		//다양한 진수 번화를 쓰기때문에 받을때 배열 필요 
		char n[]=new char[100]; //10은 A, 11은 B...F 가 되기 때문에 캐릭터 배열 사용
		
		int num=200;
		int jinsu=8;
		
		int i=0;
		while(num>0) {
			int tmp=num%jinsu;//나누고자 하는 수를 나누어 나머지를 tmp에 저장
			//n배열이 문자임으로 문자형으로 변환시켜줘야함
			if(tmp>=10&&tmp<=15) { //해당 if문 때문에 16진수까지만 가능, 더 큰 진수로 하고싶으면 15를 변경
				n[i]=(char)('A'+(tmp-10)); //10이 A 11이 B, tmp가 11이라면 tmp-10해서 1, A+1하면 아스키코드상 B가 됨
			}
			else { //16으로 나눠서 1이상이 되는 숫자들
				n[i]=(char)('0'+tmp);//tmp는 int형이라 문자형으로 array에 넣으려면 문자 0을 더해주면 tmp가 해당하는 숫자의 문자로 바뀜
			}
			
			num/=jinsu; //진법변환시 해당 숫자를 나머지 구한후에는 나눠서 변경
			i++;
		}
		//거꾸로 출력
		for(;i>=0;i--) {//for문의 초기화 int i =을 위에서 수행하였다.
			System.out.print(n[i]);
		}
	}
}

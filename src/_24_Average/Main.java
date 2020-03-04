package _24_Average;
//학생수와 점수들이 순서대로 입력된다. 평균을 넘은 학생들의 비율을 출력하시오
//입력: 7 100 95 90 80 70 60 50 //맨앞에 7은 7명이라는뜻
//정답: 57.143%
//반복문(while, for), if//백준 4344번
public class Main {
	public static void main(String[] args) {
		int in[]= {7,100,95,90,80,70,60,50}; //배열에 저장
		int sum=0;
		for(int i=1;i<in.length;i++) {
			sum+=in[i];
		}
		double avg=(double)sum/in[0]; //int나누기 int는 int로 나오므로 하나를 double fh qkRNjdigksek.
		System.out.println(avg);
		
		//평균보다 높은 사람 출력
		int cnt=0;
		for(int i=1;i<in.length;i++) {
			if(in[i]>avg)
				cnt++;
		}
		System.out.println(cnt/(double)in[0]*100); //cnt와 in[0]이 모두 int라 퍼센트가 잘 안나옴. 강제 캐스팅 필요
	}
}

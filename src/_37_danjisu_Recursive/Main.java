package _37_danjisu_Recursive;
//입력된 단지의 수와 각 단지의 세대수를 출력하시오(33번 색칠과 유사)
/*입력:
00011
00001
10000
11000
11011
정답:3 //단지수(1이 모여있는 덩어리로 봄)
3 5 2 //단지의 세대수
*/
//재귀, Recursive function
public class Main {
	static final int SIZE=5;
	static final int APART=1;
	
	static int apartCnt=0;//총단지의 수 측정
	static int []houseHold=new int[10]; //각 단지의 세대수 저장
	
	static int  [][]map=
			{{0,0,0,1,1},
			{0,0,0,0,1},
			{1,0,0,0,0},
			{1,1,0,0,0},
			{1,1,0,1,1}};
	
	public static void doFunc(int y, int x, int apartIndex) {//세대수를 찾음
		//Change color to 0//검색된 1은 0으로 바꿔줌 그래야 재귀함수를 태웠을때 다시 검색되지 않음
		map[y][x]=0;
		houseHold[apartIndex]++;//아파트 단지의 세대수의 값을 올려줌 //몇번 단지에 값을 올릴 것인가
		
		if(x-1>=0 && map[y][x-1]==APART) //왼쪽이동, 아파트 표시가 1로 되어있음요 APART==1
			doFunc(y, x-1, apartIndex); //아파트 단지 번호까지 보냄요
		if(x+1<=SIZE-1&&map[y][x+1]==APART)
			doFunc(y,x+1,apartIndex);
		if(y+1<=SIZE-1 && map[y+1][x]==APART)
			doFunc(y+1,x,apartIndex);
		if(y-1>=0&&map[y-1][x]==APART)
			doFunc(y-1,x,apartIndex);
		//모든 1 검색후 0으로 바뀌면 종료됨
	}
	public static void main(String[] args) {
		//맵을 검색//0.0에서 출발
		for (int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				if(map[i][j]==1) { //1이 나오면 재귀함수가 수행됨
					doFunc(i,j,apartCnt);
					apartCnt++; //발견하면 아파트카운트를 올림//단지수는 여기서 결정됨
				}
			}
		}
		System.out.println(apartCnt);
		for(int i:houseHold) {
			System.out.print(i+" ");
		}
	}
}

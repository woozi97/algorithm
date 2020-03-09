package _33_Coloring_Recursive;

//00000
//00110
//00001
//00000
//00100

//0을 모두 2로 색칠하시오(단, 0은 어떻게든 모두 연결됨)
/*정답
22222
22112
22221
22222
22122*/

public class Main {
	static final int SIZE=5;
	static final int COLOR=2;
	//싱글톤
	static int [][]map=
		{{0,0,0,0,0},
		{0,0,1,1,0},
		{0,0,0,0,1},
		{0,0,0,0,0},
		{0,0,1,0,0}};
	//재귀함수, 탈출조건이 없지만 if에 맞지않으면 탈출됨(if로 탈출조건 작성 가능)
	public static void color(int x, int y) {
		if(map[x][y]!=2) {
			map[x][y]=COLOR;
		}
		//왼쪽으로 진행
		if(x-1>=0&&map[x-1][y]!=COLOR&&map[x-1][y]!=1) //x-1>=0 조건은 첫번째 줄에서 동서남북으로 움직이면서 0을 2로 바꿀건데
			//왼쪽으로 진행시 배열바깥으로 가지 말라고 0보다 클 경우를 줌
			color(x-1,y);
		//오른쪽으로 진행
		if(x+1<=SIZE-1&&map[x+1][y]!=COLOR&&map[x+1][y]!=1)//배열은 0부터 시작하므로 사이즈-1해서 배열 벗어나지 않게
			color(x+1,y);
		//위쪽
		if(y+1<=SIZE-1&&map[x][y+1]!=COLOR&&map[x][y+1]!=1)
			color(x,y+1);
		//아래쪽
		if(y-1>=0&&map[x][y-1]!=COLOR&&map[x][y-1]!=1)
			color(x,y-1);
	}
		
	public static void main(String[] args) {
		//정답 전 출력
		for(int i=1;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		color(4,4);//0.0에서 시작하는 재귀함수 0.0~4.4까지 아무거나 넣어도됨
		//0이 2로 바뀐거 출력
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}

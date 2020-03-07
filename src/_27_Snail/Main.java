package _27_Snail;
//입력 n에 따른 달팽이 모양의 숫자를 출력하시오
//입력: 5
/*출력 n*2-1 만큼 방향이 전환됨
1  2  3  4  5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
*/
public class Main {
	public static void main(String[] args) {
		int n=5;
		int arr[][]=new int[10][10];
		
		int x=0;
		int y=0;
		int num=1;//y.x에 들어갈 숫자를 1로 초기화
		int f= n;//몇번 반복되며 이동하는가, ->로는 5개까지 처음에 가야하므로
		
		for(int i=0;i<2*n-1;i++) {
			switch(i%4) {//4로 나눈 나머지로함
			case 0://오른쪽 방향 //0회때 해당
				for(int k=0;k<f;k++) {
					arr[y][x]=num;
					x++;
					num++;
				} 
				x--; //x가 6까지 가버리므로 5로 원상복구
				y++;//y미리 1 올려둠
				f--;//이번엔 4개로 가야하므로 f를 하나 빼줌
				break;
			case 1://아래 방향
				for(int k=0;k<f;k++) {
					arr[y][x]=num;
					y++;
					num++;
				}
				y--;
				x--;
				break;
			case 2://왼쪽 방향
				for(int k=0;k<f;k++) {
					arr[y][x]=num;
					x--;
					num++;
				}
				x++;
				y--;
				f--;
				break;
			case 3://위쪽 방향
				for(int k=0;k<f;k++) {
					arr[y][x]=num;
					y--;
					num++;
				}
				y++;
				x++;
				break;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

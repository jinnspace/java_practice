package days06;

public class ControlOp_For13 {

	public static void main(String[] args) {
		// 이중 반복문을 이용해서 구구단 1단부터 9단까지 출력하세요
		// 한 개의 단이 출력되는 방향은 세로든 가로든 상관없습니다.
		// 1x1=1 1x2=2 1x3=3 ..... 1x9=9
		// 2x1=2 2x2=4 2x3=6 ..... 2x9 =18
		//...
		//9x1=9 ...9x9 =18
		
		int i,j;
		for(j=1; j<=9; j++) {
			for(i=2; i<=5; i++) {
				System.out.printf("%1dx%1d=%2d ",i,j,j*i);
				
			}
			System.out.println();
		}
		 System.out.println();
			for(j=1; j<=9; j++) {
				for(i=6; i<=9; i++) {
					System.out.printf("%1dx%1d=%2d ",i,j,j*i);
					
		}
				 System.out.println();

			}
			}
}

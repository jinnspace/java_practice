package days06;

public class ControlOp_For12 {

	public static void main(String[] args) {
		
		//이중 반복문 
		int i;
		int j;
		
		for(j=1; j<=10; j++) {
		for(i=1; i<=10; i++) {
			// System.out.printf("#");
			System.out.printf("(%d, %d)", j, i);
		 }	
		System.out.println();
		}
        /* j 가 1일때, i가 1 ~ 10까지 반복
         *  j 가 2일때, i가 1 ~ 10까지 반복
         *  j 가 3일때, i가 1 ~ 10까지 반복
         *  ....
         *  j 가 10일때, i가 1 ~ 10까지 반복
         */
		
	}

}

package days06;

public class ControlOp_For14 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
        System.out.println("\n----------------------------------\n");
        
        for(int i=1; i<=5; i++) { //아래로 내려가는
			for(int j=1; j<=10; j++) { // #가 찍히는 개수
				System.out.printf("#");
			}
			System.out.println();
		}
        System.out.println("\n----------------------------------\n");
        
        for(int i=1; i<=10; i++) { 
			for(int j=1; j<=i; j++) { 
				System.out.printf("#");
			}
			System.out.println();
		}
        /*
         * int k = 11;
        * for(int i=1; i<=10; i++){
        * k ++;
        * for(int j=1; j<=k; j++) {
        *     System.out.printf("#");
        *     }
        *     System.out.println();
        * }
        */
        
        
        System.out.println("\n----------------------------------\n");
       
        
        for(int i=10; i>=1; i--) { 
			for(int j=1; j<=i; j++) { 
				System.out.printf("#");
			}
			System.out.println();
         }
        /* 
         * int k = 11;
         * for(int i=1; i<=10; i++){
         * k --;
         * for(int j=1; j<=k; j++) {
         *     System.out.printf("#");
         *     }
         *     System.out.println();
         * }
         *-----------------------------
         * int k = 11;
         * for(int i=1; i<=10; i++){
         *   for(int j=1; j<=k-i; j++){
         *   System.out.printf("#");
         *   }
         *   System.out.print();
         *   }    
         */
        System.out.println("\n----------------------------------\n");
        
        for(int i=1; i<=10; i++) { 
			for(int j=1; j<=10; j++) { 
				if( j>=i )System.out.printf("#");
				else System.out.printf(" ");
			}
			System.out.println();
        }
        System.out.println("\n----------------------------------\n");
        
        for(int i=10; i>=1; i--) { 
			for(int j=1; j<=10; j++) { 
				if( j>=i )System.out.printf("#");
				else System.out.printf(" ");
			}
			System.out.println();
        }
        System.out.println("\n----------------------------------\n");
        
        //이등변삼각형 만들기
        for(int i=1; i<=10; i++) { 
			for(int j=1; j<=9+i ; j++) {  // 칸의 개수, 10번째 칸에 입력되어야함
				if( j>=11-i   )System.out.printf("#");
				else System.out.printf(" ");
			}
			System.out.println();
        } 
        System.out.println("\n----------------------------------\n");
       } 
	}

//jdk 다시 설치 

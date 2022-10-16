package days06;

import java.util.Scanner;

public class ControlOp_For08 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		    int y, m, d;
		    System.out.printf("년 입력 : ");
		    y = sc.nextInt();
		 
		    System.out.printf("월 입력 : ");
		    m = sc.nextInt();
		    
		    System.out.printf("일 입력 : ");
		    d = sc. nextInt();
		    
		    // 년월일을 입력받아서 해당날짜의 요일을 출력
		    // * 서기 1년 1월 1일(월요일) 부터 입력한 날짜까지 몇일이 지난지 계산하고, 그 날짜수를 7로 나눈 나머지 계산
		    //    계산 결과를 이용해 해당 요일을 출력합니다. 
		    // 1. 1년부터 입력한 년도의 전년도까지 날짜를 계산합니다.
		    // 2. 1월부터 입력한 월의 전월까지 날짜를 합산합니다.
		    // 3. 입력한 일을 합산합니다.
		    // 4. 7로 나눈 나머지로 요일을 계산합니다.
		    
		    // 1. 
		    int days =  365 *(y-1);
		    int i;
		    for( i=1; i<=y; i++) // i<=y-1 로 넣을 경우 반목문 끝
		    if((i%4 ==0) && (i%100 !=0) || (i%400 ==0)) days++;
	       
		    	
		    // 1부터 y-1까지 반복하면서 해당 숫자가 윤년에 해당하는 년도와 같은 숫자라면 days에 1을 더합니다.
            
		    
		    
		    
		    // 입력한 년도가 윤년이라면 아래 switch문의 2월에 해당하는 숫자를 29로 바꿔서 계산합니다.
		    switch(m){
		    case 12: days +=30; 
		    case 11: days +=31;
		    case 10: days+= 30;
		    case 9: days+= 31;
		    case 8: days+=31;
		    case 7: days+=30;
		    case 6: days+=31;
		    case 5: days+=30;
		    case 4: days+=31;
		    case 3: days+=28;
		    if((i%4 ==0) && (i%100 !=0) || (i%400 ==0)) days += 29;
		    else days += 28;
		     case 2: days+=31;
		    case 1: days+=0;
		    
		    }
		     days = days +d ;
      
            int temp = days % 7;
            switch(temp) {
	        case 1: System.out.println("월요일 입니다."); break;
	    	case 2: System.out.println("화요일 입니다.");break;
	        case 3: System.out.println("수요일 입니다.");break;
	        case 4: System.out.println("목요일 입니다.");break;
	        case 5: System.out.println("금요일 입니다.");break;
	        case 6: System.out.println("토요일 입니다.");break;
	        case 0: System.out.println("일요일 입니다.");break;
	    
	}

}
}
package days06;

import java.util.Scanner;

public class Abcd02 {

	public static void main(String[] args) {
		
		// 2번 문제
		// 필요한 변수를 생성합니다 (10개 - 두명의 학생 국어, 영어,수학, 총점 평균)
		// 세과목 두명학생의 점수들 입력받습니다 ( 총 6번 입력. 국어, 영어, 수학 세과목 두명분 입력)
		// 총점 평균 계산
		// printf로 성적표 출력 
		
				int kor1,kor2,eng1,eng2,mat1,mat2,total1,total2;
				double avg1,avg2;
				
				Scanner sc= new Scanner(System.in);
				
				
				System.out.printf("학생 1 국어 점수를 입력해주세요:");
				kor1 = sc.nextInt();
				
				System.out.printf("학생 1 영어 점수를 입력해주세요:");
				eng1 = sc.nextInt();
				
				System.out.printf("학생 1 수학 점수를 입력해주세요:");
				mat1 = sc.nextInt();
				
				total1 = kor1+eng1+mat1;
				avg1 = (kor1+eng1+mat1)/3.0; //total1/3.0
				
				
				System.out.printf("학생 2 국어 점수를 입력해주세요:");
				kor2 = sc.nextInt();
				
				System.out.printf("학생 2 영어 점수를 입력해주세요:");
				eng2 = sc.nextInt();
				
				System.out.printf("학생 2 수학 점수를 입력해주세요:\n");
				mat2 = sc.nextInt();
				
				total2 = kor2+eng2+mat2;
				avg2 = (kor2+eng2+mat2)/3.0; // total2/3.0
				
				//학점 입력
				String grade1, grade2;
				
				if(avg1>=90) grade1="A학점"; // System.out.println("a학점");x
				else if (avg1>=80) grade1="B학점";
				else if(avg1>=70) grade1="C학점";
				else if(avg1>=60) grade1="D학점";
				else grade1="F학점";	//else로 마무리 하는게 좋다.(오류 생길 수 있음)
				
				if(avg2>=90) grade2="A학점";
				else if (avg2>=80) grade2="B학점";
				else if(avg2>=70) grade2="C학점";
				else if(avg2>=60) grade2="D학점";
				else grade2="F학점";	
				
				
				
				
				
				System.out.printf("\t\t###성적표###\n");
				System.out.printf("---------------------------------------------------------\n");
				System.out.printf("번호\t성명\t\t국어\t영어\t수학\t총점\t평균\t학점\n");
				System.out.printf("---------------------------------------------------------\n");
				System.out.printf("%d\t학생1\t\t%d\t%d\t%d\t%d\t%.1f\t%s\n", 1,kor1,eng1,mat1,total1,avg1,grade1);
				System.out.printf("%d\t학생2\t\t%d\t%d\t%d\t%d\t%.1f\t%s\n", 2,kor2,eng2,mat2,total2,avg2,grade2);
				System.out.printf("---------------------------------------------------------");
	}

}

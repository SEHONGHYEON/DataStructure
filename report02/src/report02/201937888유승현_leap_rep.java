package report02;

import java.util.Scanner;

public class leap_rep {

	   public static void main(String[] args) {
	      
	      while(true) {
	      System.out.println("연도를 입력하세요.(단, 0입력시 종료)");
	      Scanner sc = new Scanner(System.in);
	      
	      int year = sc.nextInt();
	      
	      if(year==0) 
	      break;
	      
	      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
	         System.out.println(year + "윤년입니다.");
	      } else {
	         System.out.println(year + "평년입니다.");
	      }

	     }
	   
	   
	}

	
	
}



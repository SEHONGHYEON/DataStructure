package report02;

import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
		
		
		
		System.out.println("구구단을 출력할 숫자를 입력하세요.");
		 Scanner sc = new Scanner(System.in);
	      
	      int num = sc.nextInt();
	      
	    
	     
	      
	     for (int i = 1; i <= 9; i++) {
	    	  
	    	  System.out.println(num + "*" + i + "=" + num*i);
		
		}
	 
	}
	

}

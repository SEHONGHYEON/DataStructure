package report02;

import java.util.Scanner;

public class leap {
	public static void main(String[] args) {
		
		System.out.println("������ �Է��ϼ���.(��, 0�Է½� ����)");
	      Scanner sc = new Scanner(System.in);
	      
	      int year = sc.nextInt();
	
	      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
	         System.out.println(year + "�����Դϴ�.");
	      } else {
	         System.out.println(year + "����Դϴ�.");
	      }

	}
}

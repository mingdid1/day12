package try_catch;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String n1, n2;
//		
//		System.out.println("11 입력");
//		n1 = sc.nextLine();
//		// nextLine() : 개행이 있는지 확인후 넘김
//		
//		System.out.println("22 입력");
//		n2 = sc.next();
//		
//		System.out.println("1. " + n1);
//		System.out.println("2. " + n2);
		
		
		int num;
		while(true) {
			try {
				System.out.println("수 입력: ");
				num = sc.nextInt();
				
				System.out.println("입력 값 : " + num);
				
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("수 입력하세요");
				
			}
		}
	}
}

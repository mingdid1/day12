package thread;

import java.util.Scanner;

class A03 extends Thread{
	public void run() {
		for(;;) {
			System.out.println("내용출력");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str;
		
		A03 a = new A03();
		a.setDaemon(true);
		a.start();
		
		while(true) {
			System.out.println("문자열 입력 : ");
			str = sc.next();
			
			System.out.println("입력한 값 : " + str);
			
			if(str.equals("end")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");
		
		
		
	}
}

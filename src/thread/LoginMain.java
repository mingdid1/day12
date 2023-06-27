package thread;

import java.util.Scanner;

public class LoginMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoginService ls = new LoginService();

		while (true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.탈퇴");
			System.out.println("4.종료");
			System.out.print(">>> ");
			int num = sc.nextInt();

			switch(num) {
			case 1:
				ls.login();
				break;

			case 2:
				ls.submit();
				break;

			case 3:
				ls.delLogin();
				break;

			case 4:
				ls.exitLogin();
				System.exit(0);
			}	
		}

	}
}

package thread;

import java.util.Scanner;

public class LoginService {
	
	LoginDTO dto = new LoginDTO();
	TimeService ts = new TimeService();
	
	Scanner sc = new Scanner(System.in);
	
	public void login() {
		if(dto.getId() == null) {
			System.out.println("저장해주세요");
			return;
		}
		
		System.out.print("로그인 ID : ");
		String id = sc.next();
		System.out.print("로그인 PW : ");
		String pwd = sc.next();
		
		
		if (id.equals(dto.getId())) {
			if (pwd.equals(dto.getPwd())) {
				System.out.println("로그인 성공");
				ts.start();
			}else {
				System.out.println("비밀번호 틀림");
			}
		}else {
			System.out.println("ID 틀림");
		}
	}
	
	public void submit() {

		System.out.print("저장 할 ID: ");
		String pId = sc.next();
		
		if (pId.equals(dto.getId())) {
			System.out.println("중복된 ID입니다");
		}else {
			System.out.print("저장 할 PW: ");
			String pPw = sc.next();
			dto.setId(pId);
			dto.setPwd(pPw);
			System.out.println("회원가입 완료");
		}
	}
	
	public void delLogin() {
		if(dto.getId() == null) {
			System.out.println("저장해주세요");
			return;
		}
		
		System.out.print("탈퇴 ID: ");
		String delId = sc.next();
		if (delId.equals(dto.getId())) {
			System.out.println(dto.getId() + " 탈퇴되었습니다");
			ts.end();
			dto.setId(null);
			dto.setPwd(null);
		}else {
			System.out.println("ID 인증 실패");
			return;
		}
	}
	
	public void exitLogin() {
		ts.total();
	}

	
}

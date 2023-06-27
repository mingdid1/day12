package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class A04 extends Thread{
	
	public void run() {	
		Scanner sc = new Scanner(System.in);
		String str;
		
		while(true) {
			System.out.println("입력: ");
			str = sc.next();
			System.out.println("값 :  "+ str);
		}
	}
	
}

public class MainClass04 {
	public static void main(String[] args) {
		
		A04 a = new A04();
		a.start();
		
		JFrame frame = new JFrame("제목");		// 창 만들기 (title 작성)
		Container c = frame.getContentPane();	// 내용 넣을 곳(장판)
		
		JLabel label = new JLabel("test gui");	// 내용작성
		c.add(label);
		label.setFont(new Font("MS Serif", Font.ITALIC, 32));	// 폰트 설정 (글씨체, 스타일, 크기)
		label.setHorizontalAlignment(JLabel.CENTER);			// 내용 위치
		
		frame.setLocation(1000,200);		// 창 위치 설정
		frame.setPreferredSize(new Dimension(500,200));	// 창 크기 설정(가변적임)
		frame.pack();		// 창 사이즈 설정
		
		
		frame.setVisible(true);			// 창 화면에 만들기
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창을 닫을때 프로그램도 같이 종료 (3 작성해도 같음)
		
		for(int i=0;;i++) {
			label.setText("" + i);
		}
		
	}
}

package api.awt;

import java.awt.*;
import java.awt.event.*;

class Dialog01 extends Dialog{

	private void display() {};
	private void event() {
		ActionListener listener = (ActionEvent e)->{
			
		};
		WindowListener window = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				setVisible(false);//숨김처리
				dispose();//현재 창을 소멸시킴
			}
		};
		addWindowListener(window);
	};
	private void menu() {};
	
	public Dialog01(Frame arg0, String arg1, boolean arg2) {
		super(arg0, arg1, arg2);
		display();
		event();
		menu();
		setLocation(100,200);
		setSize(300,400);
		setResizable(false);
		setVisible(true);
	}
	
}
//Frame을 확장한 클래스
class Window01 extends Frame {
	
	//필요한 인스턴스는 멤버 변수로 구현
//	private Dialog sub = new Dialog(this,"황인빈",false);//true=> 선택 불가능, false=> 선택 가능
	
	private Dialog01 dialog = new Dialog01(this,"황인빈",false);
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		
	}
	/**
	 * 이벤트 처리 코드를 작성하는 메소드
	 */
	
	private void event() {
		
	}
	
	/**
	 * 메뉴 구현 코드를 작성하는 메소드
	 */
	private void menu() {
		
	}
	public Window01() {
		this.display();
		event();
		menu();
//		표시 전에 창과 관련된 다양한 처리를 먼저 수행
		setLocation(100, 200); // x : 100, y : 200
		setSize(500, 400); // 폭 : 300, 높이 : 200
		setTitle("GUI 테스트");
		setResizable(false); // 크기 변경 불가
		setVisible(true); // 화면 표시
	}
}

public class Test01dial {
	public static void main(String[] args) {
		Window01 a = new Window01(); // 창생성
		
	}
}

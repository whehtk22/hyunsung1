package api.awt;

import java.awt.*;
import java.awt.event.*;

//Frame을 확장한 클래스
class Window03 extends Frame {
	
	//필요한 인스턴스는 멤버 변수로 구현
	private Button bt = new Button("버튼");

	/**
	 * 화면 배치를 처리하는 메소드
	 */
	private void display() {
		this.add(bt);//this(창)에 bt를 추가하겠습니다.
		
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
	public Window03() {
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

public class Test03 {
	public static void main(String[] args) {
		Window03 a = new Window03(); // 창생성
		
	}
}

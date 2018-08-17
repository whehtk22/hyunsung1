package api.awt;

import java.awt.*;
import java.awt.event.*;

//Frame을 확장한 클래스
class Window04 extends Frame {
	
	//필요한 인스턴스는 멤버 변수로 구현
	private Button bt = new Button("버튼");

	private Label lb = new Label("라벨 테스트~", Label.RIGHT);
	
	//글꼴 인스턴스
	private Font font= new Font("굴림", Font.PLAIN, 20);
	
	//색상 인스턴스
	private Color color = new Color(255, 0, 0);
	private Color bcolor = new Color(88,218,208);
	
	//커서 인스턴스
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	
	/**
	 * 화면 배치를 처리하는 메소드
	 */
	
	private void display() {
		add(lb);		
		//add(bt);
		lb.setFont(font);
		lb.setForeground(color);//글자색
		//lb.setBackground(bcolor);//배경색
		
		//상수 객체 사용
		lb.setForeground(Color.darkGray);
		lb.setBackground(Color.WHITE);
		
		//커서 설정
		lb.setCursor(cursor);
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
	public Window04() {
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

public class Test04 {
	public static void main(String[] args) {
		Window04 a = new Window04(); // 창생성
		
	}
}

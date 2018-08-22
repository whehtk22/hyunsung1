package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Swing에서 사용하는 Frame : JFrame
 * @author Administrator
 *
 */
class Window05 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
//	TextArea ------> JTextArea : 스크롤바가 사라짐
//	Swing에서는 스크롤 영역 자체를 클래스로 만들어놨음
	private JTextArea area = new JTextArea();
	private JScrollPane pane = new JScrollPane(area);
	
	public Window05() {	
		display();
		event();
		menu();
		
		setTitle("Swing예제");
//		setLocation(100,100);
		setLocationByPlatform(true);//위치를 운영체제에 맡기겠다.
		setSize(400,400);
		setResizable(false);
		setVisible(true);;;;;;;;;;;;;;;
	}
	/**
	 * 화면 구현 메소드
	 */
	public void display() {
		setContentPane(con);//con을 Component 설정 영역으로 등록
		con.setLayout(new BorderLayout());
		con.add(pane);
		//this말고 con에 컴포넌트를 추가
		
	}
	/**
	 * 이벤트 설정 메소드
	 */
	public void event() {
		//awt에서는 WindowEvent를 직접 구현해서 x버튼을 처리
		//-> Swing에서는 옵션을 통해 지정하도록 변경
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//x누르면 프로그램 종료
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x누르면 창 소멸
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);//x누르면 창 숨김
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//사용자 직접 구현
		
		
	}
	/**
	 * 메뉴 구현 메소드
	 */
	public void menu() {
		
	}
}

public class Test05ScrollPane {

	public static void main(String[] args) {
	Window05 window = new Window05();	

	}

}

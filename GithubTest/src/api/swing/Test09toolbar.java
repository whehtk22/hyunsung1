package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Swing에서 사용하는 Frame : JFrame
 * @author Administrator
 *
 */
class Window09 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
	private JToolBar toolbar = new JToolBar();
	private JButton a = new JButton("1번");
	private JButton b = new JButton("2번");
	private JButton c = new JButton("3번");
	private JButton d = new JButton("4번");
	private JButton e = new JButton("5번");
	
	private JToolBar toolbar2 = new JToolBar();
	
	public Window09() {	
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
		con.add(toolbar,BorderLayout.NORTH);
		con.add(toolbar2, BorderLayout.SOUTH);
		toolbar.add(a);
		toolbar.add(b);
		toolbar.add(c);
		toolbar2.add(d);
		toolbar2.add(e);
		toolbar.setFloatable(false);
		toolbar2.setFloatable(false);
		JTextField field = new JTextField(20);
		toolbar2.add(field);
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
	//	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//사용자 직접 구현
	
		
	}
	/**
	 * 메뉴 구현 메소드
	 */
	public void menu() {
	
	}
}

public class Test09toolbar {

	public static void main(String[] args) {
//	스킨 설치 : 창이 켜지기 전에 수행
	try {
		UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedLookAndFeelException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Window09 window = new Window09();	
	
	}

}

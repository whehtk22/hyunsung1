package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Swing에서 사용하는 Frame : JFrame
 * @author Administrator
 *
 */
class Window06 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
//	메뉴
//	MenuBar	---> JMenuBar
//	Menu    ---> JMenu
//	Menu	---> JMenuItem
	private JMenuBar bar = new JMenuBar();
	private JMenu file = new JMenu("파일");
	private JMenuItem exit = new JMenuItem("종료");
	
	public Window06() {	
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
		setJMenuBar(bar);
		bar.add(file);
		file.add(exit);
		
//		단축키 지정을 위해서는 키값을 보관하는 클래스를 알아야 한다.(KeyStroke)
//		KeyStroke altf4 = KeyStroke.getKeyStroke
//				(KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK);//f4와 alt를 동시에 누르는 것
		KeyStroke esc = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
		exit.setAccelerator(esc);
	}
	/**
	 * 이벤트 설정 메소드
	 */
	public void event() {
		//awt에서는 WindowEvent를 직접 구현해서 x버튼을 처리
		//-> Swing에서는 옵션을 통해 지정하도록 변경
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//x누르면 프로그램 종료
//		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x누르면 창 소멸
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);//x누르면 창 숨김
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//사용자 직접 구현
		exit.addActionListener(e->{
			dispose();
		});
		
	}
	/**
	 * 메뉴 구현 메소드
	 */
	public void menu() {
		
	}
}

public class Test06KeyStroke {

	public static void main(String[] args) {
	Window06 window = new Window06();	

	}

}

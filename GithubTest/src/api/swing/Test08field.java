package api.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Swing에서 사용하는 Frame : JFrame
 * @author Administrator
 *
 */
class Window08 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
//	입력창
	private JTextField tf = new JTextField();
	private JPasswordField pf = new JPasswordField();
	private JCheckBox cb = new JCheckBox("동의합니다.");
	private JRadioButton r1 = new JRadioButton("성인");
	private JRadioButton r2 = new JRadioButton("미성년자");
	
	
	public Window08() {	
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
		con.setLayout(new GridLayout(5, 1));
		con.add(tf);
		con.add(pf);
		con.add(cb);
		con.add(r1);
		con.add(r2);
		
//		버튼 그룹을 만들어서 r1,r2가 그룹임을 알려준다.
		r1.setSelected(true);
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
	}
	/**
	 * 이벤트 설정 메소드
	 */
	public void event() {
		//awt에서는 WindowEvent를 직접 구현해서 x버튼을 처리
		//-> Swing에서는 옵션을 통해 지정하도록 변경
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//x누르면 프로그램 종료
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//x누르면 창 소멸
//		this.setDefaultCloseOperation(HIDE_ON_CLOSE);//x누르면 창 숨김
	//	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//사용자 직접 구현
		cb.addItemListener(e->{
			System.out.println(e.getItem());
			System.out.println(e.getID());
			System.out.println(e.getStateChange());
	//		if(e.getStateChange()==ItemEvent.SELECTED) {//상수로 활용, ItemEvent.SELECTED => 1을 의미
		if(cb.isSelected()) {
			System.out.println("체크하셨습니다.");
			}else {
				System.out.println("체크 풀으셨네요.");
			}
		});
		
		
	}
	/**
	 * 메뉴 구현 메소드
	 */
	public void menu() {
	
	}
}

public class Test08field {

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
	Window08 window = new Window08();	
	
	}

}

package api.swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
/**
 * Swing에서 사용하는 Frame : JFrame
 * @author Administrator
 *
 */
class Window03 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
	private JButton bt1 = new JButton("LinBorder");
	private JButton bt2 = new JButton("TitleBorder");
	private JButton bt3 = new JButton("EmptyBorder");
	private JButton bt4 = new JButton("CompoundBorder");
	public Window03() {	
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
		con.setLayout(new GridLayout(2,2));
		con.add(bt1);
		con.add(bt2);
		con.add(bt3);
		con.add(bt4);		
	//LineBorder 선으로 된 테두리
//	Border lineborder = new LineBorder(Color.RED, 2, true);
	Border b1 = BorderFactory.createLineBorder(Color.DARK_GRAY, 5, true);
	Border b2 = BorderFactory.createTitledBorder(b1,"제목");	
	bt1.setBorder(b1);
	bt2.setBorder(b2);
	Border b3 = BorderFactory.createEmptyBorder(20, 20, 20, 20);
	bt3.setBorder(b3);
	Border b4 = BorderFactory.createCompoundBorder(b3,b1);
	bt4.setBorder(b4);
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

public class Test03Border {

	public static void main(String[] args) {
	Window03 window = new Window03();	

	}

}

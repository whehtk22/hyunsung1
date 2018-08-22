package api.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 * Swing에서 사용하는 Frame : JFrame
 * @author Administrator
 *
 */
class Window10 extends JFrame{
	
//	컴포넌트를 배치할 영역을 JPanel로 구현
	private JPanel con = new JPanel();
	
	private JToolBar toolbar = new JToolBar();
	private JButton a = new JButton("알림창");
	private JButton b = new JButton("확인창");
	private JButton c = new JButton("입력창");
	private JButton d = new JButton("색상선택");
	private JButton e = new JButton("파일선택");
	
	public Window10() {	
		display();
		event();
		menu();
		
		setTitle("인빈님의 자바교실");
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
		
		toolbar.add(a);
		toolbar.add(b);
		toolbar.add(c);
		toolbar.add(d);
		toolbar.add(e);
		
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
//		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//사용자 직접 구현
		a.addActionListener(e->{
			//[1] 알림창 : JOptionPane.showMessageDialog()
			JOptionPane.showMessageDialog(con,"알림창 테스트","제목",JOptionPane.QUESTION_MESSAGE);//밖으로 나갈 수 있다.
			JOptionPane.showInternalMessageDialog(con, "알림창 테스트","제목",JOptionPane.PLAIN_MESSAGE);//밖으로 나갈 수 없다.
		});
		
		b.addActionListener(e->{
			int c = JOptionPane.showConfirmDialog(con, "확인창 테스트","제목",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
			System.out.println("c = "+c);
			if(c==0) {
				System.out.println("예 누르셨네요.");
			}else if(c==1) {
				System.out.println("아니요 누르셨네요.");
			}else System.out.println("뭐 눌렀냐");
		});
		c.addActionListener(e->{
			//[3] 입력창 : JOptionPane.showInputDialog()
			String text = JOptionPane.showInputDialog("입력");
			System.out.println("text = "+text);
		});
		d.addActionListener(e->{
			//[4] 색상선택창 : JColorChooser
			Color color = JColorChooser.showDialog(con, "인빈의 교실", Color.LIGHT_GRAY);
			System.out.println("color = "+color);
			if(color !=null) {
				con.setBackground(color);
			}
		});
		e.addActionListener(e->{
			//[5] 파일선택창 : JFileChooser(인스턴스 필요)
			JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
			int c = fc.showOpenDialog(con);
			System.out.println("c = "+c);
			if(c==0) {
				System.out.println("파일 열어줄까?");
				File f = fc.getSelectedFile();//파일을 직접 불러와준다.
				try {
					FileReader rf = new FileReader(f);
					BufferedReader br = new BufferedReader(rf);
					while(true) {
					String line = br.readLine();
					if(line==null)break;
					System.out.println("line ="+line);
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}
	/**
	 * 메뉴 구현 메소드
	 */
	public void menu() {
	
	}
}

public class Test10joptiondialog {

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
	Window10 window = new Window10();	
	
	}

}
